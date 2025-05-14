
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<=n;i++)
		{
			
			for(int j=0;j<=4;j++)
			{
				if(i==0||i==n||i==n/2||j==0||j==n)
				{
					System.out.print("*");
			
				}
				else
				{
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
	}

}
