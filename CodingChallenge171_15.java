package Public;
import java.util.Scanner;
import java.util.InputMismatchException;
// 정수 2개를 곱하는 프로그램. try-catch
public class CodingChallenge171_15 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;
        boolean validInput = false;  // 입력이 유효한지 체크하는 변수

        while (!validInput) {
            try {
                System.out.print("곱하고자 하는 정수 2개 입력>> ");
                n = scanner.nextInt();
                m = scanner.nextInt();
                validInput = true;  // 유효한 입력이 들어왔으므로 루프 종료
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요!");  // 오류 메시지 출력
                scanner.nextLine();  // 잘못된 입력 제거
            }
        }

        System.out.println(n + " x " + m + " = " + (n * m));
        scanner.close();  // 스캐너 닫기
    }
}
