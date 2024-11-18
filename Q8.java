package Practice06;
// 생일을 입력하면 몇일 살아왔는지 알려줌 
import java.util.Scanner;
import java.util.Calendar;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 생일을 입력받기
        System.out.print("생일을 입력하세요 (예: 2024 04 01): ");
        int year = scanner.nextInt();
        int month = scanner.nextInt() - 1; // 월은 0부터 시작하므로 1을 빼야 함
        int day = scanner.nextInt();

        // 현재 날짜 얻기
        Calendar today = Calendar.getInstance();
        
        // 입력받은 생일 날짜 설정
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month, day);

        // 만약 생일이 이미 지나버렸다면 내년 생일로 설정
        if (today.after(birthday)) {
            birthday.add(Calendar.YEAR, 1);
        }

        // 오늘 날짜와 생일까지의 차이 계산
        long diffInMillis = birthday.getTimeInMillis() - today.getTimeInMillis();
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000); // 밀리초를 일수로 변환

        System.out.println("오늘까지 " + diffInDays + "살아왔습니다");

        scanner.close();
    }
}
