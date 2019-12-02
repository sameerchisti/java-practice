import java.util.*;
public class strpalindrome {

	public static void main(String[] args) {
		String str, rev="";
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter string :");
		str= sc.next();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+str.length();
		if(str.equals(rev))
		{
			System.out.println(" String is palindrome:" +str);
		}
		else
		{
				System.out.println("String is not pallindrome:" +str);
		}
		sc.close();
		
	}

}
