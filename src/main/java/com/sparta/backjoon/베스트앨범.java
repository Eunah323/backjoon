package com.sparta.backjoon;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0)+plays[i]);
        }

        List<String> genreList = new ArrayList<>();

        while (!genreMap.isEmpty()){
            int a = 0;
            String t = "";
            for(String genre : genreMap.keySet()){
                if(a<genreMap.get(genre)){
                    a = genreMap.get(genre);
                    t = genre;
                }
            }
            genreMap.remove(t);
            genreList.add(t);
        }

        List<Integer> answerList = new ArrayList<>();

        for(String compare : genreList){
            int a = -1;
            int b = -1;
            int indexA = 0;
            int indexB = 0;

            for(int i = 0; i < genres.length; i++){
                if(compare.equals(genres[i])){
                    if(a <= plays[i]){
                        b = a;
                        a = plays[i];
                        indexB = indexA;
                        indexA = i;
                    }
                }
            }

            if(b<=0) {
                if (a == b) {
                    answerList.add(Math.min(indexA, indexB));
                    answerList.add(Math.max(indexA, indexB));
                } else if(a>b){
                    answerList.add(indexA);
                    answerList.add(indexB);
                } else if(a<b){
                    answerList.add(indexB);
                    answerList.add(indexA);
                }
            }else {
                answerList.add(indexA);
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}


