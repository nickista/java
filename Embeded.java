package Public;
import java.util.Scanner;
//정수를 입력받아 냉장고의 상태를 확인하는 프로그
public class Embeded {
	public static void main(String[] args) {
		
		System.out.print("냉장고 상태 입력>> ");
		Scanner scanner = new Scanner(System.in); // 사용자가 원하는 타입으로 변경. Scanner 객체를 생성하여 입력 받을 수 있다.
	
		String str = scanner.next(); // 문자열로 "00001101" 등을 입력
		byte status = Byte.parseByte(str, 2); // 문자열 "0001101"을 2진수 00001101로 만들어 받이트 타입의 정수 status에 저장
		
		if((status & 0b00000001) != 0) System.out.print("전원 켜져 있음.");
		else System.out.print("전원 꺼져 있음.");
		
		if((status & 0b00000010) != 0) System.out.print("문 열려 있음.");
		else System.out.print("문 닫혀 있음.");
		
		if((status & 0b00000100) != 0) System.out.print("전구 정상 작동.");
		else System.out.print("전구 꺼져 있음.");
		
		if((status & 0b00001000) != 0) System.out.print("냉장도 온도 3도 이상.");
		else System.out.print("냉장고 온도 3도 이하");
	}
}
