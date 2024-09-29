package Public;

public class CodingChallenge166_1 {
	public static void main(String[] args) {
	int sum = 0;
	int i = 0;
	
	while(true) {
		if(i > 50) 
			break;
		sum = sum + i;
		i += 3;
	}
	System.out.println(sum);
	}
	//1. 무엇을 계산하는 코드인가 출력되는 내용은? >> 3의 배수를 더하는 프로그램 값: 408
	//2.main() 메소드로 만들고 whileloop 클래스로 완성하라.
	public class WhileLoop {
	    public static void main(String[] args) {
	        int sum = 0; // 합계를 저장할 변수
	        int i = 0;   // 3의 배수를 나타낼 변수
	        
	        while (true) {
	            if (i > 50) // 50을 초과하면 루프 종료
	                break;
	            sum = sum + i; // 현재 수를 합계에 더함
	            i += 3;        // 3씩 증가
	        }
	        
	        System.out.println(sum); // 최종 합계 출력
	    }
	}
	//3. for문을 이용하여 동일하게 실행되는 Forloop 클래스를 작성하라.
	public class ForLoop {
	    public static void main(String[] args) {
	        int sum = 0; // 합계를 저장할 변수

	        // 0부터 50까지 3의 배수를 합산
	        for (int i = 0; i <= 50; i += 3) {
	            sum += i; // 현재 수를 합계에 더함
	        }
	        
	        System.out.println(sum); // 최종 합계 출력
	    }
	}
	//4. do-while 문을 이용하여 도일하게 실행되는 Dowhileloop 클래스를 작성하라 
	
}
