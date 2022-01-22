package interview;
import java.util.*;
//https://leetcode.com/problems/n-queens/
public class NQueens {
	 public List<List<String>> solveNQueens(int n) {
	        char board[][] = new char[n][n];
	        for(int i=0;i<n;++i)
	            Arrays.fill(board[i],'.');
	        
	        List<List<String>> res = new ArrayList<>();
	        backtrack(n,board,0,res);
	        
	        return res;
	    }
	    
	    private void backtrack(int n, char[][] board, int row,  List<List<String>> res){
	        if(row==n){
	            res.add(constructBoard(board));
	            return;
	        }
	        for(int col=0;col<n;++col){
	            if(canPlaceQueen(board,row,col)){
	                board[row][col]='Q';
	                backtrack(n,board,row+1,res);
	                board[row][col]='.';
	            }
	        }
	    }
	    
	    private boolean canPlaceQueen(char[][] board, int row, int col){
	        //column check
	        for(int i=row-1;i>=0;--i)
	           if(board[i][col]=='Q')
	               return false;
	        
	        //Diagonal Check
	        for(int i=row-1,j=col-1;i>=0 && j>=0;--i,--j)
	            if(board[i][j]=='Q')
	               return false;
	        
	        //Anti-Diagonal Check
	        for(int i=row-1,j=col+1;i>=0 && j<board.length;--i,++j)
	            if(board[i][j]=='Q')
	               return false;
	        
	        return true;
	    }
	    
	    private List<String> constructBoard(char[][] board){
	        List<String> res = new ArrayList<>();
	        for(int i=0;i<board.length;++i)
	            res.add(new String(board[i]));
	        
	        return res;
	    }
}
//Time Complexity T(n)=O(n)