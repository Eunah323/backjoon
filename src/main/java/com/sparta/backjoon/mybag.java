package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mybag {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] ww = new int[N];
        int[] vv = new int[N];
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            int W = Integer.parseInt(st2.nextToken());
            ww[i] = W;
            int V = Integer.parseInt(st2.nextToken());
            vv[i] = V;
        }
        for (int i = 1; i <= N; i++) {
            System.out.println("\n" + N + " 개 중에서 " + i + " 개 뽑기");
            combination(vv, visited, 0, N, i);
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        }
    }


    // 백트래킹 사용
// 사용 예시 : combination(arr, visited, 0, n, r)
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
