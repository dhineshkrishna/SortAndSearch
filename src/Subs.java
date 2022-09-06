import java.util.Scanner;

public class Subs {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String n="geek";
		int n1=n.length();
		char[] c=n.toCharArray();
		for(int i=0;i<n1;i++) {
			for(int j=n1-1;j>=(1*4-i);j--)
			{
				if(c[i]==c[j])
					System.out.print(c[i]);	
			}
		}
	}
}