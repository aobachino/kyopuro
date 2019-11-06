//第一回日本最強プログラマー学生選手権決勝(オープンコンテスト)
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] A=new int[N];
		int[] B=new int[M];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<M;i++) {
			B[i]=sc.nextInt();
		}
		int sum[][]=new int [2*1000000][2];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				int s=A[i]+B[j];
				if(sum[s][1]!=0||sum[s][0]!=0) {
					System.out.println(i+" "+j+" "+sum[s][0]+" "+sum[s][1]);
					return;
				}else {
					sum[s][0]=i;
					sum[s][1]=j;
				}
			}
		}
		System.out.println(-1);
	}
}
