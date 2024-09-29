package Public;
import java.util.Random;
//11-19 까지 랜덤 생성 후 평균 출력하
public class CodingChallenge167_7 {
	 public static void main(String[] args) {
	        int[] numbers = new int[10];  
	        Random random = new Random();  
	        int sum = 0;                  
	        
	        System.out.print("랜덤한 정수들... ");
	        // 랜덤한 정수 10개 생성 (11~19 범위) 및 배열에 저장
	        for (int i = 0; i < 10; i++) {
	            // 11~19 범위의 랜덤 정수 생성
	            int randomInt = (int)(Math.random() * 9 + 11);
	            numbers[i] = randomInt;
	            sum += numbers[i];  // 숫자의 합계를 계산
	            System.out.print(numbers[i] + " ");  // 랜덤한 정수 출력
	        }

	        // 배열의 평균 계산
	        double average = sum / 10.0;
	        System.out.println("\n평균은 " + average);
	    }
}
