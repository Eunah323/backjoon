package com.sparta.backjoon;
import java.util.Stack;

class test2 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        //board의 갯수 구하기
        for (int i = 0; i < board.length; i++) {
            count += board[i].length;
        }
        System.out.println(count);
//돌기
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j<board[0].length; j++){
                if (board[moves[i]-1][j] != 0 && ((stack.peek())!=board[moves[i]-1][j]||board[moves[i]-1][j]!=0)){
                    int last = stack.peek();
                    if (board[moves[i]][j] != 0) {
                        stack.push(board[moves[i]][j]);
                    }
                    if(last==stack.peek());{
                        stack.pop();
                        stack.pop();
                        answer+=2;
                    }
                }
            }
        }
        return answer;
    }
}
