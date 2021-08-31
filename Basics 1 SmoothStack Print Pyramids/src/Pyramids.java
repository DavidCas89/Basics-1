
public class Pyramids 
{
	static String[] leftpyramids = {".........","****","***","**","*"};
	static String[] centerpyramids = {"...........","*******","*****","***","*"};
	
	
	public static void main(String[] args)
	{
		System.out.println("1)");
		for(int i = leftpyramids.length-1; i >= 0; i--)
		{
			System.out.println(leftpyramids[i]);
		}
		
		System.out.println("2)");
		for(int i = 0; i < leftpyramids.length; i++)
		{
			System.out.println(leftpyramids[i]);
		}
		
		
		System.out.println("3)");
		for(int i = centerpyramids.length-1; i >= 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			System.out.println(centerpyramids[i]);
		}
		
		System.out.println("4)");
		for(int i = 0; i < centerpyramids.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			System.out.println(centerpyramids[i]);
			
		}
		
		
		
	}
}
