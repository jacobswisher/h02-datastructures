/**
 *  This class contains a stack of cards (Strings).
 *
 */
public class CardStack {
	private String [] cards;	// Stack implemented as an array of Strings.
	private int top;		// accessing the top element of the stack.
	
	/* Constructor, to initialize a stack of 100 cards. */
	public CardStack() {
		cards = new String[100];
		top = -1;
	}

	/* Push a card into the stack. You may assume that the stack size is not longer than 52. */
	public void pushCard(String card) {
		if (top == -1)
		{
		    cards[0] = card;
		    top = 0;
		}
		else
		{
		    cards[top + 1] = card;
		    top++;
		}
	}
	
	/* Pop and return the popped card from the stack. Return null if trying to pop from an empty stack. */
	public String popCard() {
		if (top == -1)
		{
		    return null;
		}
		else 
		{
		    String temp;
		    temp = cards[top];
		    cards[top] = "";
		    top--;
		    return temp;
		}
	}
	
	/* Get the top card. Return null if stack is empty. */
	public String getTopCard() {
		if (top == -1)
		{
		    return null;
		}
		else
		{
		    return cards[top];
		}
	}
	
	/* Get the third card from the top. Return null if there are less than 3 cards in the stack. */
	public String getTop3Card() {
		if (top < 2)
		{
		    return null;
		}
		else
		{
		    return cards[top - 2];
		}
	}
	
	/* Set the top card. Throw an IllegalArgumentException if stack is empty with an appropriate message. */
	public void setTopCard(String card) {
		if (top == -1)
		{
		    throw new IllegalArgumentException("stack is empty");
		}
		else
		{
		    cards[top] = card;
		}
	}
	
	/* Set the third car from the top. Throw an IllegalArgumentException if stack doesn't have 3 cards with an appropriate message. */
	public void setTop3Card(String card) {
		if (top < 2)
		{
		    throw new IllegalArgumentException("stack has less than 3 cards");
		}
		else
		{
		    cards[top - 2] = card;
		}
	}
	
	/* Return the size of the stack. */
	public int size() {
		return (top + 1);
	}
	
	/* Print the entire stack. */
	public void printCardStack() {
		if (top == -1)
		{
		    return;
		}
		else
		{
		    for (int i = 0; i <= top; i++)
		    {
		        System.out.print(cards[i] + " ");
		    }
		    System.out.println();
		}
	}
}