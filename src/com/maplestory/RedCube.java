package com.maplestory;

import java.util.Arrays;

public class RedCube implements Cube{

    @Override
    public String[] changeOption(String[] GRADE,String[] randomDraw) {
//        RARE_OPTION[];
        String grade = GRADE[0];
        int random = (int)(Math.random()*100)+1;

        if(grade.equals("레어")){
            if(random<30){
                grade = GRADE[1];
            }
        }else if(grade.equals("에픽")){
            if(random<3){
                grade = GRADE[2];
            }
        }else if(grade.equals("유니크")){
            if(random<2){
                grade = GRADE[3];
            }
        }else{

        }

        System.out.println("아이템의 잠재능력이"+grade+"입니다.");

        if(grade.equals("레어")){
        for(int i = 0 ; i< randomDraw.length;i++){
            int random1 = (int)(Math.random()*5);
            randomDraw[i] = RARE_OPTION[random1];
        }
        System.out.println(Arrays.toString(randomDraw));
        return randomDraw;
        }
        else if(grade.equals("에픽")){
            for(int i = 0 ; i< randomDraw.length;i++){
                int random1 = (int)(Math.random()*5);
                randomDraw[i] = EPIC_OPTION[random1];
            }
            System.out.println(Arrays.toString(randomDraw));
            return randomDraw;
        }else if(grade.equals("유니크")) {
            for (int i = 0; i < randomDraw.length; i++) {
                int random1 = (int) (Math.random() * 5);
                randomDraw[i] = UNIQUE_OPTION[random1];
            }
            System.out.println(Arrays.toString(randomDraw));
            return randomDraw;
        }else{
            for (int i = 0; i < randomDraw.length; i++) {
                int random1 = (int) (Math.random() * 5);
                randomDraw[i] = UNIQUE_OPTION[random1];
            }
            System.out.println(Arrays.toString(randomDraw));
            return randomDraw;
        }
    }
}
