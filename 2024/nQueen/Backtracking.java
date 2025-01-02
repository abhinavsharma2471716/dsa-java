package nQueen;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean isSafe(char[][] board, int row, int col){
        //horizontally
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q')
                return false;
        }

        //vertically
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q')
                return false;
        }

        //left upward
        int r=row;
        for(int c= col;c>0 && r>0;c--,r--){
            if(board[r-1][c-1]=='Q')
                return false;
        }

        //left downward
        r=row;
        for(int c= col;c>0 && r<board.length-1; c--,r++){
            if(board[r+1][c-1]=='Q')
                return false;
        }

        //right upward
        r=row;
        for(int c=col;r>0 && c<board.length-1;r--,c++){
            if(board[r-1][c+1]=='Q')
                return false;
        }

        //right downward
        r=row;
        for(int c=col;r<board.length-1 && c<board.length-1;r++,c++){
            if(board[r+1][c+1]=='Q')
                return false;
        }
        return true;
    }

    public void saveBoard(List<List<String>> allBoards, char[][] board){
        String row ="";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q')
                    row+='Q';
                else
                    row+='.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(List<List<String>> allBoards, char[][] board, int row){
        if(row==board.length){
            saveBoard(allBoards, board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                helper(allBoards, board, row+1);
                board[row][col]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(allBoards, board, 0);
        return allBoards;
    }
}