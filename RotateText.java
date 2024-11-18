package Practice06;
// 글자를 회전시키는 프로그램 
import java.util.Scanner;

public class RotateText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String text = scanner.nextLine();

        // 입력된 문자열을 단어 단위로 나누기
        String[] words = text.split(" ");
        int length = words.length;

        // 단어를 회전하며 출력
        for (int i = 0; i < length; i++) {
            StringBuilder rotatedText = new StringBuilder();

            // 회전된 순서로 단어 조합
            for (int j = 0; j < length; j++) {
                rotatedText.append(words[(i + j) % length]).append(" ");
            }

            // 출력 시 불필요한 공백 제거
            System.out.println(rotatedText.toString().trim());
        }

        scanner.close(); // Scanner 닫기
    }
}

