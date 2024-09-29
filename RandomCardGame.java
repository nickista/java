package Public;
import java.util.Random;
import java.util.Scanner;
// 카드 숫자를 랜덤하게 생성하여 up&down하며 난수를 맞추는 게임. 
public class RandomCardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain; // 게임 재시작 여부를 나타내는 변수

        do {
            Random random = new Random();
            int randomNum = random.nextInt(100); // 0-99 사이의 난수 생성
            System.out.println("수를 결정하였습니다. 맞춰보세요.");
            System.out.println("0-99 범위의 숫자를 입력하세요:");

            int attempts = 0; //입력할 때 나타나는 1,2,3
            int guess = -1; //초기값은 -1로 설정
            int min = 0;
            int max = 99;

            // 사용자가 정답을 맞출 때까지 반복해서 물어보기 
            while (guess != randomNum) {
                attempts++; // 시도 횟수 증가
                System.out.print(attempts + ">> ");
                guess = scanner.nextInt();

                // 사용자 입력값과 난수를 비교
                if (guess < randomNum) {
                    min = guess; // 입력한 값이 min에 저장된다.
                    System.out.println("더 높게\n" + (min + 1) + "-" + max); // 정답보다 작을 경우
                } else if (guess > randomNum) {
                    max = guess; // max 최대값을 입력한 값으로 설정한다.
                    System.out.println("더 낮게\n" + min + "-" + (max - 1)); // 정답보다 클 경우
                } else {
                    System.out.println("맞았습니다.");
                }
            }

            // 다시 플레이할지 묻기
            System.out.print("다시하시겠습니까?(y/n)>> ");
            char response = scanner.next().charAt(0); // 사용자 입력 받기
            playAgain = (response == 'y' || response == 'Y'); // 'y' 또는 'Y'이면 true로 설정

        } while (playAgain); // 사용자가 'y'를 입력하면 반복

        scanner.close();
        System.out.println("게임을 종료합니다.");
    }
}
