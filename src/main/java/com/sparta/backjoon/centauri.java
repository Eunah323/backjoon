package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class centauri {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int D = Y-X;
            int mid = (int)Math.sqrt(D);
            if (mid==Math.sqrt(D)){
                answer = mid*2-1;
            }
            else if(D<=mid*mid+mid){
                answer = mid*2;
            }
            else answer = mid*2+1;
            System.out.println(answer);
        }
    }
}

