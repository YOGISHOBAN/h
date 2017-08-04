import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int big=0,small=0,temp=0,temp1=0;
		System.out.println("enter the first number");
		int x=in.nextInt();
		System.out.println("enter the second number");
		int y=in.nextInt();
		if(x>y)
		{
			big=x;
			small=y;
		}
		else
		{
			big=y;
			small=x;
		}
		for(int i=0;i<small;i++)
		{
			temp=big*i;
			if(temp%small==0)
			{
				temp1=temp;
				break;
			}
		}
		System.out.println(temp1+"= L.C.M");

	}

}
