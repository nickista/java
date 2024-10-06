package Public;
//1개의 정보를 담는 memo class 작성하기 
public class CC248_7 {
	class Memo {
		String name;
		String time;
		String content;
		
		public Memo(String name, String time, String content) {
			this.name = name;
			this.time = time;
			this.content = content;                
		}        

		public void show() {
			System.out.println(name + ", " + time + " " + content);
		}
		// 이름 반환 메서드 
		public String getName() {
			return name;
		}
		public int length() {
			return content.length();
		}
		public boolean isSameName(Memo other) {
			return this.name.equals(other.name);
		}
		
	}
	public static void main(String[] args) {
		CC248_7 outer = new CC248_7(); // 외부 글래서의 인스턴스 생성하기
		Memo a = outer.new Memo("유송연", "10:10", "자바 과제 있음");
		Memo b = outer.new Memo("박채원", "10:15", "시카고로 어학 연수 가요!");
		Memo c = outer.new Memo("김경미", "11:30", "사랑하는 사람이 생겼어요.");
		
		a.show();
		if(a.isSameName(b)) System.out.println("동일한 사람입니다.");
		else System.out.println("다른 사람입니다.");
		System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length()) ;
	}

}
