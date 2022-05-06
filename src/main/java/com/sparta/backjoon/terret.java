package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class terret {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cnt = 0;
            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            int R1 = Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());
            int R2 = Integer.parseInt(st.nextToken());
            int XX1 = 0;
            int YY1 = 0;
            int XX2 = 0;
            int YY2 = 0;
            for (int k = 0 - R1; k <= R1; k++) {
                XX1 = X1 +k;
                YY1 = Y1 +(R1-k);
                for (int j = 0 - R2; j <= R2; j++) {

                    XX2 = X2 + j;
                    YY2 = Y2 + (R2-j);
                    if (XX1 == XX2 && YY1 == YY2) cnt++;

                }
                System.out.println("가능좌표X: " + XX1 + " 가능좌표Y: " + YY1);
            }
            System.out.println(cnt);
        }
    }
}

