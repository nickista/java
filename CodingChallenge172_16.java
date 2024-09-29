package Public;
import java.util.Scanner;
//정수가 아닌 것은 예외처리하고 평균을 구하는 프로그램. 
public class CodingChallenge172_16 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.print("양의 정수를 입력하세요. -1은 입력 끝>> ");
        
        while (true) {
            String input = scanner.next();

            if (input.equals("-1")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " 제외");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("평균은 " + average);
        } else {
            System.out.println("입력된 양의 정수가 없습니다.");
        }

        scanner.close();
	}
}
