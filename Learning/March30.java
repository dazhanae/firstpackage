package Learning;

public class March30 {
   public String checkYourself(String stringGuess) {

       int guess = Integer.parseInt(stringGuess); //Convert the string to an int
       String result = "miss"; //Make variable to hold the result we'll return. Put "miss' in as a default (e.g we assume a "miss".)

       int[] locationCells = new int[0];
       for (int cell : locationCells) { // Repeat with each thing in the array. 
           if (guess == cell) { // Compare the user guess tp this element (cell), in the array.
               result = "hit";
               int numOfHits = 0;
               numOfHits++;
               break; // Gte out of the loop no need to test the other cells.
           } // end if
       } // end for

       int numOfHits = 0;
       if (numOfHits == locationCells.length) { // We are out of the loop but lets see if we're now "dead" (hit 3x) & change to hit or kill.
           result = "kill";
       } // end if statement
       System.out.println(result); // Display the result for the user
       return result; //return the result back to the calling method.
   }

}
