import java.util.Scanner;

public class letme {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int sum = 0;
		System.out.print("请输入您要的录入的学生数：");
		int p = input.nextInt();
		
		int u = p+1;
		
		int mum[]= new int[u];
		
		for(int i =1;i<p;i++){
			System.out.print("请输入第"+i+"位同学的分数");
			mum[(i-1)]=input.nextInt();
		}
		
		int index = 0;
		
		System.out.print("请输入您要插入的值：");
		int j = input.nextInt();
		
		for(int i = 0;i<(mum.length - 1);i++){
			if(j>mum[i]){
				index = i;
				break;
				}
			}
		for(int i = (mum.length-1);i>index;i--){
			mum[i]=mum[i-1];
		}
		mum[index]=j;
		
		System.out.println("输出所有数值：");
			for(int i =0;i<p;i++){
				System.out.print(mum[i]+"  ");
			}
		
	}

}
