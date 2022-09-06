
public class BubbleSort {
	static void sort(int[] num) {
		int n=num.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
	public static void main(String []args) {
		int[] num= {10,15,20,-5,-2,60,100,-1,-100};
		BubbleSort.sort(num);
		for(int l:num) {
			System.out.println(l);
		}
	}
}