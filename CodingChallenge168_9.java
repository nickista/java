package Public;
import java.util.Random;
//정수 16개를 랜덤하게 출력 4x4 2차원 정수배
public class CodingChallenge168_9 {
	 public static void main(String[] args) {
	        int[][] array = new int[4][4];
	        Random rand = new Random();

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                array[i][j] = rand.nextInt(256);
	            }
	        }

	        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
