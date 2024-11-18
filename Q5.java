// 개수가 정해지지 않은 여러 과목의 학점을 빈 칸으로 분리하여 입력
// A는 100점. B는 90점. C는 80점. D는 70점. F는 0점으로 계산하여 평균을 출력하는 프로그램을 작성하라.
package Practice06;

import java.util.Scanner; // Scanner 클래스를 올바르게 import
import java.util.StringTokenizer; // StringTokenizer 클래스 import

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        while (true) {
            System.out.print("여러 과목의 학점을 빈 칸으로 분리 입력>> ");
            String line = scanner.nextLine();

            // "그만"을 입력하면 프로그램 종료
            if (line.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            StringTokenizer st = new StringTokenizer(line, " ");
            int totalScore = 0;
            int count = 0;
            boolean isError = false;

            while (st.hasMoreTokens()) {
                String grade = st.nextToken();
                int score = 0;

                // 학점을 점수로 변환
                switch (grade) {
                    case "A":
                        score = 100;
                        break;
                    case "B":
                        score = 90;
                        break;
                    case "C":
                        score = 80;
                        break;
                    case "D":
                        score = 70;
                        break;
                    case "F":
                        score = 0;
                        break;
                    default:
                        System.out.println("입력 오류: " + grade);
                        isError = true;
                        break;
                }

                if (isError) break; // 오류가 발생하면 루프 종료

                totalScore += score;
                count++;
            }

            if (!isError && count > 0) {
                double average = (double) totalScore / count; // 평균 계산
                System.out.println("평균은 " + average);
            }
        }

        scanner.close(); // Scanner 닫기
    }
}
