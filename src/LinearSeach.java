
public class LinearSeach {

	static int menu(int[] num,int num1) {
		int y=num.length;
		int z=-1;
		for(int i=0;i<y;i++) {
			if(num[i]==num1) {
				z=i;
			}
		}
		return z;
	}
	public static void main(String[] args) {
        int [] num= {1,3,10,15,15,20,45};
        int num1=23;
		int l=LinearSeach.menu(num, num1);
		if(l!=-1) {
			System.out.println("your element found");
		}
		else
			System.out.println("Not found");
	}

}
