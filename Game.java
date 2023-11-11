import java.util.*;


class Game {
  public static void main (String args[]) {

    Random randObject = new Random();
    Scanner scannerObject = new Scanner(System.in);

    int winNo = randObject.nextInt(11);
    
    System.out.println("\n===================================\n<<< Pick a no. between [0 - 10] >>>\n===================================\n");
    System.out.print("Enter your answer = ");
    int answer = scannerObject.nextInt();

    if (answer == winNo) {
      System.out.println("You won!!!");
    }
    else {
      System.out.println("You lost :( The no. was " + winNo);
    } 
    
  }  
}