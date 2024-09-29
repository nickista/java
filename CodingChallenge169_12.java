package Public;
import java.util.Random;
import java.util.Scanner;
//성별 입력하고 성을 입력하면 이름을 추천하는 프로그램 
public class CodingChallenge169_12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String boyMiddleList[] = {"기", "민", "용", "종", "현", "진", "재", "승", "소", "상", "지"};
        String boyLastList[] = {"태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};
        String girlMiddleList[] = {"은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String girlLastList[] = {"진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};

        System.out.println("***** 작명 프로그램이 실행됩니다 *****");

        while (true) {
            System.out.print("남/여 선택>> ");
            String gender = scanner.nextLine();  // 성별 입력

            if (gender.equals("그만")) {
                break;  // "그만" 입력 시 프로그램 종료
            } else if (!gender.equals("남") && !gender.equals("여")) {
                System.out.println("남/여/그만 중에서 입력하세요!");
                continue;  // 잘못된 입력 시 다시 입력 받기
            }

            System.out.print("성 입력>> ");
            String lastName = scanner.nextLine();  // 성 입력

            String name;
            if (gender.equals("여")) {
                String middle = girlMiddleList[random.nextInt(girlMiddleList.length)];  // 랜덤 중간 이름
                String last = girlLastList[random.nextInt(girlLastList.length)];      // 랜덤 마지막 이름
                name = lastName + middle + last;  // 여성 이름 조합
            } else {
                String middle = boyMiddleList[random.nextInt(boyMiddleList.length)];  // 랜덤 중간 이름
                String last = boyLastList[random.nextInt(boyLastList.length)];        // 랜덤 마지막 이름
                name = lastName + middle + last;  // 남성 이름 조합
            }

            System.out.println("추천 이름: " + name);
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
