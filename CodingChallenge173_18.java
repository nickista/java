package Public;
import java.util.Scanner;
// 학번 점수를 입력받고 조회하는 프로그램. 
public class CodingChallenge173_18 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentIds = new int[10];
        int[] scores = new int[10];

        System.out.println("10명 학생의 학번과 점수 입력");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ">> ");
            studentIds[i] = scanner.nextInt();
            scores[i] = scanner.nextInt();
        }

        while (true) {
            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>> ");
            int searchType;
            try {
                searchType = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("정수를 입력하세요.");
                scanner.nextLine();
                continue;
            }

            if (searchType == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (searchType == 1) {
                System.out.print("학번>> ");
                int studentId;
                try {
                    studentId = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < studentIds.length; i++) {
                        if (studentIds[i] == studentId) {
                            System.out.println(studentId + "점수: " + scores[i] + "점");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(studentId + "의 학생은 없습니다.");
                    }
                } catch (Exception e) {
                    System.out.println("정수를 입력하세요.");
                    scanner.nextLine();
                }
            } else if (searchType == 2) {
                System.out.print("점수>> ");
                int score;
                try {
                    score = scanner.nextInt();
                    boolean found = false;
                    StringBuilder studentList = new StringBuilder();
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] == score) {
                            studentList.append(studentIds[i]).append(" ");
                            found = true;
                        }
                    }
                    if (found) {
                        System.out.println("점수가 " + score + "인 학생은 " + studentList.toString() + "입니다.");
                    } else {
                        System.out.println("점수가 " + score + "인 학생은 없습니다.");
                    }
                } catch (Exception e) {
                    System.out.println("정수를 입력하세요.");
                    scanner.nextLine(); 
                }
            } else {
                System.out.println("잘못된 입력입니다. 1 또는 2를 입력하세요.");
            }
        }

        scanner.close();
    }
}
