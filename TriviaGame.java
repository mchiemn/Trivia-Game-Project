//Melvin Chiem-Ngoy
//CS1400
//Assignment 6
//October 29, 2019
import java.util.Scanner;
public class TriviaGame 
{
	public static void main(String[] args)
	{
		final int NUMB_QUESTIONS = 10;
		
		int playerAnswer, p1pts = 0, p2pts = 0;
		
		String[] questions = new String [NUMB_QUESTIONS];
			questions[0] = "What is the capital of America? \n";
			questions[1] = "What color is an orange? \n";
			questions[2] = "Where is the country roads taking me home? \n";
			questions[3] = "Eenie meenie miney blank. What goes in the blank? \n";
			questions[4] = "What would you do with a drunken sailor? \n";
			questions[5] = "How many trees are on the Earth? \n";
			questions[6] = "When did Canada decide to leave North America? \n";
			questions[7] = "Uno dos tres quatro what? \n";
			questions[8] = "I put the lime in the coconut, now what? \n";
			questions[9] = "Where in the world is Carmen San Diego? \n";
			
		String[] answers = new String [NUMB_QUESTIONS];
			answers[0] = "1) New York 2) Washington D.C 3) Hong Kong 4) Mars";
			answers[1] = "1) Black 2) Green 3) Orange 4) Gold";
			answers[2] = "1) New Mexico 2) London 3) West Virginia 4) Dubai";
			answers[3] = "1) Go 2) Moe 3) Tho 4) Nah Bro";
			answers[4] = "1) In the afternoon? 2) Early in the morning? 3) Late at night? 4) Now?";
			answers[5] = "1) 1 2) 2 3) 3 4) At least 4";
			answers[6] = "1) It never did! 2) After they lost in hockey 3) When they ran out of syrup 4) Yesterday";
			answers[7] = "1) Cinco 2) Sinko 3) Sink Oh? 4) Five";
			answers[8] = "1) Eat it 2) Drink it 3) Shake it all up 4) Make it a citizen";
			answers[9] = "1) San Diego 2) San Francisco 3) San Manuel Indian Bingo and Casino 4) Here";
		
		int[] correctAnswers = {2, 3, 3 ,2, 2, 4, 1, 1, 3, 1};
				
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Player 1's Turn! \n");

		for (int i = 0; i < 5; i++)
		{
			Question quest = new Question(questions[i], answers[i], correctAnswers[i]);
			System.out.print(quest.getTriviaQuestion() + quest.getPossibleAnswers());
			playerAnswer = keyboard.nextInt();
			if (playerAnswer == correctAnswers[i])
				p1pts += 1;
		}
		
		System.out.print("Player 2's Turn! \n");

		for (int i = 5; i < 10; i++)
		{
			Question quest = new Question(questions[i], answers[i], correctAnswers[i]);
			System.out.print(quest.getTriviaQuestion() + quest.getPossibleAnswers());
			playerAnswer = keyboard.nextInt();
			if (playerAnswer == correctAnswers[i])
				p2pts += 1;
		}
				
		System.out.print("Player 1 earned " + p1pts + " points. \n");
		System.out.print("Player 2 earned " + p2pts + " points. \n");
		
		if (p1pts > p2pts)
			System.out.print("Player 1 wins!");
		else
			System.out.print("Player 2 wins!");

	}	
}

