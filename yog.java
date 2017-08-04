import java.util.Scanner;

public class u {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int l=s.length();
		int count=0,count1=0,count2=0;
		for(int i=0;i<l;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				count++;
			}
			else
				{
				if(Character.isAlphabetic(s.charAt(i)))
			{
				count1++;
			}
			else
			{
				count2++;
			}
				}
		}
		System.out.println(count+" =digit"+count1+"= alphabet "+count2+"=special characters ");

	}

}
