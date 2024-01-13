package com.maplestory;

import java.util.Arrays;

public class BlackCube implements Cube{
    @Override
    public String[][] changeOption(String[] grade,String[] randomDraw) {
        System.out.println("⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛");
        System.out.println("⬛                                                       ⬛");
        if(grade[0].equals("레어")){
            System.out.println("                   🔵"+grade[0]);
        }else if(grade[0].equals("에픽")){
            System.out.println("                   \uD83D\uDFE3"+grade[0]+"등급");
        }else if(grade[0].equals("유니크")) {
            System.out.println("                   \uD83D\uDFE1"+grade[0]+"등급");
        }else{
            System.out.println("                   \uD83D\uDFE2"+grade[0]+"등급");
        }
        System.out.println("  before : "+ Arrays.toString(randomDraw));
        System.out.println("⬛                                                       ⬛");
        System.out.println("⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛");
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

        String[] temp = new String[3];

        if(grade.equals("레어")){
            for(int i = 0 ; i< temp.length;i++){
                int random1 = (int)(Math.random()*5);
                temp[i] = RARE_OPTION[random1];
            }

        }
        else if(grade.equals("에픽")){
            for(int i = 0 ; i< temp.length;i++){
                int random1 = (int)(Math.random()*5);
                temp[i] = EPIC_OPTION[random1];
            }
        }else if(grade.equals("유니크")) {
            for (int i = 0; i < temp.length; i++) {
                int random1 = (int) (Math.random() * 5);
                temp[i] = UNIQUE_OPTION[random1];
            }
        }else{
            for (int i = 0; i < temp.length; i++) {
                int random1 = (int) (Math.random() * 5);
                temp[i] = UNIQUE_OPTION[random1];
            }
        }
        System.out.println("⬛                                                       ⬛");
        if(grade[0].equals("레어")){
            System.out.println("                   🔵"+grade[0]);
        }else if(grade[0].equals("에픽")){
            System.out.println("                   \uD83D\uDFE3"+grade[0]+"등급");
        }else if(grade[0].equals("유니크")) {
            System.out.println("                   \uD83D\uDFE1"+grade[0]+"등급");
        }else{
            System.out.println("                   \uD83D\uDFE2"+grade[0]+"등급");
        }
        System.out.println("  After : "+Arrays.toString(temp));
        System.out.println("⬛                                                       ⬛");
        System.out.println("⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛");
        String[][] result={grade,temp};
        return result;
    }
}
