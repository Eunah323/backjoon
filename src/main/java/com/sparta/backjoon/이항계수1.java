package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이항계수1 {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int A = N-K;
        int n = N;
        int k = K;
        double a = A;
        //이항계수 : N!/K!*(N-K)!
        for (int i = 1; i<N;i++){
            n*=i;
        }
        for(int i = 1; i<K;i++){
            k*=i;
        }
        for(int i = 1; i<A;i++){
            a*=i;

        }

        System.out.println(n/(k*a));
    }
}

