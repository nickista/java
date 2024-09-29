package Public;
import java.util.Random;
import java.util.Scanner;
//겜블링 게임.
public class CodingChallenge170_14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("***** 갬블링 게임을 시작합니다. *****");

        while (true) {
            System.out.print("엔터키 입력>> ");
            scanner.nextLine();  

            int num1 = random.nextInt(3); 
            int num2 = random.nextInt(3);
            int num3 = random.nextInt(3);

            System.out.println(num1 + "" + num2 + "" + num3);  


            if (num1 == 2 && num2 == 2 && num3 == 2) {
                System.out.println("성공! 대박났어요!");
                
                System.out.print("계속하시겠습니까?(yes/no)>> ");
                String response = scanner.nextLine();
                if (response.equals("no")) {
                    System.out.println("게임을 종료합니다.");
                    break;  
                }
            }
        }
    }
}
