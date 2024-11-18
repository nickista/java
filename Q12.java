package Practice06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 참가자 이름 입력 받기
        System.out.print("게임에 참여할 선수들 이름>> ");
        String inputNames = scanner.nextLine();
        String[] playerNames = inputNames.split(" ");  // 이름을 공백으로 구분하여 배열에 저장

        // 각 선수의 선택 저장
        int[] playerChoices = new int[playerNames.length];

        // 각 선수의 맞춘 개수 저장
        int[] playerScores = new int[playerNames.length];

        // 랜덤 정수 목록 입력 받기
        System.out.print("Enter키 입력>> ");
        String inputNumbers = scanner.nextLine();
        String[] numberStrings = inputNumbers.split(" ");
        List<Integer> randomNumbers = new ArrayList<>();
        for (String numStr : numberStrings) {
            randomNumbers.add(Integer.parseInt(numStr));
        }

        // 각 선수의 정수 입력 받기
        for (int i = 0; i < playerNames.length; i++) {
            System.out.print("[" + playerNames[i] + "] 정수 선택(1~10)>> ");
            playerChoices[i] = scanner.nextInt();
        }

        // 각 선수의 맞춘 개수 계산
        for (int i = 0; i < playerNames.length; i++) {
            int count = 0;
            for (int num : randomNumbers) {
                if (playerChoices[i] == num) {
                    count++;
                }
            }
            playerScores[i] = count;
        }

        // 패자들 출력
        List<String> losers = new ArrayList<>();
        for (int i = 0; i < playerNames.length; i++) {
            System.out.println("[" + playerNames[i] + "] 맞춘 개수: " + playerScores[i]);
            if (playerScores[i] == 0) {
                losers.add(playerNames[i]);
            }
        }

        // 패자가 1명일 경우
        if (losers.size() == 1) {
            System.out.println("최종 패자는 " + losers.get(0) + "입니다.");
        } else {
            System.out.println("현재 패자들: " + String.join(" ", losers));
        }

        scanner.close();
    }
}
