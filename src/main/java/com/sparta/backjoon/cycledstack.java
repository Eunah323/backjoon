package com.sparta.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class cycledstack {
    //    public static int[] stack;
//    public static int size = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());    // 큐의 크기(1 ~ N)
        int M = Integer.parseInt(st.nextToken());    // 뽑으려는 숫자의 개수
        int[] result = new int[M];
        int cnt = 0;
        LinkedList<Integer> q = new LinkedList<Integer>(); //int형 queue 선언, linkedlist 이용
//덱큐에 수 담기
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        //입력값에서 뽑고자 하는 수 입력값을 넣어주는 배열
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int idx = q.indexOf(result[i]);
            if (idx < q.size() / 2) {
                while (i-- > 0) {
                    i--;
                    cnt++;
                }
            }
            cnt = 1;
            while (i-->M){
                i++;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}