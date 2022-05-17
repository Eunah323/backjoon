package com.sparta.backjoon;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling // 아래의 클래스를 스케줄링 목적으로 사용하도록 하겠다는 명시
@Configuration
@RequiredArgsConstructor
public class 미사일 {
    // BufferedReader 사용 시 예외처리 필수!

    @Scheduled(cron = "0/1 * * * * *")
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
            continue;
        }
        System.out.println("발사성공해썽");


    }

}


