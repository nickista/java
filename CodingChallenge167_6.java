package Public;
import java.util.Scanner;
//자리수의 합이 9인 것을 출력하는 프로그램 
public class CodingChallenge167_6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];  

       
        System.out.print("양의 정수 10개 입력>> ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

  
        System.out.println("자리수의 합이 9인 것은...");
        for (int i = 0; i < 10; i++) {
            if (sumOfDigits(numbers[i]) == 9) {
                System.out.print(numbers[i] + " ");
            }
        }
    }


    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10; 
        }
        return sum;
    }
}
