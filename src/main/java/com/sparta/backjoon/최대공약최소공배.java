package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약최소공배 {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] list = new int[2];
        list[0] = Integer.parseInt(st.nextToken());
        list[1] = Integer.parseInt(st.nextToken());
        int bigger = 0;
        if (list[0]<list[1]) bigger = list[1];
        bigger = list[0];
        int min = 1;
        for (int i=1;i<=bigger;i++){
            if (list[0]%i==0 && list[1]%i==0 && min<i) min=i;
        }
        int max = list[0]*list[1]/min;



        System.out.println(min);
        System.out.println(max);

    }
}
