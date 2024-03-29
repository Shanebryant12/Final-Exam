import java.util.Scanner;
import java.io.*;
import java.lang.String;
import java.lang.Math;
/** This is a Java Program
FileName : "QuestionsQuizFinal".
Author: Shane Bryant
Date: 12/16/2019
Purpose: Come up with 20 questions relating to java that we talked about in class! And make a program that asks the questions to the user and allows them to answer
A quiz for about java*/
public class QuestionsQuizFinal { 
   public static void files() throws IOException {
      	
      BufferedReader in = new BufferedReader (new FileReader("QuizAnswers.txt")); //Allows text to be read from the file "Hero.txt"
      String inFile = "";
      int startLine = 1; //Text from file is outputted starting from the first line
      int endLine = 23;   //Text from file is outputted ending at the seventh line
      for (int i = 0; i < startLine; i++) { 
         inFile = in.readLine(); 
      }
      for (int i = startLine; i < endLine + 1; i++) {
         inFile = in.readLine();
         System.out.println(inFile); 
      }
      	
      in.close(); //The file is closed
   }
   public static void QUIZ(Arrays [] questions)throws IOException {
      float score = 0;
      Scanner keyboard = new Scanner(System.in);
      String fileName = "QuizResults.txt"; //String fileName initialized to the text file name
      PrintWriter outFile = new PrintWriter(fileName);//PrintWriter declared | Allows user to print the results to a file
      
      for(int i = 0; i < questions.length; i++) {
         System.out.println(questions[i].test);
         String QuizAnswer = keyboard.nextLine();
         int j = 0;
         j = i +1;
         //Increments the score if the answer the user enters, matches the answer in the array
         if(QuizAnswer.equalsIgnoreCase(questions[i].QuizAnswer)) {
            System.out.println("=================================================");
            System.out.println(j+". Your answer '"+QuizAnswer+"'"+ " is correct!");
            System.out.println("=================================================");
            outFile.println(j+". Your answer '"+QuizAnswer+"'"+ " is correct!"); 
            score++;
         }
         //If the answer the user enters does not match the answer in the array, the following message is outputted (Incorrect)
         else{
            System.out.println("=================================================");
            System.out.println(j+". Your answer '"+QuizAnswer+"'"+ " is incorrect!");
            System.out.println("=================================================");
            outFile.println(j+". Your answer '"+QuizAnswer+"'"+ " is incorrect!");
         }
      }
      //Shows the raw score out of 20, and then gives the user a percentage grade
      float total = (score/questions.length)*(100);
      System.out.println("=================================================");
      System.out.println("Your score is " + score + "/" + questions.length);
      System.out.println("The percent is " + total + "%");
      System.out.println("=================================================");
      outFile.println("=================================================");
      outFile.println("Your score is " + score + "/" + questions.length);
      outFile.println("The percent is " + total + "%");
      outFile.println("=================================================");
      outFile.close();//Closes the write file (QuizResults.txt)
   } 
   public static void main(String[] args) throws IOException{ 
      //The strings below are the questions
      String question1 = "1. What is the correct format for a case?\n" + " a. case 'A'\n b. case(A);\n c. Case''A''\n d. case (A)";
      String question2 = "2. Which of the following of a switch statement is separate from the case expressions\n (executed when none of the other cases match the control expression.)?\n a. case\n b. default:\n c. else\n d. otherwise";  
      String question3 = "3. Please input the 8 Primitive Data Types:\n[In Alphabetical Order] \n";   
      String question4 = "4. True/False: In the statement: if (a || b), if a is true and b is false, then the boolean expression will return true.\n[ENTER FULL WORD]";
      String question5 = "5. True/False: In the statement: if (a && b), if a is true and b is false, then the boolean expression will return false.\n[ENTER FULL WORD]";
      String question6 = "6. True/False: The 'switch' selection structure must end with the default case.";
      String question7 = "7. What type of comments is the following an example of?\n/*\nThis isThe example\n*/ \n a. Single-line comments\n b. Documentation comments\n c. Multiple-line comments";
      String question8 = "8. What is the last number that the following will output?\nclass ExampleForLoop {\npublic static void main(String args[]){\nfor(int i=10; i>0; i--){\nSystem.out.println(i);\n}\n}\n}";
      String question9 = "9. What does break; do in a switch statement?\n a. Breaks the program/Causes a compiling error\n b. Ends the entire program immediately\n c. Terminates the loop, then the program proceeds at the next statement that follows the loop\n d. Terminate the loop and restarts the program";
      String question10 = "10. What are the three types of loops? (Input it in alphabetical order)";
      String question11 = "11. What is the range of the random in the code provided?\nImport java.util.Random;\nRandom ran = new Random();\nint n = rand.nextInt(50);";
      String question12 = "12. What does modulus (%) do in java?\n a. Divides the two numbers and returns the end solution\n b. Adds the two numbers and divides by 2 (Average)\n c. Takes the average and multiplies it by 2\n d. Divides the two numbers and returns the remainder of the two numbers";
      String question13 = "13. What are the 3 or 4 actions you should do with any file?";
      String question14 = "14. What is the git command that allows you to download your repository from GitHub to your computer?\n a. git commit\n b. git push\n c. git add\n d. git clone";
      String question15 = "15. What’s the git command/shortcut for staging all the changes made?\n a. git commit .\n b. git commit add .\n c. git add .\n d. git stage .";
      String question16 = "16. What command is used to initialize a new Git repository?";
      String question17 = "17. What number from the part of code below is inclusive?\n new Random().nextInt(10);";
      String question18 = "18. What number from the part of code below is exclusive?\n new Random().nextInt(10);";
      String question19 = "19. What is the output of the following code?\nint num1 = 10;\nint num2 = 5;\nif (num1 != num2)\nSystem.out.println(''num1 does not equal num2'');\nif (num1 >= num2)\nSystem.out.println(''num1 is greater than or equal to num'')";
      String question20 = "20. Which of the following is correct?\n a. Import java.io.IOException;\n b. import java.io.IOException;\n c. import Java.IO.IOException\n d. import java.io.IOException";
     
      Arrays [] questions = {
         //Array that asks the questions (the strings) and then has a specific input (correct answer to look for)
         new Arrays(question1, "a"),
         new Arrays(question2, "b"),
         new Arrays(question3, "Boolean, byte, char, double, float, int, long, short"),
         new Arrays(question4, "False"),
         new Arrays(question5, "True"),
         new Arrays(question6, "False"),
         new Arrays(question7, "c"),
         new Arrays(question8, "1"),
         new Arrays(question9, "c"),
         new Arrays(question10, "do-while loop, for loop, while loop"),
         new Arrays(question11, "0-49"),
         new Arrays(question12, "d"),
         new Arrays(question13, "Open file, read file, write to file, close file"),
         new Arrays(question14, "d"),
         new Arrays(question15, "c"),
         new Arrays(question16, "git init"),
         new Arrays(question17, "0"),
         new Arrays(question18, "9"),
         new Arrays(question19, "num1 does not equal num2"),
         new Arrays(question20, "b"),
         
         };
      QUIZ(questions); //Calls method QUIZ and asks the questions from the array, and receives input from the user. If they are correct, then their score is incremented, if wrong they still proceed to the next question
      files(); //Calls method files. At the end of the questions, the answer key to the quiz will allow the user to see which questions they got right and which ones they got wrong
      
   } 
}
class Arrays{
   //Initialized String test, and String QuizAnswer
   String test;
   String QuizAnswer;
   public Arrays(String test, String QuizAnswer){
      //This is a keyword / reference variable that corresponds to the current object
      this.test = test;
      this.QuizAnswer = QuizAnswer;
   }
}


