package Practice06;
// 알파벳의 빈도수를 계산하는 히스토그램 프로그램 만들
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodingChallenge06 {
    public static void main(String[] args) {
        // 사용자로부터 입력 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력을 받을 StringBuilder 생성
        StringBuilder text = new StringBuilder();

        System.out.println("Enter text (end input with ';'): ");
        
        // 입력 받은 텍스트를 StringBuilder에 누적
        while (true) {
            String line = scanner.nextLine();
            if (line.contains(";")) {
                // ';'가 포함되면 입력 종료
                int semicolonIndex = line.indexOf(";");
                text.append(line, 0, semicolonIndex);
                break;
            }
            text.append(line).append("\n");
        }
        
        // 알파벳 빈도 계산을 위한 HashMap
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // 텍스트에서 각 알파벳만 카운트
        for (char c : text.toString().toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) { // 알파벳만 처리
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // 알파벳별로 히스토그램 출력
        for (char c = 'a'; c <= 'z'; c++) {
            if (frequencyMap.containsKey(c)) {
                System.out.println(c + ": " + "-".repeat(frequencyMap.get(c)));
            }
        }

        scanner.close();  // Scanner 종료
    }
}

