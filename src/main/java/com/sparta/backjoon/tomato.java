package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tomato {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] tomatos = new int[M][N];
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<N; j++) {
                tomatos[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(tomatos[3][5]);
    }
}
