package Public;
import java.util.Scanner;
//한 학생의 평균을 출력하는 프로그램. Grade 클래스를 만든다. 
public class CC246_3 {

    class Grade {
        private String name; //private 캡슐화를 통해 데이터의 무결성을 유지 
        private int javaScore;
        private int webScore;
        private int osScore;

        // 생성자
        public Grade(String name, int javaScore, int webScore, int osScore) {
            this.name = name;
            this.javaScore = javaScore;
            this.webScore = webScore;
            this.osScore = osScore;
        }

        // 이름 반환 메서드
        public String getName() {
            return name;
        }

        // 평균 계산 메서드
        public double getAverage() {
            return (javaScore + webScore + osScore) / 3.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>");
        String name = scanner.next();
        int java = scanner.nextInt();
        int web = scanner.nextInt();
        int os = scanner.nextInt();

        // Grade 객체 생성
        CC246_3 cc = new CC246_3();
        Grade st = cc.new Grade(name, java, web, os);

        // 결과 출력
        System.out.print(st.getName() + "의 평균은 " + st.getAverage());

        scanner.close();
    }
}
