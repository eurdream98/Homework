package com.maplestory;

import java.util.Scanner;

public class CubeManager {
    public Cube getCube() {
        Cube cube = null;
        Scanner sc = new Scanner(System.in);
        int choiceNum = sc.nextInt();
        switch (choiceNum) {
            case 1:
                System.out.println("\uD83D\uDFE5 레드 큐브를 선택하셨습니다.");
                cube = new RedCube();
                break;
            case 2:
                System.out.println("⬛ 블랙 큐브를 선택하셨습니다.");
                cube = new BlackCube();
                break;
            default:
                System.out.println("숫자를 잘못 선택하셨습니다.");
        }
        return cube;

    }
}
