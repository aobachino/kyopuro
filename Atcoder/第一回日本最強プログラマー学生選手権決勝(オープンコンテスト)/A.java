//������{�ŋ��v���O���}�[�w���I�茠����(�I�[�v���R���e�X�g)
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        // �錾
        StringBuffer sb = new StringBuffer();
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> nWeights = new ArrayList<>();
        ArrayList<Integer> mWeights = new ArrayList<>();
        HashMap<String,Integer> patterns = new HashMap<>();
        ArrayList<String> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        
        // ���͒l�擾
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=0;i<n;i++){
            nWeights.add(sc.nextInt());
        }
        
        for(int j=0;j<m;j++){
            mWeights.add(sc.nextInt());
        }
    
        // �l�^�̑g�ݍ��킹�i�[����B
        int weight =0;
        String key = "";
        for(int k=0;k<nWeights.size();k++){
            for(int l=0;l<mWeights.size();l++){
                // �L�[�𐶐�
                sb = new StringBuffer(String.valueOf(k));
                sb.append(" ");
                sb.append(String.valueOf(l));
                key = sb.toString();
                // System.out.println(key);                
                // �l���쐬
                weight = nWeights.get(k) + mWeights.get(l);
                patterns.put(key,weight);
            }
        }
        
        // �L�[�ƒl�����X�g�ɕ���
        keys = new ArrayList<>(patterns.keySet());
        values = new ArrayList<>(patterns.values());
        
        // �g�ݍ��킹���r
        for(int u=0;u<values.size();u++){
            for(int v=0;v<values.size();v++){
                // values���X�g�����r
                if(u != v && values.get(u) == values.get(v)){
                    ans.add(keys.get(u));

                }
            }
        }
        // System.out.println(ans.size());
        ArrayList<Integer> indexs = new ArrayList<>(); 
        // �o��
        // ���X�g�T�C�X��0�̏ꍇ�|1���o��
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
