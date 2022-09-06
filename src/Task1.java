import java.util.HashMap;

public class Task1 {
	
	


	public static void main(String[] args) {
		String s="character";
		char [] ch=s.toCharArray();
		int count=0;
		HashMap<Character,Integer> mapp=new HashMap<>();
		for(int i :ch) {
			if(mapp.containsKey(i)) {
				mapp.put(ch[i], mapp.get(i)+1);
				
				
			}else {
				mapp.put(ch[i], 1);
				System.out.println(ch[i]+" "+i);
			}
			
		}

	}

}
