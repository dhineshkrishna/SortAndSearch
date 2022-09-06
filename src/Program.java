import java.util.*;

public class Program {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        String s1="manigan";
        char[] strArray=s1.toCharArray();
        HashMap<Character,Integer> mapp = new HashMap<>();
        
        for (char c : strArray) {
            if (mapp.containsKey(c)) {
 
                // If char is present in charCountMap,
                // incrementing it's count by 1
                mapp.put(c, mapp.get(c) + 1);
            }
            else {
 
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                mapp.put(c, 1);
            }
        }
        System.out.println(mapp);
        
       
//        for (Integer name : mapp.values()) {
//            System.out.println("key: " + name);}
//}

  }}
		/**
		 * Palindrome
		 */
		//	    System.out.println("Enter the string");
		//	    String c=scan.next();
		//	    String b="";
		//	    for(int i=c.length();i>0;i--) {
		//	    	b=b+c.charAt(i-1);
		//	    }
		//	    if(c.equals(b)) {
		//	    	System.out.println("Its palindrome");
		//	    }
		//	    else {
		//	    	System.out.println("not palindrome");
		//	    }
		/**
		 * prime number
		 */
		//	    System.out.println("Enter the number");
		//	    int n=scan.nextInt();
		//	    int c=1;
		//	    for(int i=1;i<n;i++) {
		//	    	if(n%i==0) {
		//	    		c++;
		//	    	}
		//	    }	
		//	    	if(c==2) {
		//	    		System.out.println("its prime");
		//	    	}
		//	    	else {
		//	    		System.out.println("not prime");
		//	    	}
		/**
		 * fibanacci
		 */
		//	    System.out.println("Enter nth number");
		//	    int n=scan.nextInt();
		//	    int c=1,c1=1,c2;
		//	    System.out.print(c+" "+c1);
		//	    for(int i=2;i<n;i++) {
		//	    	c2=c+c1;
		//	    	System.out.print(" "+c2);
		//	    	c=c1;
		//	    	c1=c2;
		//	    }
		//		
		/**
		 * integer palindrome
		 */
		//	    System.out.println("Enetr the number");
		//	    int n=scan.nextInt();
		//	    int sum,n1;
		//	    sum=0;
		//	   int n2=n;
		//	    while(n!=0) {
		//	    	n1=n%10;
		//	    	sum=sum*10+n1;
		//	    	n=n/10;
		//	    }
		//	    if(sum==n2) {
		//	    	System.out.println("its palindrome");
		//	    }
		//	    else {
		//	    	System.out.println("its not palindrome");
		//	    }
		/**
		 * sum of digit
		 */
		//	    System.out.println("Enetr the number");
		//	    int n=scan.nextInt();
		//	    int sum,n1;
		//	    sum=0;
		//	   int n2=n;
		//	    while(n!=0) {
		//	    	n1=n%10;
		//	    	sum=sum+n1;
		//	    	n=n/10;
		//	    }
		//	    System.out.println(sum);
		/**
		 * armstrong
		 */
		//	    System.out.println("Enetr the number");
		//	    int n=scan.nextInt();
		//	    int sum,n1;
		//	    sum=0;
		//	   int n2=n;
		//	    while(n!=0) {
		//	    	n1=n%10;
		//	    	sum=sum+n1*n1*n1;
		//	    	n=n/10;
		//	    }
		//	    if(sum==n2)
		//	    System.out.println("armstrong");
		//	    else
		//	    	System.out.println("not arnstrong");
		/**
		 * factorial
		 */
		//	    System.out.println("Enter the number");
		//	    int n=scan.nextInt();
		//	    int fact=1;
		//	    for(int i=1;i<n;n--) {
		//	    	fact=fact*n;
		//	    }
		//	    System.out.println("fact is"+fact);
		/**
		 * remove dulicates in array
		 */
		//	    List<Integer> list=new ArrayList<>();
		//	    list.add(7);
		//	    list.add(10);
		//	    list.add(11);
		//	    list.add(17);
		//	    list.add(27); 
		//	    list.add(7);
		//	    System.out.println(list);
		//	    Set<Integer> set=new LinkedHashSet<>(list);
		//	    System.out.println(set);
		//	    list.clear();
		//	    list.addAll(set);
		//	    System.out.println("the removed list is"+ list);
		/**
		 * Pattern right triangle
		 */
		//	    int n=scan.nextInt();
		//	    for(int i=0;i<=n;i++) {
		//	    	for(int j=0;j<i;j++) {
		//	    		System.out.print("* ");
		//	    	}
		//	    	System.out.println();
		//	    }
		/**
		 * triangle
		 */
		//	    int n=scan.nextInt();
		//	    for(int i=0;i<=n;i++) {
		//	    	for(int j=0;j<1*4-i;j++) {
		//	    		System.out.print(" ");
		//	    	}
		//	    	for(int k=0;k<i*2-1;k++) {
		//	    		System.out.print("*");
		//	    	}
		//	    	System.out.println();
		//	    }
		//	    for(int i=0;i<=n;i++) {
		//	    	for(int j=0;j<i;j++) {
		//	    		System.out.print(" ");
		//	    	}
		//	    	for(int k=0;k<(1*4-i)*2-1;k++) {
		//	    		System.out.print("*");
		//	    	}
		//	    	System.out.println();
		//	    }
		/**
		 * duplicated located
		 */
