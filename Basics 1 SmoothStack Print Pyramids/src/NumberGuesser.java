
import java.util.Random;
import java.util.Scanner;
public class NumberGuesser 
{
	
	public static void main(String[] args)
	{
		Random ran = new Random();
        Scanner scan = new Scanner(System.in);
       
		int mysteryNum = ran.nextInt(100)+1,numGuesses = 0,guess = 0;
		System.out.println("Number Guesser 1-100\n5 Guesses Max\n");
		
		boolean guessed = false;
		do
		{
			System.out.println( "Guess #"+(numGuesses+1));
			System.out.print("Number:");
			guess = scan.nextInt();
			if( mysteryNum-10 <= guess  && guess <= mysteryNum+10)
				guessed = true;
			else
			{
				System.out.println("Incorrect");
				numGuesses++;
			}
			System.out.println();
		}while(guessed == false && numGuesses < 5 );
		
		if(guessed)
			System.out.println("Correct");
		else
			System.out.println("Sorry Out of Guesses \nBetter Luck Next Time");
		System.out.println("MysteryNum:"+mysteryNum);
		scan.close();
		
	}

}
