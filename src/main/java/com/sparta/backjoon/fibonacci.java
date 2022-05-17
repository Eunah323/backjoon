package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            //입력값이 0이면 이미 zero의 개수는 0이기때문에 zero를 1로 세팅
            int zero = 1;
            int one = 0;
            int sum = 1;
            int Y = Integer.parseInt(br.readLine());
            for (int j = 0; j < Y; j++) {
//Y의 수만큼반복할건데, 피보나치수열이 앞의 수를 계속 더해가는 것이기 때문에 zero에 one을 넣어주고 one에 sum을 넣어주고
// sum에는 다시 그 둘을 더하는 식으로 반복.
                zero = one;
                one = sum;
                sum = zero + one;

            }
            System.out.println(zero + " " + one);


        }
    }


}
