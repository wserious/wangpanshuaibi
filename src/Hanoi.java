import java.util.Scanner;


public class Hanoi {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("输入盘数n:");
		int n=in.nextInt();
		hanoiTower(n,'A','B','C');
	}
	
	//假设3个塔分别为ABC，需要从A移到C上
	//n个盘，1号盘最小，n号盘最大

	public static void hanoiTower(int dishLeft,char start,char middle,char end){
		if(dishLeft==1){
			System.out.println("从"+start+"移动1号盘到"+end);
		}else{
			hanoiTower(dishLeft-1,start,end,middle);
			System.out.println("从"+start +"移动"+dishLeft+"号盘到"+end);
			hanoiTower(dishLeft-1,middle,start,end);
		}
	}
}
