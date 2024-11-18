package Practice06;
import java.util.Random;
import java.util.Scanner;
// 이거 실패 
public class Q9 { 
    private char[][] board;
    private final int size = 5;

    public Q9(String[] words) {
        board = new char[size][size];
        Random random = new Random();

        // 배열을 랜덤 문자로 초기화
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = (char) ('a' + random.nextInt(26));
            }
        }

        // 단어를 배열에 삽입
        for (String word : words) {
            placeWord(word);
        }
    }

    // 단어를 배열에 무작위로 배치하는 메소드
    private void placeWord(String word) {
        Random random = new Random();
        boolean placed = false;

        while (!placed) {
            int direction = random.nextInt(4); // 0: 가로, 1: 세로, 2: 대각선(오른쪽), 3: 대각선(왼쪽)
            int row = random.nextInt(size);
            int col = random.nextInt(size);

            switch (direction) {
                case 0: // 가로
                    if (col + word.length() <= size) {
                        if (canPlaceHorizontal(row, col, word)) {
                            for (int i = 0; i < word.length(); i++) {
                                board[row][col + i] = word.charAt(i);
                            }
                            placed = true;
                        }
                    }
                    break;
                case 1: // 세로
                    if (row + word.length() <= size) {
                        if (canPlaceVertical(row, col, word)) {
                            for (int i = 0; i < word.length(); i++) {
                                board[row + i][col] = word.charAt(i);
                            }
                            placed = true;
                        }
                    }
                    break;
                case 2: // 대각선(오른쪽)
                    if (row + word.length() <= size && col + word.length() <= size) {
                        if (canPlaceDiagonalRight(row, col, word)) {
                            for (int i = 0; i < word.length(); i++) {
                                board[row + i][col + i] = word.charAt(i);
                            }
                            placed = true;
                        }
                    }
                    break;
                case 3: // 대각선(왼쪽)
                    if (row + word.length() <= size && col - word.length() >= -1) {
                        if (canPlaceDiagonalLeft(row, col, word)) {
                            for (int i = 0; i < word.length(); i++) {
                                board[row + i][col - i] = word.charAt(i);
                            }
                            placed = true;
                        }
                    }
                    break;
            }
        }
    }

    private boolean canPlaceHorizontal(int row, int col, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (board[row][col + i] != ' ' && board[row][col + i] != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean canPlaceVertical(int row, int col, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (board[row + i][col] != ' ' && board[row + i][col] != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean canPlaceDiagonalRight(int row, int col, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (board[row + i][col + i] != ' ' && board[row + i][col + i] != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean canPlaceDiagonalLeft(int row, int col, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (board[row + i][col - i] != ' ' && board[row + i][col - i] != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[4];

        System.out.println("4개의 단어를 입력하세요:");
        for (int i = 0; i < 4; i++) {
            words[i] = scanner.nextLine();
        }

        Q9 game = new Q9(words);  // 단어들을 배열에 배치
        game.printBoard();  // 결과 출력
    }
}
