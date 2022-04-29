package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addCycle {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String NN = String.valueOf(N);
        int n = 0;
        int cnt = 0;
        int aaa = 0;

        while (true) {
            if (NN.length()<2) {
                NN = "0"+NN;
                continue;
            }
            String[] aa = NN.split("");
            int front = Integer.parseInt(aa[0]);
            int back = Integer.parseInt(aa[1]);
            aaa = front + back;
            n = back*10+aaa%10;

            cnt++;

            if (n == N) {
                break;
            }
            NN=String.valueOf(n);
//            if (cnt==60)break;
        }
        System.out.println(cnt);

    }
}
