package Practice06;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
    private static final String[] words = {"happy", "lonely", "apple", "orange", "friend"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shuffledWords = new ArrayList<>();
        Collections.addAll(shuffledWords, words);

        // 단어들을 섞는다
        Collections.shuffle(shuffledWords);

        // 타이머 시작
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 10000;  // 10초 타이머 설정 (10,000ms)

        boolean success = false;
        int index = 0;

        System.out.println("10초 안에 단어를 맞추세요!!");

        // 게임 진행
        while (System.currentTimeMillis() < endTime && index < shuffledWords.size()) {
            // 섞은 단어 생성
            String currentWord = shuffledWords.get(index);
            String scrambledWord = scrambleWord(currentWord);

            // 섞인 단어 출력
            System.out.println("단어: " + scrambledWord);
            System.out.print(">> ");
            String input = scanner.nextLine().trim();

            // 종료 명령 처리
            if (input.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            // 정답과 비교
            if (input.equals(currentWord)) {
                System.out.println("성공!");
                index++;  // 다음 단어로 넘어가도록 설정
            } else {
                System.out.println("실패!! " + currentWord + " 입니다.");
                break;
            }
        }

        // 시간 초과 또는 실패 시 메시지 출력
        if (index == shuffledWords.size()) {
            System.out.println("모든 단어를 맞췄습니다!");
        } else if (System.currentTimeMillis() >= endTime) {
            System.out.println("시간이 초과되었습니다. 게임을 종료합니다.");
        }
    }

    // 단어를 섞는 메서드
    private static String scrambleWord(String word) {
        List<Character> characters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            characters.add(c);
        }
        Collections.shuffle(characters);
        StringBuilder scrambledWord = new StringBuilder();
        for (char c : characters) {
            scrambledWord.append(c);
        }
        return scrambledWord.toString();
    }
}
