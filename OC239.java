package Public;
//n명이서 끝날잇기 하는 게임 
import java.util.Scanner;

public class OC239 {
    private Player[] players;
    private int playerCount;

    public OC239(int playerCount) {
        this.playerCount = playerCount;
        players = new Player[playerCount];
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < playerCount; i++) {
            System.out.print("참가자의 이름을 입력하세요>> ");
            String name = scanner.nextLine();
            players[i] = new Player(name);
        }

        String currentWord = "아버지";
        System.out.println("시작하는 단어는 " + currentWord + "입니다.");

        int currentPlayerIndex = 0;
        while (true) {
            Player currentPlayer = players[currentPlayerIndex];
            String nextWord = currentPlayer.setWordFromUser(currentWord);
            if (!checkSuccess(currentWord, nextWord)) {
                System.out.println(currentPlayer.getName() + "이 졌습니다.");
                break;
            }
            currentWord = nextWord;
            currentPlayerIndex = (currentPlayerIndex + 1) % playerCount;
        }
        scanner.close();
    }

    private boolean checkSuccess(String currentWord, String nextWord) {
        char lastChar = currentWord.charAt(currentWord.length() - 1);
        char firstChar = nextWord.charAt(0);
        return lastChar == firstChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        OC239 game = new OC239(numberOfPlayers);
        game.run();
        scanner.close();
    }

    class Player {
        private String name;

        public Player(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String setWordFromUser(String currentWord) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(name + ">> ");
            return scanner.nextLine();
        }
    }
}
