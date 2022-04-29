package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hotel {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int n = Integer.parseInt(st.nextToken());


        int cnt = 1;
        for (int i = 0; i < n; i++) {
            String[] HWN = br.readLine().split(" ");
            int H = Integer.parseInt(HWN[0]); // 호텔의 층 수
            int W = Integer.parseInt(HWN[1]); // 층마다 방의 갯수
            int N = Integer.parseInt(HWN[2]); // N번째 손님
            int answerfloor = N % H;
            int answerroom = N / H +1;
            if(N % H == 0) { // 나머지가 0일 경우
                answerfloor = H * 100;
                answerroom = N / H;
            }else { // 아닐 경우
                answerfloor = (N % H) * 100;
                answerroom = N / H + 1;
            }
            int answer = answerfloor+answerroom;
            System.out.println(answer);
        }

    }
}

