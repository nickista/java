package Public;
//콘서트 예약 프로그램 
import java.util.Scanner;

class Concert {
    private String[] sSeats = new String[10];
    private String[] aSeats = new String[10];
    private String[] bSeats = new String[10];

    public Concert() {
        for (int i = 0; i < 10; i++) {
            sSeats[i] = "---";
            aSeats[i] = "---";
            bSeats[i] = "---";
        }
    }

    public void showSeats(String[] seats, String seatType) {
        System.out.print(seatType + ">> ");
        for (String seat : seats) {
            System.out.print(seat + " ");
        }
        System.out.println();
    }

    public void showAllSeats() {
        showSeats(sSeats, "S");
        showSeats(aSeats, "A");
        showSeats(bSeats, "B");
    }

    private boolean isValidSeatNumber(int seatNumber) {
        return seatNumber >= 1 && seatNumber <= 10;
    }

    public void reserve(int seatType, String name, int seatNumber) {
        if (!isValidSeatNumber(seatNumber)) {
            System.out.println("잘못된 좌석 번호입니다. 다시 시도해주세요.");
            return;
        }

        String[] selectedSeats = selectSeatArray(seatType);

        if (selectedSeats == null) {
            System.out.println("잘못된 좌석 구분입니다. 다시 시도해주세요.");
            return;
        }

        if (!selectedSeats[seatNumber - 1].equals("---")) {
            System.out.println("이미 예약된 좌석입니다. 다시 시도해주세요.");
        } else {
            selectedSeats[seatNumber - 1] = name;
            System.out.println("예약되었습니다.");
        }
    }

    public void cancel(String name) {
        boolean found = false;
        found = cancelReservation(name, sSeats, "S") || found;
        found = cancelReservation(name, aSeats, "A") || found;
        found = cancelReservation(name, bSeats, "B") || found;

        if (!found) {
            System.out.println("예약자를 찾을 수 없습니다.");
        }
    }

    private boolean cancelReservation(String name, String[] seats, String seatType) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].equals(name)) {
                seats[i] = "---";
                System.out.println(name + "님의 예약이 취소되었습니다. (" + seatType + "석)");
                return true;
            }
        }
        return false;
    }

    public String[] selectSeatArray(int seatType) { // 변경: public으로 수정
        switch (seatType) {
            case 1:
                return sSeats;
            case 2:
                return aSeats;
            case 3:
                return bSeats;
            default:
                return null;
        }
    }
}

public class CC252_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Concert concert = new Concert();
        boolean running = true;

        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (running) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    int seatType = scanner.nextInt();
                    concert.showSeats(concert.selectSeatArray(seatType), seatType == 1 ? "S" : seatType == 2 ? "A" : "B");

                    System.out.print("이름>>");
                    String name = scanner.next();

                    System.out.print("번호>>");
                    int seatNumber = scanner.nextInt();

                    concert.reserve(seatType, name, seatNumber);
                    break;

                case 2:
                    concert.showAllSeats();
                    break;

                case 3:
                    System.out.print("이름>>");
                    String cancelName = scanner.next();
                    concert.cancel(cancelName);
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        }

        scanner.close();
    }
}
