class Solution
{
	public static void main(String args[])
	{
		String a="bala";
		//String b=a.substring(0,1).toUpperCase()+a.substring(1);
		//           (or)
		
		String b=a.substring(0,1).toUpperCase();
		String c=b+a.substring(1);
		System.out.println(c);
		
	}
}


