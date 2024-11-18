package Practice06;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 선수 수 입력 받기
        System.out.print("갬블링 게임에 참여할 선수 숫자>> ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 처리

        String[] playerNames = new String[numPlayers];
        int[][] playerChoices = new int[numPlayers][3];  // 각 선수의 3개의 선택 저장

        // 선수 이름 입력 받기
        for (int i = 0; i < numPlayers; i++) {
            System.out.print((i + 1) + "번째 선수 이름>> ");
            playerNames[i] = scanner.nextLine();
        }

        // 게임 진행
        boolean winnerFound = false;
        while (!winnerFound) {
            // 각 선수의 숫자 입력 받기
            for (int i = 0; i < numPlayers; i++) {
                System.out.print("[" + playerNames[i] + "]: ");
                for (int j = 0; j < 3; j++) {
                    playerChoices[i][j] = scanner.nextInt();
                }
            }

            // 일치 여부 확인
            for (int i = 0; i < numPlayers; i++) {
                if (playerChoices[i][0] == playerChoices[i][1] && playerChoices[i][1] == playerChoices[i][2]) {
                    System.out.println(playerNames[i] + "님이 이겼습니다!");
                    winnerFound = true;
                    break;
                } else {
                    System.out.println(playerNames[i] + "님: " + playerChoices[i][0] + " " + playerChoices[i][1] + " " + playerChoices[i][2] + " 아쉽군요!");
                }
            }

            if (!winnerFound) {
                System.out.println("아직 승자가 없습니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
