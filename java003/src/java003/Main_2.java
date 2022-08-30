package java003;

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i<a; i++) {
			sum += b.charAt(i)-'0';
		}
		
		System.out.println(sum);

	}

}

 