//		System.out.println("enter string ");
//		String s=scan.nextLine();
//		char[] ch=s.toCharArray();
//		int count=1;
//		//	     System.out.print(" The repeated is: ");
//		for (int i=0;i<s.length();i++) {
//			for(int j=i+1;j<s.length();j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//					System.out.print(ch[i]);	
//
//				}
//
//			}
			
//		}

		
		/**
		 * great comom divisor
		 */
		//	     System.out.println("Enter two numbers");
		//	     int a=scan.nextInt();
		//	     int b=scan.nextInt();
		//	     while(b!=0) {
		//	    	 if (a>b) {
		//	    		 a=a-b;
		//	    	 }
		//	    	 else {
		//	    		 b=b-a;
		//	    	 }
		//	    	 
		//	     }
		//	     System.out.println("GCD"+a);
		/**
		 * Squareroot
		 */
		//	    System.out.println("Enter the number for sqrt");
		//	    double a=scan.nextDouble();
		//	    double b=Math.sqrt(a);
		//	    System.out.println(b);
		//	    String[] name= {"guna","mani","vel"};
		//	    System.out.println(Arrays.toString(name));
		//	    
		//	    Set<Integer> s=new HashSet<>();
		//	    boolean first=s.add(5);
		//	    boolean second=s.add(5);
		//	    
		//	    System.out.println(first);
		//	    System.out.println(second);
		//	    System.out.println(s.add(5));
		//	    import java.util.HashMap;
		//	    
		//	    public class FinalCountWords {
		//	     
		//	        public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	            String str = "This this is is done by Saket Saket";
		//	            String[] split = str.split(" ");
		//	           
		//	                    HashMap<String,Integer> map = new HashMap<String,Integer>();
		//	                    
		//	            for (int i=0; i<split.length; i++) {
		//	                if (map.containsKey(split[i])) {
		//	                   
		////	                	int count = map.get(split[i]);
		//	                    map.put(split[i], map.get(split[i])+1);
		//	                }
		//	                else {
		//	                    map.put(split[i], 1);
		//	                }
		//	            }
		//	            System.out.println(map);
		//	        
		//	            ///delete spaces
		//	            
		//	            {
		//	                String str1 = "Saket Saurav        is a QualityAna    list";
		//	          
		//	                //1. Using replaceAll() Method
		//	          
		//	                String str2 = str1.replaceAll("\\s", "");
		//	               
		//	                
		//	                System.out.println(str2);
		//	          
		//	                   }
//			            System.out.println("-----------------------occurance character");
	


