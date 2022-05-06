package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stack_1874 {

    public static int[] stack;
    public static int size = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];
        for (int i=0;i<N;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println("+");
            if (i==n){
                System.out.println("-");

            }
        }


        System.out.println();

        }

    }




