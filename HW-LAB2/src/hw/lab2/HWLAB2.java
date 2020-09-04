
package hw.lab2;

import java.util.Scanner;


public class HWLAB2 {

  
    public static void main(String[] args) {
       
        Scanner input=new Scanner( System.in);
         StringBuilder ID =new StringBuilder() ;
        while  (true){
     System.out.println("Course ID Generator:");
          System.out.println("----------------------------------"); 
            System.out.println("Please Enter Course Information\n");
            for (int k = 0; k < 10; k++) {
                
           
            System.out.println(
"Course Code (only capital letters with a length between 2 and 4):");
      String code=input.next();
     if(code.length()==4||code.length()==2) {
         for (int i = 0; i < 10; i++) 
             
         
     if(Character.isUpperCase(code.charAt(i))){
      break;   
     }
         else{
        System.out.println("Course Code must only have capital letters , Please try again");  
        // continue;
                 }
         
     }
     else{
           System.out.println("Course Code length was not between 2 and 4 , Please try again");
     }} 
     // #######
   
            System.out.println("Course Number (consist only of 3 digits):");
               String no =input.next();
            if (no.length()==3) {
                for (int i = 0; i < 10; i++) {
                    
                
             if(Character.isDigit(no.charAt(i)) ) {
             }  
            else{
        System.out.println("Course Number length was not 3 , Please try again");}
        //#####
            }}
         
   

       System.out.println("Year:");
         String Year =input.next();
         //#####}
      
          
        System.out.println("Semester (Fall=01, Sprint=02, Summer=03):");
          int Semester =input.nextInt();
            if (Semester==1||Semester==2||Semester==3) {
                
            }
            else{System.out.println("Please enter correct semester code, try again");}
        //####
          System.out.println("Course Reference Number:"); 
              int Reference  =input.nextInt();
        System.out.println("----------------------------------");
       
        System.out.println("");
        }
    
    }}
    

