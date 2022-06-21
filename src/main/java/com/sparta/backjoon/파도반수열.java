package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반수열 {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i =0;i<N;i++){
            int M = Integer.parseInt(br.readLine());
            Long[] list = new Long[M];
            list[0] = 1L;
            list[1] = 1L;
            list[2] = 1L;
            list[3] = 2L;
            list[4] = 2L;
            for (int j = 5; j < M; j++) {
                if (list[j]==null)
                list[j] = list[j - 5] + list[j - 1];
            }

            System.out.println(list[M - 1]);

        }


    }


}



