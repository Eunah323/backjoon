package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class balanced2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt1 = 0;
        int cnt2 = 0;
        //무한루프
        while (true) {
            String input = br.readLine();

            if (input.equals(".")) break;
            if (input.equals(" .")){
                System.out.println("yes");
                continue;
            }

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '(') cnt1++;
                if (ch == '[') cnt2++;
                if (ch == ')') cnt1--;
                if (ch == ']') cnt2--;
                else if(cnt1<0 || cnt2<0){
                    System.out.println("no");
                    break;
                }

            }
//            if (cnt1 < 0 || cnt2 < 0) System.out.println("no");
            if (cnt1 == 0 && cnt2 == 0) System.out.println("yes");

        }

    }

}


