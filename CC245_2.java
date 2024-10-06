package Public;

public class CC245_2 {

	class Cube {
		int width;
		int height;
		int depth;

		public Cube(int width, int height, int depth) {
			this.width = width;
			this.height = height;
			this.depth = depth;
		}

		public int getVolume() {
			return width * height * depth;
		}

		public boolean isZero() {
			return getVolume() == 0;
		}
	}

	public static void main(String[] args) {
		CC245_2 outer = new CC245_2();
		Cube cube = outer.new Cube(1, 2, 3); 
		System.out.println("큐브의 부피는 " + cube.getVolume());

		if (cube.isZero()) {
			System.out.println("큐브의 부피는 0");
		} else {
			System.out.println("큐브의 부피는 0이 아님");
		}
	}
}
