package Public;
// 선수들이 점수 맞추는 게임 
import java.util.ArrayList;
import java.util.Scanner;

class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addScore() {
        score++;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class GuessGame {
    ArrayList<Player> players;
    Scanner scanner;

    public GuessGame() {
        players = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    public void play() {
        System.out.println("*** 예측 게임을 시작합니다. ***");
        System.out.print("게임에 참여할 선수 수>>");
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        // 선수들 등록
        for (int i = 0; i < playerCount; i++) {
            System.out.print("선수 이름>>");
            String playerName = scanner.nextLine();
            addPlayer(playerName);
        }

        boolean continuePlaying = true;
        while (continuePlaying) {
            // 랜덤 숫자 생성
            int hiddenAnswer = (int) (Math.random() * 100 + 1);
            System.out.println("1~100 사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");

            int closestPlayerIndex = -1;
            int smallestDifference = Integer.MAX_VALUE;

            // 각 플레이어가 숫자를 입력
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                System.out.print(player.getName() + ">>");
                int guessNumber = scanner.nextInt();

                // 차이 계산
                int diff = Math.abs(hiddenAnswer - guessNumber);

                // 가장 가까운 수를 제시한 플레이어 찾기
                if (diff < smallestDifference) {
                    closestPlayerIndex = i;
                    smallestDifference = diff;
                }
            }

            Player winner = players.get(closestPlayerIndex);
            winner.addScore();
            System.out.println("정답은 " + hiddenAnswer + ". " + winner.getName() + "이 이겼습니다. 승점 1점 확보!");

            // 게임을 계속할지 여부 묻기
            System.out.print("계속하려면 yes 입력>>");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("yes")) {
                continuePlaying = false;
            }

            // 점수 현황 출력
            for (Player player : players) {
                System.out.println(player.getName() + ": " + player.getScore());
            }
        }

        // 최종 승자 찾기
        Player finalWinner = players.get(0);
        for (Player player : players) {
            if (player.getScore() > finalWinner.getScore()) {
                finalWinner = player;
            }
        }

        System.out.println(finalWinner.getName() + "이 최종 승리하였습니다.");
    }
}

public class CC249_9 {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.play();
    }
}
