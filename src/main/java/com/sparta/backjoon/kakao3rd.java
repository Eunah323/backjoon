package com.sparta.backjoon;

public class kakao3rd {
    public long solution(String expression) {
        String[] first = null;
        String[] second = null;
        String[] third = null;
        Long thirdsum = Long.valueOf(first[0]);
        Long secondsum = Long.valueOf(second[0]);
        Long fistsum = Long.valueOf(third[0]);

        //곱셈 연산을 제일 나중에 해줄 것이므로
        if (expression.contains("*")) {
            first = expression.split("\\*");
        }

        else if (first.length>0) {
            for (int i = 0; i < first.length; i++) {
                if (first[i].contains("+")) {
                    second = first[i].split("\\+");
                }
            }

        } else if (second.length>0) {
            for (int i = 0; i < second.length; i++) {
                if (second[i].contains("-")) {
                    third = second[i].split("\\-");
                }
            }

        }
        for (int i = 1; i< third.length;i++){
            thirdsum-=thirdsum;
        }
        for(int i = 1;i<second.length;i++){
            secondsum+=secondsum;
        }
        for (int i =1;i< first.length;i++){
            fistsum*=fistsum;
        }
        long answer = 0;
        return fistsum;
    }

}

