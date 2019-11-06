//第一回日本最強プログラマー学生選手権決勝(オープンコンテスト)
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        // 宣言
        StringBuffer sb = new StringBuffer();
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> nWeights = new ArrayList<>();
        ArrayList<Integer> mWeights = new ArrayList<>();
        HashMap<String,Integer> patterns = new HashMap<>();
        ArrayList<String> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        
        // 入力値取得
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=0;i<n;i++){
            nWeights.add(sc.nextInt());
        }
        
        for(int j=0;j<m;j++){
            mWeights.add(sc.nextInt());
        }
    
        // ネタの組み合わせ格納する。
        int weight =0;
        String key = "";
        for(int k=0;k<nWeights.size();k++){
            for(int l=0;l<mWeights.size();l++){
                // キーを生成
                sb = new StringBuffer(String.valueOf(k));
                sb.append(" ");
                sb.append(String.valueOf(l));
                key = sb.toString();
                // System.out.println(key);                
                // 値を作成
                weight = nWeights.get(k) + mWeights.get(l);
                patterns.put(key,weight);
            }
        }
        
        // キーと値をリストに分離
        keys = new ArrayList<>(patterns.keySet());
        values = new ArrayList<>(patterns.values());
        
        // 組み合わせを比較
        for(int u=0;u<values.size();u++){
            for(int v=0;v<values.size();v++){
                // valuesリスト内を比較
                if(u != v && values.get(u) == values.get(v)){
                    ans.add(keys.get(u));

                }
            }
        }
        // System.out.println(ans.size());
        ArrayList<Integer> indexs = new ArrayList<>(); 
        // 出力
        // リストサイスが0の場合－1を出力
        if(ans.size() == 0){
            System.out.println("-1");
        }else if(ans.size() > 2){
            for(int f=0;f<ans.size();f+=2){
                String s1 = ans.get(f);
                String s2 = ans.get(f+1);
                if(s1.substring(0,1).equals(s2.substring(0,1)) || s1.substring(2,3).equals(s2.substring(2,3))){
                    indexs.add(f);
                    indexs.add(f+1);
                }
            }
   
             for(int index:indexs){
                ans.remove(index);
             }

            for(String str:ans){
                System.out.print(str);
                System.out.print(" ");            
            }
            
        }else{
            for(String str:ans){
                System.out.print(str);
                System.out.print(" ");            
            }

        }
    }
}
