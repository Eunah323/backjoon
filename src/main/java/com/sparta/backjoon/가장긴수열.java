package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴수열 {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nn = new int[N];
        int cnt = 1;
        int max = nn[0];
        for (int i = 0; i < N; i++) {
            nn[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < nn.length - 1; i++) {
            if (nn[0] >= nn[1]) {
                cnt--;
//                max = nn[1];
            }
        }
        for (int i = 1; i < nn.length - 1; i++) {
            if (nn[i] < nn[i + 1]) {
                cnt++;
//                max = nn[i + 1];
            }
        }
        System.out.println(cnt);

    }


}



