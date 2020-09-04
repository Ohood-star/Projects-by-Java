//ohood alharbi , 1706801, DAR, Oalhaarbi0106@stu.kau.edu.sa
package ass51706801dar;

import java.util.Scanner;
public class Ass51706801DAR {
 public static void  intro(){
  System.out.println(" Hangman Game!"); 
     System.out.println("I will think of a random word. ");    
       System.out.println("You'll try to guess its letters."); 
     System.out.println(" Try guess correctly to avoid loses!");    
       System.out.println(""); 
 }
   public static String   getSecretWord(){
    
String[] word_list = { "ruby", "python", "java", "fortran", "html", "php" };
  int input=(int)(Math.random()*word_list.length) ;
  return word_list[input];
   }
 public static boolean   playOneGame(String secret_word, char[] secret_letter){
       Scanner in =new Scanner(System.in);

   intro();
   int wrong=0;
   int corect=0;
   int  tryil=5;
   String mis="";
   while(tryil>0 && winningState( secret_letter)!=secret_word.length()){
     System.out.println(" -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");       
     System.out.println("You have "+tryil+"trials left."); 
   System.out.print("Word:	"); 
      for(int i=0;i<secret_letter.length;i++){
       
       System.out.print(secret_letter[i]+" "); 
   }
   System.out.print( "\nEnter your Guess Letter: " );
   char guessLette=in.next().charAt(0);
   guessLette=Character.toLowerCase(guessLette);
  boolean Guess= correctGuess(secret_word,secret_letter,guessLette);
  if(Guess){
    corect++; }  //System.out.println("");
  else{
  wrong++; tryil--;  
  mis=mis+guessLette+ "  ";
  }
  if(mis.length()>0){
  System.out.println("Misses:  "+mis);
  }
   }
  System.out.println("************************************"); 
  System.out.println("Your Attempt Status:"); 
  System.out.println("_____________________\n" +
" number of wrong guess is = "+wrong); 
  System.out.println(" number of correct guesses is = "+ corect); 
  System.out.println("************************************"); 
   if(tryil>0){
       return true;}// you can change this way
   else{
    return false;
   }
   }
 public static int winningState(char[] secret_letter){
 int letters=0;
 for(int i=0;i<secret_letter.length;i++){
 if(Character.isLetter(secret_letter[i]))
 letters++;
 }
 
 return letters;
 }
 
 
    public static boolean correctGuess(String secret_word, char[] secret_letter, char guessLette){
     boolean fond=false;    
    for(int i=0;i<secret_word.length();i++){
    if(guessLette==secret_word.charAt(i)){
     fond=true; 
     secret_letter[i]=guessLette;
    }
    }
    return fond;
    }
 
   public static void getStat(int[] game_stat, int index){
       System.out.println( "----------------------------------------------------------" ); 
       System.out.println("Your final Profile status:");
       System.out.println("____________________________" ); 
        System.out.println("total number of Hangman games played  = "+game_stat[0]+game_stat[1]);
       System.out.println("total number of won games = "+game_stat[0]);
       System.out.println("total number of loss games = "+game_stat[1]);
   
   }
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       int GAME []=new int[2];
      
       
       while(true){
       
        String secret_word=getSecretWord();
        char [] secret_letter=new char[secret_word.length()];
        for(int i=0;i<secret_letter.length;i++){
        secret_letter[i]='_';
        
        }
        
       boolean win= playOneGame( secret_word, secret_letter);
        if(win){
         System.out.println("You did it right :) , The word is: "+secret_word); 
          System.out.println("");
           GAME[0]++;
        }
        else{
         System.out.println("Wrong :( ,The word was...java"+secret_word); 
          System.out.println(""); 
           GAME[1]++;
        }
         System.out.println("Do you want to play again (y / n):");
         char con=input.next().charAt(0);
         con=Character.toLowerCase(con);
         if(con=='n'){
             getStat(GAME,1);
             break;}
       
      else{ 
           continue;
              }
       }
       System.out.println(""); 
       System.out.println(""); 
       
    }
    
}
