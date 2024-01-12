package com.maplestory;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        String[] GRADE = {"레어","에픽","유니크","레전더리"};
        String[] randomDraw = new String[3];
        System.out.println("큐브를 선택해주세요.\n1. 레드큐브\n2. 블랙큐브\n9. 큐브 종료");
        CubeManager cubeManager = new CubeManager();
//        while(true) {
            cubeManager.getCube(GRADE,randomDraw);
//        }
//        String[] randomDraw = new String[3];
//        RedCube redCube = new RedCube();
//        redCube.changeOption(randomDraw);
    }
}
