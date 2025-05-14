
public class iNeuronProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=15;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==0 || i==n-1 ||j==n/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
										
				}
				System.out.print(" ");
				
				
					for(int j=0;j<n;j++)
					{
						if(j==0 || i==j ||j==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.print(" ");
			}
			System.out.println( " ");
	}

}
