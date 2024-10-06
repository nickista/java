package Public;
// 사각형을 포함하는 Rectangle 클래스를 작성하기 
public class CC247_6 {
	class Rectangle {
		int x; // 필드 생
		int y;
		int width;
		int height;
		
		public Rectangle(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
			
		public boolean isSquare() {
				return width == height; // 가로 세로가 같을 시 정사각형 
		}
		// 현재 사각형이 매개변수 r을 포함하는가 
		public boolean contains(Rectangle r) {
			return (x <= r.x && y <= r.y && (x + width) >= (r.x + r.width) && (y + height) >= (r.y + r.height));
		}
		public void show() {
			System.out.println("사각형: (" + x + ", " + y + "), 크기: " + width + "x" + height);
		}
		
		
	}

	public static void main(String[] args) {
		CC247_6 cc = new CC247_6(); // CC247_7 객체 생
		Rectangle a = cc.new Rectangle(3, 3, 6, 6); // (3, 3) 점에서 6x6 크기의 사각형
		Rectangle b = cc.new Rectangle(4, 4, 2, 3); // (4, 4) 점에서 2x3 크기의 사각형
		
		a.show();
		if(a.isSquare()) System.out.println("a는 정사각형입니다.");
		else System.out.println("a는 정사각형이 아닙니다.");
		if(a.contains(b)) System.out.println("a는 b를 포함합니다.");
		else System.out.println("a는 b를 포함합니다.");
	}

}
