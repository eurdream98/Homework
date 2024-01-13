package com.maplestory;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("\uD83D\uDCB0큐브를 선택해주세요.\n \uD83D\uDFE5 1. 레드큐브\n ⬛ 2. 블랙큐브");
        CubeManager cubeManager = new CubeManager();
        Cube cube = cubeManager.getCube();
        String[] grade = {Cube.GRADE[0]};
        String[] randomDraw={"0","0","0"};
        String[][] result = {grade,randomDraw};
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true) {
            System.out.println();
            System.out.println("\uD83D\uDCB8\uD83D\uDCB8큐브 "+cnt+"개 째 구입\uD83D\uDCB8\uD83D\uDCB8");
            System.out.println("-------------------------선택지------------------|");
            System.out.println("\uD83D\uDFE5 레드큐브 : 큐브 계속 돌리기 : 0번, 큐브 멈추기 : 9번|_______________________\n" +
                    "⬛ 블랙 큐브 : before 옵션 선택 : 0번, after 옵션 선택 : 2번, 큐브 멈추기 : 9번|");
            System.out.println("------------------------------------------------------------------------");
            int choice = sc.nextInt();
            if(choice==9){
                System.out.println("\uD83D\uDCB8\uD83D\uDCB8총 큐브"+cnt+"개 사용 하셨습니다.\uD83D\uDCB8\uD83D\uDCB8");
                break;
            }else if(choice==2){
                randomDraw=result[1];
                cnt++;
            }else{
                cnt++;
            }
            result=cube.changeOption(grade,randomDraw);
            grade[0]=result[0][0];
        }

        }

//        String[] randomDraw = new String[3];
//        RedCube redCube = new RedCube();
//        redCube.changeOption(randomDraw);

}
