package Practice06;
class TV {
	private int size;
	public TV(int size) { 
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size); // TV 클래스의 생성자 호출
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}

public class Q1 {
	public static void main(String[] args) {
		ColorTV myTv = new ColorTV(65, 65536); // 65인치 크기에 65536 컬러 TV
		myTv.printProperty();
	}
}
