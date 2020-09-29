/**
 * This class generates random
 */
 
import java.util.Scanner;

public class CardSolo {
	
			public static boolean matchCard (String cardA, String cardB) {
		// TODO: How will you know if CardA can be matched to cardB? Return true if the 2 cards match.
		if (cardA == null || cardB == null)
		return false;
		if (cardA.charAt(0) == cardB.charAt(0) || cardA.charAt(1) == cardB.charAt(1))
		return true;
		return false;
	}
	
	public static void main(String [] args) {
		boolean bool = false;
		// Need 2 stacks.
		CardStack A = new CardStack();
		CardStack B = new CardStack();
		Scanner inputScanner = new Scanner(System.in);
		String inputCard;
		// while there is a card in the input.
		while (inputScanner.hasNext()) 
		{
			inputCard = inputScanner.next();
			do
			{
			    if (matchCard(inputCard, A.getTop3Card()))
		    	{
			        B.pushCard(A.popCard());
			        B.pushCard(A.popCard());
			        A.popCard();
			        continue;
			    }
			    else if (matchCard(inputCard, A.getTopCard()))
			    {
			        A.popCard();
			        bool = true;
			        continue;
			    }
		    	else
		    	{
		    	    bool = false;
			        A.pushCard(inputCard);
			        while (B.size() > 0)
			        {
			            A.pushCard(B.popCard());
			        }
		    	}
			} while (B.size() != 0 || bool);
		}
		System.out.print("Number of piles is " + A.size() + ": ");
		A.printCardStack();
	}
}
