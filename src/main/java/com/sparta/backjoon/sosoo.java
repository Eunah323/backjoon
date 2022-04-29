package com.sparta.backjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sosoo {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean arr[] = new boolean[M + 1];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i <= Math.sqrt(M + 1); i++) {
            for (int j = i * i; j < M + 1; j += i) {
                arr[j] = true;
            }
        }
        for (int i = N; i < M + 1; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }


        }
    }
}
