import java.util.Scanner;
public class Another {
static int row;
public static void main(String args[]){
System.out.print("Please input n:");//这里n取8
Scanner scan1=new Scanner(System.in);
int n=scan1.nextInt();
  
System.out.print("Please input r:");//这里r取5
Scanner scan2=new Scanner(System.in);
int r=scan2.nextInt();
int[] list=new int[n];
for(int i=0;i<n;i++){
list[i]=i+1;
}
combination(list,r,0,n);
  }
/**
* 递归函数
* @author 施云霄
*/
  static void combination(int[] list,int r,int low,int n){
  
  if(low<r){
  for(int j=low;j<n;j++){
  if((low>0&&list[j]<list[low-1])||low==0){
  int temp=list[low];
  list[low]=list[j];
  list[j]=temp;
  combination(list,r,low+1,n);
  temp=list[low];
  list[low]=list[j];
  list[j]=temp;
  }
  }
  }
  if(low==r){
  for(int i=0;i<r;i++){
  System.out.print(list[i]+" ");
  }
  System.out.println(" ");
  }	
  }
}