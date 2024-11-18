package Practice06;
// 년도를 입력하면 달력을 출력 
import java.util.Scanner;
import java.util.Calendar; // Calendar 클래스 import

public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("년도 입력(-1이면 종료)>> ");
            int year = scanner.nextInt();

            if (year == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            for (int month = 1; month <= 12; month++) {
                printMonthCalendar(year, month);
            }
        }

        scanner.close(); // Scanner 닫기
    }

    // 월별 달력을 출력하는 메서드
    private static void printMonthCalendar(int year, int month) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month - 1, 1); // 해당 월의 첫째 날로 설정 (0부터 시작)

        int firstDayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK); // 첫째 날의 요일
        int daysInMonth = calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH); // 해당 월의 일수

        System.out.printf("\n%d년 %d월\n", year, month);
        System.out.println("일 월 화 수 목 금 토");

        // 첫째 날 전까지 공백 출력
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // 날짜 출력
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            // 토요일이면 줄 바꿈
            if ((firstDayOfWeek + day - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // 다음 달력을 위한 줄 바꿈
    }
}

