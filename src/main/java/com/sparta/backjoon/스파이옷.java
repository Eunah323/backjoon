package com.sparta.backjoon;

import java.util.*;

class 스파이옷 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Set<String> type = new HashSet<>();
        for(String[] a : clothes){
            type.add(a[1]);
        }
        Iterator<String> types = type.iterator();

        while(types.hasNext()){
            int cnt = 0;
            String t = types.next();
            for(String[]a : clothes){
                if(a[1].equals(t)){
                    cnt++;
                }
            }
            answer = answer * (cnt+1);
        }
        return answer;
    }
}


