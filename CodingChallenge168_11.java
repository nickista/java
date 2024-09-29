package Public;
import java.util.Random;
import java.util.Scanner;
//구구단을 랜덤하게 출력 3번 안에 맞추는 프로그램. 
public class CodingChallenge168_11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wrongAttempts = 0;

        System.out.println("***** 구구단을 맞추는 퀴즈입니다. *****");

        while (wrongAttempts < 3) {
            int a = (int)(Math.random() * 9 + 1);  // 1~9 범위의 랜덤한 숫자
            int b = (int)(Math.random() * 9 + 1);  // 1~9 범위의 랜덤한 숫자
            int correctAnswer = a * b;

            // 구구단 문제 출력
            System.out.print(a + "x" + b + "=");
            int userAnswer = scanner.nextInt();  // 사용자 답 입력

            // 정답 확인
            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다. 잘했습니다.");
            } else {
                wrongAttempts++;
                System.out.println(wrongAttempts + "번 틀렸습니다. 분발하세요.");
            }
        }

        System.out.println("3번 틀렸습니다. 퀴즈 종료합니다.");
    }
}
