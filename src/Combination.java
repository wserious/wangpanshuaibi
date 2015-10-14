import java.util.Scanner;

public class Combination {
	public static void main(String[] args){
		int n=0;
		int r=0;
		Scanner in= new Scanner(System.in);
		System.out.println("输入n");
		n=in.nextInt();
		System.out.println("输入r");
		r=in.nextInt();
		int[] integer=new int[n];
		for(int i=0;i<n;i++){
			integer[i]=i+1;
		}
		Combination(integer,n, r, 0);
	}
	
	public static void Combination(int[] integer,int n, int r,int count){
		//当取满3个数时输出.count=3时
		if(count==r){
			for(int i=0;i<r;i++){
				System.out.print(integer[i]+" ");
			}
			System.out.println();
			return;
		}
		
		if(count<r){
			for(int i=count;i<n;i++){
				if((count>0&&integer[i]>integer[count-1])||count==0){
					
					int temp=integer[count];
					integer[count]=integer[i];
					integer[i]=temp;
					
//					for(int j=0;j<n;j++){
//						System.out.print(integer[j]+" ");
//					}
//					System.out.print("change ");
//					System.out.println(count+" "+i);
					
					//递归调用
					Combination(integer,n,r,count+1);
					
					//回退到上一步，将交换的数字交换回来
					temp=integer[count];
					integer[count]=integer[i];
					integer[i]=temp;
					
//					for(int j=0;j<n;j++){
//						System.out.print(integer[j]+" ");
//					}
//					System.out.print("back ");
//					System.out.println(count+" "+i);
				}
			}
		}
	}
	
	public static void print(){
		
	}
}
