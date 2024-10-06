package Public;
//TV class를 만들고 텍스트 출력 
public class CC245_1 {
	static class TV {
		String brand;
		int size;
		int price;
		
		public TV(String brand, int size, int price) {
			this.brand = brand; // 인스턴스 변수와 로컬변수를 구별할 때, this는 TV의 brand를 참조. 
			this.size = size;
			this.price = price;
		}
		public void show() {
			System.out.println(brand + "에서 만든 " + price + "만원짜리의 " + size + "인치 TV");
		}
		
		public static void main(String[] args) {
			TV tv = new TV("Samsung", 50, 300); //300만원짜리 Samsung에서 만든 50인지 TV
			tv.show();
		}
	}
	
}
