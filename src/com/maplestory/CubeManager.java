package com.maplestory;

import java.util.Scanner;

public class CubeManager {
    public Cube getCube(String[] GRADE, String[] randomDraw){
        Cube cube = null;
        while(true) {
            Scanner sc = new Scanner(System.in);
            int choiceNum = sc.nextInt();
            switch (choiceNum) {
                case 1:
                    System.out.println("레드 큐브를 선택하셨습니다.");
                    cube = new RedCube();
                    cube.changeOption(GRADE, randomDraw);
                    break;
                case 2:
                    System.out.println("블랙 큐브를 선택하셨습니다.");
                    cube = new BlackCube();
                    cube.changeOption(GRADE, randomDraw);
                    break;
                case 9:
                    System.out.println("게임을 종료합니다.");
                    break;
                default:
                    System.out.println("숫자를 잘못 선택하셨습니다.");
            }

        }
        return cube;
    }
}
