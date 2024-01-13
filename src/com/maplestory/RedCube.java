package com.maplestory;

import java.util.Arrays;

public class RedCube implements Cube{

    @Override
    public String[][] changeOption(String[] grade,String[] randomDraw) {
        if(grade[0].equals("레어")){
        System.out.println("🔵"+grade[0]);
        }else if(grade[0].equals("에픽")){
            System.out.println("\uD83D\uDFE3"+grade[0]+"등급");
        }else if(grade[0].equals("유니크")) {
            System.out.println("\uD83D\uDFE1"+grade[0]+"등급");
        }else{
            System.out.println("\uD83D\uDFE2"+grade[0]+"등급");
        }
        System.out.println("\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5");
        System.out.println("\uD83D\uDFE5                                                                               \uD83D\uDFE5");

        int random = (int)(Math.random()*100)+1;
        if(grade[0].equals("레어")){
            if(random<30){
                grade[0] = GRADE[1];
            }
        }else if(grade[0].equals("에픽")){
            if(random<30){
                grade[0] = GRADE[2];
            }
        }else if(grade[0].equals("유니크")){
            if(random<30){
                grade[0] = GRADE[3];
            }
        }else{

        }

//        System.out.println("아이템의 잠재능력이"+grade[0]+"입니다.");

        if(grade[0].equals("레어")){
            for(int i = 0 ; i< randomDraw.length;i++){
                int random1 = (int)(Math.random()*5);
                randomDraw[i] = RARE_OPTION[random1];
            }

        }
        else if(grade[0].equals("에픽")){
            for(int i = 0 ; i< randomDraw.length;i++){
                int random1 = (int)(Math.random()*5);
                randomDraw[i] = EPIC_OPTION[random1];
            }
        }else if(grade[0].equals("유니크")) {
            for (int i = 0; i < randomDraw.length; i++) {
                int random1 = (int) (Math.random() * 5);
                randomDraw[i] = UNIQUE_OPTION[random1];
            }
        }else{
            for (int i = 0; i < randomDraw.length; i++) {
                int random1 = (int) (Math.random() * 5);
                randomDraw[i] = UNIQUE_OPTION[random1];
            }
        }

        System.out.println("           "+Arrays.toString(randomDraw)+"                                      ");
        System.out.println("\uD83D\uDFE5                                                                               \uD83D\uDFE5");
        System.out.println("\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5");


//        System.out.println("                     ");
//        System.out.println("\n\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5");

        String[][] result = {grade};
        return result;
    }

}
