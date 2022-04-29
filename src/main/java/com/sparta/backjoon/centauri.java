package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class centauri {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int n = Integer.parseInt(st.nextToken());


        int cnt = 2;
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int start = Integer.parseInt(str[0]); // 시작점
            int end = Integer.parseInt(str[1]); // 끝점
            cnt++;


        }

    }
}

