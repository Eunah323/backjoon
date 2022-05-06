package com.sparta.backjoon;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;

class musicinfo {
    public String solution(String m, String[] musicinfos)  throws ParseException{
        String answer = "";
        //시간계산
        for(int i=0;i<musicinfos.length; i++){
String[] each = musicinfos[i].split(",");
            System.out.println(each[2]);
            SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
            Date d1 = f.parse(musicinfos[0]);
            Date d2 = f.parse(musicinfos[1]);
            long diff = d2.getTime() - d1.getTime();
            long sec = diff / 1000/ 60;
            System.out.println(sec);

        }

        return answer;
    }
}
