import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
String a=in.next();
int l=a.length();
for(int i=0;i<l;i++)
{
if(a.charAt(i)=='q'||a.charAt(i)=='Q')
{
break;
}
else
{
	System.out.print(a.charAt(i));
}
	}
	}
}
