package Public;
//Average class를 작성하고 평균 구하기. 최대 10개까지만 정수 저장 가능. 
public class CC246_4 {
	class Average {
		private int[] numbers; // 정수를 저장할 배열.
		private int	count; //  정수를 샐 변수 
		
		public Average() {
			numbers = new int[10];
			count = 0;
		}
		
		// 점수 저장 메서드
		public void put(int number) {
			if (count < 10) {
				numbers[count] = number;
				count++;
			} else {
				System.out.println("더 이상 저장할 수 없습니다. 최대 10개까지만 저장할 수 있습니다. ");
			}
		}
		// 저장된 모든 원소를 출력하는 매서드 
		public void showAll() {
			System.out.print("저장된 원소: ");
			for (int i = 0; i < count; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}
		// 평균을 계산하는 메서
		public double getAvg() {
			if (count == 0) {
				return 0; // 저장된 값이 없을 때 평균은 0
			}
			int sum = 0;
			for (int i = 0; i < count; i ++) {
				sum += numbers[i];
			}
			return sum / (double) count;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.print("***** 저장된 데이터 모두 출력 *****\n");
		CC246_4 av = new CC246_4();
		Average avg = av.new Average();
		avg.put(10); // 10 저장 
		avg.put(15); // 15 저장
		avg.put(100); // 100 저장
		avg.showAll(); // 저장된 모든 원소 출력 
		System.out.print("평균은 " + avg.getAvg()); //평균 출력

	}

}
