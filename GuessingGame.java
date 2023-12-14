package GuessingNOGame;
import java.util.Scanner;

import java.util.Random;
public class GuessingGame
{
   public static void  main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   Random r = new Random();
	   int minrange = 1;
	   int maxrange=100;
	   int attemptsLimits = 5;
	   int rounds=0;
	   int score=0;
	   boolean playAgain=true;
	   
	   while(playAgain)
	   {
		   int number = r.nextInt(maxrange-minrange + 1)+ minrange;
		   int attempts = 0;
		   
		   boolean guesscorrectly = false;
		   
		   System.out.println("Guess the number between"+ minrange +"and"+ maxrange +".");
		   while(!guesscorrectly && attempts < attemptsLimits) 
		   {
			   System.out.println("Engter your guess:");
			   int Guess = sc.nextInt();
			   attempts++;
			   
			   if(Guess == number)
			   {
				   guesscorrectly=true;
                   System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                   score += attempts;
			   }else if(Guess < number)
			   {
				   System.out.println("Too Low! Try agin");
			   } else
			   {
				   System.out.println("Too High! Try again");
			   }
		   }
		   if(!guesscorrectly)
		   {
			   System.out.println("Sorry you have completed all attempts your total score is :"+ number);			   
		   }
		   System.out.println("your corrent score is :"+score);
		   

	   }
	 
	   
   }
}
