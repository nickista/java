package Public;
import java.util.Scanner;
//과목 입력 학점. 
public class CodingChallenge170_13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"Java", "C++", "Python", "JavaScript", "HTML"};
        String[] grades = {"A+", "B+", "A", "B", "A-"};

        while (true) {
            System.out.print("과목>> ");
            String inputSubject = scanner.nextLine();

            if (inputSubject.equals("그만")) {
                break;  // "그만" 입력 시 프로그램 종료
            }

            boolean found = false;
            for (int i = 0; i < subjects.length; i++) {
                if (inputSubject.equals(subjects[i])) {
                    System.out.println(inputSubject + " 학점은 " + grades[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(inputSubject + "는 없는 과목입니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
