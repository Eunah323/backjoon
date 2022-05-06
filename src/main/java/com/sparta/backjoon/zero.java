package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class zero {
//     BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] total = new int[n];
        int zero = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            total[i] = Integer.parseInt(st.nextToken());

            for (int j = 1; j < n; j++) {
                if (total[i] == 0) zero++;
                if (total[j] == 0) {
                    if (total[j - 1] == 0 && j - zero-1 >= 0) {
                        total[j - (zero)] = 0;
                    }
                    else if (total[j-1] != 0) total[j - 1] = 0;

                }

            }
            sum += total[i];
            System.out.println(total[i]);
        }
        System.out.println(sum);


    }
}



