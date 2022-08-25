package java002;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean [] sNum = new boolean [10001];
		
		for(int i = 1; i<10001; i++) {
			int num = d(i);
			
			if(num < 10001) {
				sNum[num] = true;
			}
		}
		
		for(int i = 1; i<10001; i++) {
			if(sNum[i] == false) {
				System.out.println(i);
			}
		}
		
}
	
	public static int d (int N) {
		int sum = N;
		
		while(N!=0) {
			sum = sum + N%10;
			N = N/10;
		}
		
		return sum;
		
	}
}