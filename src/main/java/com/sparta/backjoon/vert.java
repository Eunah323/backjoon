package com.sparta.backjoon;


import java.util.Scanner;

public class vert {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            boolean arr[] = new boolean[2 * n + 1];
            arr[0] = true;
            arr[1] = true;
            for (int i = 2; i <= Math.sqrt(2 * n + 1); i++) {
                for (int j = i * i; j < 2 * n + 1; j+=i) {
                    arr[j] = true;
                }
            }
            int answer = 0;
            for (int i = n + 1; i < 2 * n + 1; i++) {
                if (arr[i] == false) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
