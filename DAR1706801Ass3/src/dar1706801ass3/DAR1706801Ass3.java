//ohood alharbi , 1706801, DAR, Oalhaarbi0106@stu.kau.edu.sa
package dar1706801ass3;

import java.util.Scanner;

public class DAR1706801Ass3 {

   
    public static void main(String[] args) {
      
        Scanner input =new Scanner(System.in);
        
       
        System.out.println("");
         System.out.println("		Welcome to the Numbering System Conversion Quiz!");
        System.out.println("		************************************************");
        System.out.println();
        System.out.println("The quiz consists of 8 random questions on converting between Decimal, Binary, \n" +
"and Hexadecimal numbers. You have a maximum number of 3 trials per question.");
        //to define variables 
       String Q1="";
       String Q2="";
       String Q3="";
       String Q4="";
       String Q5="";
       String Q6="";
       String Q7="";
       String Q8="";
        
        System.out.println();
        System.out.println("Please enter 1 to start the quiz or 0 to exit:");
        System.out.println();
        int quiz= input.nextInt();
        
        switch(quiz){ // i use switch
                 
                 case 0:          System.out.println("			\n" +
"		*** Thank you for using this Application ***");
                 break;
                     
                 case 1:
                    
                     while(quiz==1){
                   double start= System.currentTimeMillis(); 
                    int correctCount=0; //COUNT THE NUMBER OF CORRECT ANSWERS.
                   //Q2
                   int decimal=(int)(Math.random()*256); 
     int rab=decimal;        String answer="";   
      while (decimal!=0) { // I USE while LOOP
         char hexadgight;
     int hexa=decimal%16;
      if((hexa<=9 && hexa>=0)) // this to convert from deci to hexa 
       hexadgight=(char)(hexa+'0');
      else{
        hexadgight=(char)(hexa-10+'A');
      }
       answer=hexadgight+answer;
      decimal/=16;
     }
       for(int i=0; i<3;i++){ // I USE FOR LOOP 
          System.out.println("Please enter the equivalent Hexadecimal number of  "+rab+":");
        System.out.println(); 
        String decimalNumber=input.next();
         decimalNumber=decimalNumber.toUpperCase(); // TO CONVERT 'a' FROM USER TO 'A'...
     
         if(decimalNumber.equals(answer)){
           System.out.println("	Correct Answer!");
            Q1= "The equivalent Hexadecimal number of "+rab+" is"+ ":"+decimalNumber+":Correct";
           correctCount+=2;
           break;
       }
         else if(i==2){
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
          break;}
         else {
            System.out.println("	Wrong Answer! ");
              Q1= "The equivalent Hexadecimal number of "+rab+" is"+ ":"+decimalNumber+":Wrong";
       }
       }
       
        //Q2
       int decima=(int)(Math.random()*256); 
           int RR=decima;
           answer="";    
      while (decima!=0){ // I USE while LOOP
      char hexadgight;
     int hexa=decima%16;
      if((hexa<=9 && hexa>=0))// I USE FOR LOOP
       hexadgight=(char)(hexa+'0');
      else{
        hexadgight=(char)(hexa-10+'A');
      }
      answer=hexadgight+answer;
      decima/=16;
     }
       for(int i=0; i<3;i++){
           System.out.println("Please enter the equivalent Hexadecimal number of  "+RR+":");
        System.out.println(); 
       String decimalNumber=input.next();
       decimalNumber=decimalNumber.toUpperCase();// TO CONVERT 'a' FROM USER TO 'A'..
       if(decimalNumber.equals(answer)){
           System.out.println("	Correct Answer!");
             Q2= "The equivalent Hexadecimal number of "+RR+" is"+ ":"+decimalNumber+":Correct";
           correctCount+=2;
           break;
       }
         else if(i==2){
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
          break;
      }
         else {
            System.out.println("	Wrong Answer! ");
             Q2= "The equivalent Hexadecimal number of "+RR+" is"+ ":"+decimalNumber+":Wrong";
       }
       }
      
       // CONVERT hex to dec
       //Q3
      int  hexo=(int)(Math.random()*16); // FIRST DIDHIT
                           
        String one="";  
    int hexp = hexo; 
      while ( hexo!=0) { // I USE while LOOP
         char hexadgight;
     int hexa= hexo%16;
      if((hexa<=9 && hexa>=0)) // this to convert from deci to hexa 
       hexadgight=(char)(hexa+'0');
      else{
        hexadgight=(char)(hexa-10+'A');
      }
        one=hexadgight+ one;
       hexo/=16;
      //===
        int hex=(int)(Math.random()*16); //SECAOND DIGHIT
        String two="";
      int hexl =hex; 
      while (hex!=0) { // I USE while LOOP
         char hexadgightt;
         hexa=hex%16;
      if((hexa<=9 && hexa>=0)) // this to convert from deci to hexa 
       hexadgightt=(char)(hexa+'0');
      else{
        hexadgightt=(char)(hexa-10+'A');
      }
       two=hexadgightt+two;
      hex/=16;
  
   
               int deco=0; 
           int dec=0;

    
        
       dec+= ( hexl)*Math.pow(16, 0);
     
        deco+= (hexp)*Math.pow(16, 1);

        for(int t=0; t<3;t++){// I USE FOR LOOP
   
          System.out.println("Please enter the equivalent Decimal number of  "+one+two+":");
        System.out.println(); 
       
        int decimalNumber=input.nextInt();
         
       if (decimalNumber==(dec+deco)){
           System.out.println("	Correct Answer!");
        Q3= "The equivalent Decimal number of "+one+two+" is"+ ":"+decimalNumber+":Correct";
           correctCount+=2;
           break;
       }
              else if(t==2){
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
           break;
      }
           else if(decimalNumber!=(dec+deco)){
            System.out.println("	Wrong Answer! ");
          Q3= "The equivalent Decimal number of "+one+two+" is"+ ":"+decimalNumber+":Wrong";
       }
       
        
    
       }
        }  
      }
      //====
      
      //Q4
      
          
       hexo=(int)(Math.random()*16); // FIRST DIDHIT
                           
       one="";  
     hexp = hexo; 
      while ( hexo!=0) { // I USE while LOOP
         char hexadgight;
     int hexa= hexo%16;
      if((hexa<=9 && hexa>=0)) // this to convert from deci to hexa 
       hexadgight=(char)(hexa+'0');
      else{
        hexadgight=(char)(hexa-10+'A');
      }
        one=hexadgight+ one;
       hexo/=16;
      //===
        int hex=(int)(Math.random()*16); //SECAOND DIGHIT
        String two="";
      int hexl =hex; 
      while (hex!=0) { // I USE while LOOP
         char hexadgightt;
         hexa=hex%16;
      if((hexa<=9 && hexa>=0)) // this to convert from deci to hexa 
       hexadgightt=(char)(hexa+'0');
      else{
        hexadgightt=(char)(hexa-10+'A');
      }
       two=hexadgightt+two;
      hex/=16;
  
   
               int deco=0; 
           int dec=0;

    
        
       dec+= ( hexl)*Math.pow(16, 0);
     
        deco+= (hexp)*Math.pow(16, 1);

        for(int t=0; t<3;t++){// I USE FOR LOOP
   
          System.out.println("Please enter the equivalent Decimal number of  "+one+two+":");
        System.out.println(); 
       
        int decimalNumber=input.nextInt();
         
       if (decimalNumber==(dec+deco)){
           System.out.println("	Correct Answer!");
         Q4= "The equivalent Decimal number of "+one+two+" is"+ ":"+decimalNumber+":Correct";
           correctCount+=2;
           break;
       }
              else if(t==2){
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
           break;
      }
           else if(decimalNumber!=(dec+deco)){
            System.out.println("	Wrong Answer! ");
              Q4= "The equivalent Decimal number of "+one+two+" is"+ ":"+decimalNumber+":Wrong";
       }
       
        
    
       }
        }  
      }
       // deci to bin
          //Q5
                String x="";
          decimal=(int)(Math.random()*256);
         
          int rabd=decimal; 
           int a = 0; 
             while(decimal>0){
         a=decimal%2; 
         x = a+""+ x;
         decimal/=2;
        }
          for(int i=1; i<=3;i++){// I USE FOR LOOP
           
          
           System.out.println("Please enter the equivalent Binary number of "+rabd+":");
           System.out.println();
       
        
         String decimalNumber=input.next();
        
        
        if(decimalNumber.equals(x)){
           System.out.println("	Correct Answer!");
            Q5= "The equivalent Binary number of "+rabd+" is"+ ":"+decimalNumber+":Correct"; 
           correctCount+=2;
           break;
          }
        else if(i==(3)){
         
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
           break;
         }
           else{
            System.out.println("	Wrong Answer! ");
             Q5= "The equivalent Binary number of "+rabd+" is"+ ":"+decimalNumber+":Wrong"; 
           }
         
          }
          //Q6
          decimal=(int)(Math.random()*256);
           int bb=decimal;
            a = 0; 
            x="";
            while(decimal>0){
         a=decimal%2; 
         x = a+""+ x;
         decimal/=2;
        }
               for(int i=1; i<=3;i++){
           
          
           System.out.println("Please enter the equivalent Binary number of "+bb+":");
           System.out.println();
         String decimalNumber=input.next();
        
        if(decimalNumber.equals(x)){
           System.out.println("	Correct Answer!");
           Q6= "The equivalent Binary number of "+bb+" is"+ ":"+decimalNumber+":Correct"; 
           correctCount+=2;
           break;
          }
        else if(i==(3)){
         
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
             break;
         }
           else{
            System.out.println("	Wrong Answer! ");
             Q6= "The equivalent Binary number of "+bb+" is"+ ":"+decimalNumber+":Wrong"; 
           }
         
          }
               // bin to dec
               //Q7
                  String binary="";
               for(int i=1; i<=8;i++){
             int  binarydighit=(int)(Math.random()*2);  
              binary+=binarydighit; 
               } 
        for(int t=0; t<3;t++){
         System.out.println("Please enter the equivalent Decimal number of "+binary+":");
         System.out.println();
        
         int decimalNumber=input.nextInt();
   
        int deci=0; 
        for(int k=0; k<=7;k++){
      
         deci+=Integer.parseInt(binary.charAt(7-k)+"")*Math.pow(2, k);
             }
    
       
         if( decimalNumber==deci){
           System.out.println("	Correct Answer!");
            Q7= "The equivalent Decimal number of "+binary+" is"+ ":"+decimalNumber+":Correct";
            correctCount+=2;
           break;
           }
          else if (t==2){
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
             break;
            }
           else if(( decimalNumber!=deci)){
            System.out.println("	Wrong Answer! ");
             Q7= "The equivalent Decimal number of "+binary+" is"+ ":"+decimalNumber+":Wrong";
           }
           }
     //Q8
                 binary="";
               for(int i=1; i<=8;i++){
             int  binarydighit=(int)(Math.random()*2);  
              binary+=binarydighit; 
               } 
        for(int t=0; t<3;t++){
         System.out.println("Please enter the equivalent Decimal number of "+binary+":");
         System.out.println();
        
         int decimalNumber=input.nextInt();
   
        int deci=0; 
        for(int k=0; k<=7;k++){
      
         deci+=Integer.parseInt(binary.charAt(7-k)+"")*Math.pow(2, k);
             }
    
         if( decimalNumber==deci){
           System.out.println("	Correct Answer!");
           Q8= "The equivalent Decimal number of "+binary+" is"+ ":"+decimalNumber+":Correct";
            correctCount+=2;
           break;
           }
          else if (t==2){
            System.out.println("	Sorry, you have exceeded the maximum number of trials for this question!");
             break;
            }
           else if(( decimalNumber!=deci)){
            System.out.println("	Wrong Answer! ");
            Q8= "The equivalent Decimal number of "+binary+" is"+ ":"+decimalNumber+":Wrong";
           }
           }
        
        
              
               
               
               
       
           System.out.println();
           //============================================================================
           
            System.out.println("		************************************");
                     double endtime= System.currentTimeMillis();
                      double testtime= endtime-start;
                       double timo =testtime/60000;
                      double ScoreE=((correctCount/16.0)*100);
            String min="  minutes";
             String complet="		Time taken to complete the quiz: ";
            String PRCNT="%";
             System.out.printf("%s%1.1f%s",complet, timo,min);
              System.out.println();
              System.out.println("		Score is: "+ScoreE +""+PRCNT);
              if (ScoreE>60){
               System.out.println("		Congratulations, you have passed!");
               
              }
             if (ScoreE<=60){
                   System.out.println("		 You didn't pass the quiz!");
              }
               System.out.println("		************************************");
     System.out.println();
     System.out.println("Detailed Results:");
     System.out.println("---------------------");
     System.out.println( Q1);
     System.out.println(Q2);
     System.out.println(Q5);
     System.out.println(Q6 );
     System.out.println(Q3);
     System.out.println(Q4);
     System.out.println(Q7);
       System.out.println(Q8);
         System.out.println();
           System.out.println();
           // ANOTHER TRY 
                System.out.println("Please enter 1 to re-take the quiz or 0 to exit:");
                 int requiz= input.nextInt();
        
    if(requiz==0){
                 
                           System.out.println("			\n" +
"		*** Thank you for using this Application ***");
                 
                 break;}
             
               if(requiz==1){
                     
                 continue;
               }
        
        }
                 
                         
    }
    
}
    }
     
