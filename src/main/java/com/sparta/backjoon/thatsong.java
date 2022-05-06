package com.sparta.backjoon;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

class thatsong {
    public String solution(String m, String[] musicinfos) throws ParseException {
        String answer = "(None)";
        int max = 0;
        //시간계산
        for (int i = 0; i < musicinfos.length; i++) {
            //각 정보를 자른 것
            String[] each = musicinfos[i].split(",");
            //시간계산
            SimpleDateFormat f = new SimpleDateFormat("HH:mm");
            Date d1 = f.parse(each[0]);
            Date d2 = f.parse(each[1]);
            long diff = d2.getTime() - d1.getTime();
            //재생시간(분)
            long time = diff / 1000 / 60;
            //#의 개수 구하기
            String[] shap = each[3].split("#");
            int count = shap.length - 1;


            //총 길이는 시간의 길이에 샾개수를 더해준것.
            int totallength = (int) time + count;

            //악보와 시간을 비교하여 악보를 시간길이로 맞추기
            //악보가 입력값을 포함할경우 answer 세팅,샾개수만큼 길이 늘려줌.
            while (each[3].length() < totallength) {
                totallength += count;
                each[3] += each[3];
                // 악보가 시간보다 길경우, 시간의 길이로 악보를 자른다.
                // if(each[3].length()>totallength) {
                //     each[3]=each[3].substring(0,totallength);
                //     break;
                // }
            }
            String[] one = each[3].split("");


            if (each[3].contains(m) && totallength > max && each[3].contains(m + "#") == false) {
                answer = each[2];
                max = totallength;
            }

            System.out.println(each[3]);
        }

        return answer;
    }
}
