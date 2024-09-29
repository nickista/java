package Public;
import java.util.Scanner;
// 양의 정수를 입력하면 별이 하나씩 줄어드는 코
public class CodingChallenge166_3 {
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int num;

		        
		        while (true) {
		            System.out.print("양의 정수 입력>>");
		            num = scanner.nextInt();

		            if (num > 0) 
		                break;  
		            
		        }

		   
		        for (int i = num; i > 0; i--) {
		            for (int j = 0; j < i; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		
}

