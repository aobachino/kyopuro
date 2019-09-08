import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String args[]){
		
		// 定数

		// 入力値取得
		Scanner sc = new Scanner(System.in);
		int lineNum = sc.nextInt();
		ArrayList<String> strs = new ArrayList<>();
		ArrayList<String> results = new ArrayList<>();

		for(int i = 0;i < lineNum;i++){
			strs.add(sc.next());
			// System.out.println(strs.get(i));
		}

		// 判定
		for(int j = 0;j < strs.size();j++){
			// 含まれているか判定
			if(strs.get(j).matches(".*okyo.*ech.*")){
				results.add("Yes");
			}else{
				results.add("No");
			}
		}
		// 出力
		for(String outputs : results){

			System.out.println(outputs);
		}

	}
}