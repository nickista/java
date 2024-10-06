package Public;
// 달력을 기록, 출력하는 프로그램. 
import java.util.Scanner;

class Diary {
    String[] days;

    public Diary() {
        days = new String[30];
        for (int i = 0; i < days.length; i++) {
            days[i] = "...";
        }
    }

    public void record(int day, String event) {
        if (day >= 1 && day <= 30 && event.length() <= 4) {
            days[day - 1] = event;
        }
    }

    public void display() {
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

public class CC250_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diary diary = new Diary();
        boolean running = true;

        while (running) {
            System.out.print("기록:1, 보기:2, 종료:3>>");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>");
                    int day = scanner.nextInt();
                    String event = scanner.next();
                    diary.record(day, event);
                    break;
                case 2:
                    diary.display();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
        scanner.close();
    }
}
