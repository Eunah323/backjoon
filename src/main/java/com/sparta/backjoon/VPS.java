package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class VPS {
    // BufferedReader 사용 시 예외처리 필수!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<String> stack = new Stack<>();

        int cnt1 = 0;
        int cnt2 = 0;
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            stack.push(String.valueOf(br.readLine().split("")));

//            for(int j = 0; j<n; j++){
//                if (PS[j] == "(") cnt1++;
//                if (PS[j] == ")") cnt2++;

//            }
//            if (cnt1 == cnt2) System.out.println("YES");
//            else System.out.println("NO");


        }String[] newone = new String[stack.size()];
        System.out.println(newone.length);
    }
}

