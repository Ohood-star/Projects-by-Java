//ohood alharbi , 1706801, DAR, Oalhaarbi0106@stu.kau.edu.sa
package dar1706801p5;
import java.util.Scanner;

public class DAR1706801P5 {
 public static void  intro(){ //  i use  this method to print sentences 
System.out.println("Hangman Game!"); 
System.out.println("I will think of a random word. ");    
System.out.println("You'll try to guess its letters."); 
System.out.println(" Try guess correctly to avoid loses!");    

 }
   public static String   getSecretWord(){  //  i use  this method to defind  arrays
    
String[] word_list = { "ruby", "python", "java", "fortran", "html", "php" };//arrays
  int input=(int)(Math.random()*word_list.length) ;// defind random to arrays 
  return word_list[input];
   }
    public static int winningState(char[] secret_letter){ //this method to allow to enter more letters
 int letter=0;
 for(int i=0;i<secret_letter.length;i++){
 if(Character.isLetter(secret_letter[i]))
 letter++;
 }
 
 return letter;
 }
 public static boolean   playOneGame(String secret_word, char[] secret_letter){
      //  i use  this method to calculat trials and defind corect and  wrong to calculat the total number corect and  wrong of  trials.  
       Scanner input =new Scanner(System.in);
 
  
   int wrong=0;
   int corect=0;
   int  tryil=5;
   String mis="";
   while(tryil>0 && winningState( secret_letter)!=secret_word.length()){ //   i use   while loop 
     System.out.println(" -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");       
     System.out.println("You have "+tryil+"trials left."); 
   System.out.print("Word:	"); 
      for(int i=0;i<secret_letter.length;i++){ // this for loop to print '_' x times ,x=lentgh of word 
       
       System.out.print(secret_letter[i]+" "); 
   }
   System.out.print( "\nEnter your Guess Letter: " );
   char guessLette=input.next().charAt(0);
   guessLette=Character.toLowerCase(guessLette);
  boolean Guess= correctGuess(secret_word,secret_letter,guessLette);
  if(Guess){
    corect++; }  //System.out.println("");
  else{
  wrong++; tryil--;  
  mis=mis+guessLette+ "  ";  // to calculat misses
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
   if(tryil<=0){
      return false;}
   else{
     return true  ;
   }
   }

 
 
    public static boolean correctGuess(String secret_word, char[] secret_letter, char guessLette){ //this method to calculat correctGuess
     boolean fond=false;    
    for(int i=0;i<secret_word.length();i++){
    if(guessLette==secret_word.charAt(i)){
     fond=true; 
     secret_letter[i]=guessLette;
    }
    }
    return fond;
    }
 
   public static void getStat(int[] game_stat, int index){ // this to print the ruselt after user's press " n"
       System.out.println( "----------------------------------------------------------" ); 
       System.out.println("Your final Profile status:");
       System.out.println("____________________________" ); 
        System.out.println("total number of Hangman games played  = "+(game_stat[0]+game_stat[1]));
       System.out.println("total number of won games = "+game_stat[0]);
       System.out.println("total number of loss games = "+game_stat[1]);
   
   }
    public static void FinalLook(){ // This method to compile methods that must appear in RUN screen 
    
           Scanner input =new Scanner(System.in);
            intro();
       int GAME []=new int[2];

       while(true){
       
              String secret_word=getSecretWord();
        char [] secret_letter=new char[secret_word.length()];
        for(int i=0;i<secret_letter.length;i++){
        secret_letter[i]='_';
        
        }
        
       boolean win= playOneGame( secret_word, secret_letter);
        if(win){ // i use if to  explain if it" win " or " lose"
         System.out.println(""); 
           System.out.println(""); 
         System.out.println("You did it right :) , The word is: "+secret_word); 
          System.out.println("");
           GAME[0]++;
        }
        else{
        System.out.println(""); 
         System.out.println(""); 
         System.out.println("Wrong :( ,The word was...java"+secret_word); 
          System.out.println(""); 
           GAME[1]++;
        }
         System.out.println("Do you want to play again (y / n):");
         char CHOSE=input.next().charAt(0);
         CHOSE=Character.toLowerCase(CHOSE);
         switch(CHOSE){
         case'n':
             getStat(GAME,1);
      
            System.exit(0); // to exit from while loop 
       case'y':
    
        continue;  // to   continue from while loop 
      
       }
       System.out.println(""); 
       System.out.println(""); 
       
    }
    
    }
   
    public static void main(String[] args) {
        
        
        
        
         FinalLook();  // calling this method
         
         
    }
    
}
