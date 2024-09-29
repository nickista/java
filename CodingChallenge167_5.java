package Public;
import java.util.Scanner;

public class CodingChallenge167_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];  // 10개의 정수를 저장할 배열

        // 양의 정수 10개 입력 받기
        System.out.print("양의 정수 10개 입력>> ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();  // 숫자 입력받기
        }

        // 3의 배수 출력
        System.out.print("3의 배수는...");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
