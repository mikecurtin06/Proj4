//TODOa complete this javadoc comment
/**
* This class describes the game snap, crackle, and pop. 
* @author Michael Curtin
* @version 1.0
*/

//TODO1: declare the SnapCracklePop class
 public class SnapCracklePop{
	 

   //TODOb Complete Comments
   /**
   * Declaring 3 variables snap, crackle, & pop that we 
   * will later assign numeric values via user input
   */
   
   //TODO2 Declare private instance variables 
   //to store Snap, Crackle, and Pop values
	 private int snap;
	 private int crackle;
	 private int pop;
   
   
   //TODOc complete comments
   /**
   * This constructor takes in three ints and assigns them
   * to their corresponding variable .
   * @param a represents the value that snap will hold
   * @param b represents the value that crackle will hold
   * @param c represents the value that pop will hold
   */
	 
   
   //TODO3 Write the constructor
	 
	 public void SnapCracklePop(int a, int b, int c) {
		 snap = a;
		 crackle = b;
		 pop = c;
	 }
   
   //TODOe complete comments
   /**
   * This method plays out a single round of the game 
   * "Snap, Crackle, Pop".
   * @param roundNum represents the current round number
   * and is compared to by the values of snap, crackle, 
   * and pop respectively
   * @return This method returns a String that tells the 
   * user the round number and the result of the round
   */ 
     
   /* playRound() is a helper method for playGame(). 
   *  It takes an int parameter representing the 
   *  current round of play, and returns the 
   *  String result for that specific round only.
   */
   
   //TODO4 implement the playRound method 
	 
	 public String playRound(int roundNum){
		 private String roundResult = "";
		 if((roundNum % snap) == 0) 
			 roundResult.concat("snap");
		 if((roundNum % crackle) == 0)
			 roundResult.concat("crackle");
		 if((roundNum % pop) == 0)
			 roundResult.concat("pop");
		 if(((roundNum % snap) != 0) && ((roundNum % crackle) != 0) && ((roundNum % pop) != 0))
			 roundResult.concat("" + roundNum);
		 return "Round " + roundNum + ": " + roundResult; 
	 }
   
   
   //TODOd complete comments
   /**
   * The method playGame() takes a single parameter 
   * representing the number of rounds and it returns
   * a String representing the result of the entire
   * game.
   * @param numRounds represents the number of rounds
   * @return The method returns a String representing
   * the result of the entire game.
   */ 
   
   /* playGame() takes a single parameter representing the rounds and returns
   *  a String representing the result of the entire game. The helper method
   *  playRound() may be useful here, so you may want to complete it first.
   */
   
   //TODO5 implement the playGame method
      
	 public String playGame(int numRounds) {
		 for()
	 }
	 
      //Loop through the rounds of the game
         //call playRound to handle the specific round
      //return the total aggregated game results
   
   //TODOf complete comments
   /**
   * [Method Description]
   * @return [What this method returns]
   */ 
   
   //TODO6 implement the getSnap method
   
   //TODOg complete comments
   /**
   * [Method Description]
   * @return [What this method returns]
   */ 
   
   //TODO7 implement the getCrackle method  
   
   //TODOh complete comments
   /**
   * [Method Description]
   * @return [What this method returns]
   */ 
     
   //TODO8 implement the getPop method
   
}