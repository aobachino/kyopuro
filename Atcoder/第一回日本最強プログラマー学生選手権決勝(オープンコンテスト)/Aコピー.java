//第一回日本最強プログラマー学生選手権決勝
import java.util.*;
import java.util.ArrayList;

public class Main {
    
    static int voteMin = 0;
    static int voteMax = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        // 宣言
        ArrayList<Integer> voteNums = new ArrayList<>(); 
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        // 入力値取得
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        while(sc.hasNext()){
            voteNums.add(sc.nextInt());
        }
        
        // 最大投票数と最小投票数をもとめる。
        minmax(voteNums);
        
        // リストを比較していく
        for(int i=0;i<voteNums.size();i++){
            if(voteNums.get(i)+x < voteMax){
                ans.add(i);
            }else{
                continue;
            }
        }
        System.out.println(voteNums.size()-ans.size());
    }
    
    // 最大値と最小値を求めるメソッド
    public static void minmax(ArrayList<Integer> ivoteList){

        voteMin = 0;
        voteMax = 0;
        
        // Min,Maxを求める
        for(int i=0;i<ivoteList.size();i++){
            if(i == 0){
                voteMin = ivoteList.get(i);
                voteMax = ivoteList.get(i);
            }else{
                if(voteMin > ivoteList.get(i)){
                    voteMin = ivoteList.get(i);
                }else if(voteMax < ivoteList.get(i)){
                    voteMax = ivoteList.get(i);
                }else{
                    continue;
                }
            }
        }
        
    }
}
