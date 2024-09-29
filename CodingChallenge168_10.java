package Public;
import java.util.Random;
import java.util.Scanner;
//0~255 범위 정수 16개 랜덤 생성. 임계값 입력받고 높으면 255 적으면 0. 
public class CodingChallenge168_10 {
	 public static void main(String[] args) {
	        int[][] array = new int[4][4];
	        Random rand = new Random();
	        Scanner scanner = new Scanner(System.in);

	        // 배열 초기화 및 랜덤 값 저장
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                array[i][j] = rand.nextInt(256);
	            }
	        }

	        // 초기 배열 출력
	        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
	        printArray(array);

	        // 임계값 입력받기
	        System.out.print("임계값 입력>> ");
	        int threshold = scanner.nextInt();

	        // 배열 수정
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                if (array[i][j] > threshold) {
	                    array[i][j] = 255;
	                } else {
	                    array[i][j] = 0;
	                }
	            }
	        }

	        // 수정된 배열 출력
	        printArray(array);
	    }

	    private static void printArray(int[][] array) {
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
