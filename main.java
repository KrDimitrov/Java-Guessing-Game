import java.util.*;

class game{
  public static void main(String args[]){
    boolean run = true;
    Scanner sc = new Scanner(System.in);

    Random r = new Random();
    int randomInt = r.nextInt(500);
    System.out.println("Game is starting! to exit type 'exit' and press Enter!");

    int tries = 0;
    boolean won = false;
    while(run){
      System.out.print("Enter your guess: ");
      String input = sc.next();
      if(input.equals("exit")){
        run = false;
        break;
      }
      int guess = Integer.parseInt(input);
      if(guess == randomInt){
        won = true;
        System.out.println("You guessed correct! WINNER!\nYou tried " + tries + " times to guess the number!\nDo you want to play another round? (Y/N): ");
        if(sc.next().equalsIgnoreCase("y")){
          main(args);
          break;
        }else{
          System.out.println("Good Bye");
          run = false;
          break;
        }
      }
      if( guess > randomInt){
        System.out.println("You guessed too high! Try again!");
      }
      else if(guess < randomInt){
        System.out.println("You guessed too low! Try again!");
      }
      tries++;
    }
    if(!won){
      System.out.println("The number was:" + randomInt + "!\n You tried " + tries + " times to guess!");
    }
  }
}
