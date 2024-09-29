package Public;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
//정수 저장 후 평균 출력 1~100
public class CodingChallenge168_8 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("정수 몇 개 저장하시겠습니까?>> ");
	        int count = scanner.nextInt(); 

	     
	        int[] numbers = new int[count];  
	        HashSet<Integer> uniqueNumbers = new HashSet<>();  // 중복 방지를 위한 Set
	        Random rand = new Random();  
	        int sum = 0;  
	        
	       
	        while (uniqueNumbers.size() < count) {
	            int randomInt = rand.nextInt(100) + 1;  
	            if (uniqueNumbers.add(randomInt)) {  
	                numbers[uniqueNumbers.size() - 1] = randomInt;  // 배열에 저장
	                sum += randomInt;  
	            }
	        }

	        // 랜덤 정수 출력
	        System.out.print("랜덤한 정수들... ");
	        for (int number : numbers) {
	            System.out.print(number + " ");  // 정수 출력
	        }

	        // 평균 계산
	        double average = sum / (double)count;  
	        System.out.println("\n평균은 " + average);
	    }
}
