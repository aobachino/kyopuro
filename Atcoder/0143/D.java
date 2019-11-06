import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // éŒ¾
        Scanner sc  = new Scanner(System.in);
        int count = 0;
        // “ü—Í’læ“¾
        int rod = sc.nextInt();
        int lens[] = new int[rod];
        while(sc.hasNext()){
            lens[count] = sc.nextInt();
            count++;
        }
        
        // Arrays.sort(lens);
        // ‘g‚İ‡‚í‚¹’Šoˆa—
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
