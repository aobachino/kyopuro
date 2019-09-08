import java.util.*;


public class Main{
	public static void main(String args[]){

		// 定数
		final int MAX = 3000;
		final int MIN = 1000;
		// 	入力値取得
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int yy = b;
		// 頻度(B－A)
		int dig = b - a;
		
		while(yy <= 3000){
				yy = yy + dig;
			// 前回開催年以前の場合は繰り返す。
			if(yy < t){
				continue;
			}else{
				break;
			}
		}

		// 出力
		System.out.println(yy);
	}
}
