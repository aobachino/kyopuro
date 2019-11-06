import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		// 値取得
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //参加人数
		int k = sc.nextInt(); //開始時の点数
		int q = sc.nextInt(); //正解者数
		int cnt = 0; //カウンター
		int corres[] = new int[q]; 
		int apps[] = new int[n];

		// 初期化：開始時から正解者数分値を引く
		Arrays.fill(apps, k-q);
		while(sc.hasNext()){
			corres[cnt] = sc.nextInt();
			cnt++;
		}

		// 正解者の点数を+1する
		for(int cor:corres){
			apps[cor-1] +=1;
		}

		// 突破者判定
		for(int app:apps){

			if(app <= 0){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}		
	}
}
