package Public;
import java.util.Scanner;
//카페 계산하는 출력 프로그램. 
public class CodingChallenge172_17 {
	public static void main(String[] args) {
        String coffee[] = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int price[] = {3000, 3500, 4000, 5000};
        Scanner scanner = new Scanner(System.in);

        System.out.print("메뉴: ");
        for (String c : coffee) {
            System.out.print(c + " ");
        }
        System.out.println("입니다.");

        while (true) {
            System.out.print("주문>> ");
            String order = scanner.nextLine();

            if (order.equals("그만")) {
                break;
            }

            String[] parts = order.split(" ");
            if (parts.length < 2) {
                System.out.println("올바른 주문 형식이 아닙니다.");
                continue;
            }

            String coffeeName = parts[0];
            int quantity;

            try {
                quantity = Integer.parseInt(parts[1]);
                if (quantity <= 0) {
                    System.out.println("잔 수는 양의 정수로 입력해주세요!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("잔 수는 양의 정수로 입력해주세요!");
                continue;
            }

            int index = -1;
            for (int i = 0; i < coffee.length; i++) {
                if (coffee[i].equals(coffeeName)) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println(coffeeName + "는 없는 메뉴입니다.");
            } else {
                int totalPrice = price[index] * quantity;
                System.out.println("가격은 " + totalPrice + "원입니다.");
            }
        }

        scanner.close();
    }
}
