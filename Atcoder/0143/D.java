import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // �錾
        Scanner sc  = new Scanner(System.in);
        int count = 0;
        // ���͒l�擾
        int rod = sc.nextInt();
        int lens[] = new int[rod];
        while(sc.hasNext()){
            lens[count] = sc.nextInt();
            count++;
        }
        
        // Arrays.sort(lens);
        // �g�ݍ��킹���o��a��
        Arrays.sort(lens);
        count = 0;
        for(int i=0;i<lens.length;i++){
            for(int j=i+1;j<lens.length;j++){
                for(int k=j+1;k<lens.length;k++){
                    if( (lens[i] < (lens[j] + lens[k])) && (lens[j] < (lens[k] + lens[i])) && (lens[k] < (lens[i] + lens[j])) ){
                        count++;                        
                    }
                    
                }
            }
        }
        System.out.println(count);
    }
}
