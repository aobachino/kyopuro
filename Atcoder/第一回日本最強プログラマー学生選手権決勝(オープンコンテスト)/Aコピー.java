//������{�ŋ��v���O���}�[�w���I�茠����
import java.util.*;
import java.util.ArrayList;

public class Main {
    
    static int voteMin = 0;
    static int voteMax = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        // �錾
        ArrayList<Integer> voteNums = new ArrayList<>(); 
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        // ���͒l�擾
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        while(sc.hasNext()){
            voteNums.add(sc.nextInt());
        }
        
        // �ő哊�[���ƍŏ����[�������Ƃ߂�B
        minmax(voteNums);
        
        // ���X�g���r���Ă���
        for(int i=0;i<voteNums.size();i++){
            if(voteNums.get(i)+x < voteMax){
                ans.add(i);
            }else{
                continue;
            }
        }
        System.out.println(voteNums.size()-ans.size());
    }
    
    // �ő�l�ƍŏ��l�����߂郁�\�b�h
    public static void minmax(ArrayList<Integer> ivoteList){

        voteMin = 0;
        voteMax = 0;
        
        // Min,Max�����߂�
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
