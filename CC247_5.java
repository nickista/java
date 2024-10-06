package Public;
// 노래 한 곡을 나타내는 Song 클래스 작성. 
public class CC247_5 {
	// Song 클래
	class Song {
	String title; // 노래 제 
	String singer; // 가
	int year; // 노래 발매년도 
	String lang; // 가수의 국적 
	
	// 생성자 4개 매개변수를 받는다. 초기화. 
	public Song(String title, String singer, int year, String lang) {
		this.title = title;
		this.singer = singer; // this는 위 필드를 이야기 = singer은 매개변수를 의미한다.
		this.year = year;
		this.lang = lang;
	}
		
	public void show() {
		System.out.println(year + "년 " + lang + "의 " + singer + "가 부른 " + title);
	}
	}
	public static void main(String[] args) {
		// Song 객체 생성
		CC247_5 outer = new CC247_5(); // song이 중첩 클래스라서 외부 클래스 객체가 필요하다.
		Song song = outer.new Song("가로수 그늘 아래 서면", "이문세", 1988, "한국");
		// show 매서드 출력 
		song.show();
	}
}
