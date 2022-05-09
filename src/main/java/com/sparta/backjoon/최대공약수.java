package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수 {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] list = new int[N];
        int min = 1000000;
        int max = 0;
        for (int i =0;i<N;i++){
            list[i]=Integer.parseInt(st.nextToken());
            if (list[i]<min) min = list[i];
            if (list[i]>max) max = list[i];
        }
        int answer = min * max;

        System.out.println(answer);

    }
}
