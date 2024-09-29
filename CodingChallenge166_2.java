package Public;

public class CodingChallenge166_2 {
	public static void main(String[] args) {
		int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
		for(int i=0; i<n.length; i++) {
			if(n[i] > 0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
		}
	}
	//1. 이 코드는 뭘 하는 것인가? 양수이면서 4로 나누어 떨어지는 숫자를 찾아 출력, 결과: 20 72 256
	//2. 위에 코드를 main() 메소드로 만들고 ForLoopArray 클래스로 완성하라.
	public class ForLoopArray {
	    public static void main(String[] args) {
	        int n[] = {1, -2, 6, 20, 5, 72, -16, 256}; // 정수 배열 정의
	        for (int i = 0; i < n.length; i++) { // 배열 길이만큼 반복
	            if (n[i] > 0 && n[i] % 4 == 0) { // 양수이며 4의 배수인지 확인
	                System.out.print(n[i] + " "); // 조건을 만족하는 경우 출력
	            }
	        }
	    }
	}
	//3. WhileLoopArray 클래스를 완성하라.
	public class WhileLoopArray {
	    public static void main(String[] args) {
	        int n[] = {1, -2, 6, 20, 5, 72, -16, 256}; // 정수 배열 정의
	        int i = 0; // 인덱스 초기화

	        while (i < n.length) { // 배열의 길이만큼 반복
	            if (n[i] > 0 && n[i] % 4 == 0) { // 양수이며 4의 배수인지 확인
	                System.out.print(n[i] + " "); // 조건을 만족하는 경우 출력
	            }
	            i++; // 인덱스 증가
	        }
	    }
	}
	//4. DoWhileLoopArray 클래스를 완성하라
	public class DoWhileLoopArray {
	    public static void main(String[] args) {
	        int n[] = {1, -2, 6, 20, 5, 72, -16, 256}; // 정수 배열 정의
	        int i = 0; // 인덱스 초기화

	        do {
	            if (n[i] > 0 && n[i] % 4 == 0) { // 양수이며 4의 배수인지 확인
	                System.out.print(n[i] + " "); // 조건을 만족하는 경우 출력
	            }
	            i++; // 인덱스 증가
	        } while (i < n.length); // 배열의 길이만큼 반복
	    }
	}
}
