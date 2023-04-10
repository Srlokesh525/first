
public class Program1 {

	public static void main(String[] args) {
		//1
		String A = "lokesh";
		String B = "kodnest";
		int length1 = A.length();
		int length2 = B.length();
		System.out.println(length1+length2 );
		//2
		//compareTo() can be used to compare
		//String values lexicographically
		if(A.compareTo(B)>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		//3
		String str = "";
		String str1 = "";

		for (int i = 0; i < A.length(); i++) 
		{
			if(i==0)
			{
				char c = ((char)((int)A.charAt(0)-32));
				str = str+c;
			}
			else
			{
				str = str+A.charAt(i);
			}
		}
		for (int i = 0; i < B.length(); i++) 
		{
			if(i==0)
			{
				char c = ((char)((int)B.charAt(0)-32));
				str1 = str1+c;
			}
			else
			{
				str1 = str1+B.charAt(i);
			}
		}
		System.out.println(str+" "+str1);
	}
}
