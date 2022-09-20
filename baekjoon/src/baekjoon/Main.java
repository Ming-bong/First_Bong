package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int [26];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = sc.nextLine();
		
		for(int i = 0; i<S.length(); i++) {
			char ch = S.charAt(i);
			// length는 상수이고 length()는 메소드
			// 배열에서 사용 가능한 length는 최초 배열이 생성 될 때 길이가 결정 되는 상수
			// String의 length() 메소드는 호출 될 때 (가변적) 문자의 길이를 결정하는 변수
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
	
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}

	}

}
