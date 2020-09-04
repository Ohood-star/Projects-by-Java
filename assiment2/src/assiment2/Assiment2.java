//ohood alharbi , 1706801, DAR, Oalhaarbi0106@stu.kau.edu.sa
package assiment2;


import java.util.Scanner;

public class Assiment2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("");
        System.out.println("------------------------------------------------------------");
        System.out.println("		Welcome to Red Sea Logistics Cargo Rate System");
        System.out.println("------------------------------------------------------------");
        System.out.println("	Enter \"Nat\" for National Cargo");
       
        System.out.println("	Enter \"Int\" for International  Cargo"); 
       
        System.out.println("	Enter \"Exit\" for Exiting the Program");
          
         System.out.print("Enter the Choice:");
        String nat = input.next();
        String inte = input.next();
        String exit = input.next(); 
       
    //converting string to lowercase
      
         String Choice=input.next();
       
        String toLowerCase = Choice.toLowerCase();
         
             
        
           if((Choice!=nat)||(Choice!=inte)||(Choice!=exit)){
          
        System.out.println(  "	Wrong Selection of shipment scope! ");
        }
        
        if  
      (Choice.equals("exit")) { 
         System.out.println(
"			      *** Thank you for using this Application ***");
        
        }
           if(Choice.equals("nat")){
            System.out.print("************************");
            System.out.print("Enter personal details : ");
            System.out.println();   
           System.out.print("	Enter the name (first and last):  ");
           String fname = input.next();
           String lname = input.next();
           System.out.print("	Enter Your Contact Number:  ");
           int Contact = input.nextInt();
           System.out.print("	Enter Your Address: ");
           String Address = input.next();  
           System.out.print("************************"); 
           System.out.print("Select Freight type");   
           System.out.println(); 
           System.out.print("	Press R or r for Road freight"); 
           System.out.print("	Press A or a for Air freight"); 
            String choice =input.next();
             boolean equalsIgnoreCase;
            equalsIgnoreCase = choice.equalsIgnoreCase("");
            
            
           System.out.print("Enter the Choice: "); 
            String a =input.next();
            String r =input.next();
            if(choice.equals("a")){
            System.out.print("Enter the weight for cargo : "); 
            int weight =input.nextInt(); 
            if(weight<50){
            }
           
           if(choice.equals("r")){
            System.out.print("Enter the weight for cargo : ");   
             if(weight>50){
             System.out.println();       
             System.out.println();       
            System.out.print("			---------------------------------------------------------");       
            System.out.print("			    Information Details for NATIONAL Shipment");  
            System.out.print("			---------------------------------------------------------");     
            System.out.println(); 
             System.out.print("===========================================================================================================================");
            
            
            
            
            
            System.out.print("===========================================================================================================================");
             System.out.print("			      *** Thank you for using this Application ***");    
             }
             else
             System.out.print("	Sorry! National Air freight is not available for more than 50KGs!");     
           }
           }
            
            else{
           System.out.println();         
           System.out.print("	Wrong Selection of Freight type!");     
            }   
           }
         
           if(Choice.equals("inte")){  
                        System.out.print("************************");
            System.out.print("Enter personal details : ");
            System.out.println();   
           System.out.print("	Enter the name (first and last):  ");
           String fname = input.next();
           String lname = input.next();
           System.out.print("	Enter Your Contact Number:  ");
           int Contact = input.nextInt();
           System.out.print("	Enter Your Address: ");
           String Address = input.next();  
           System.out.print("************************"); 
           System.out.print("Select Freight type");   
           System.out.println();   
           System.out.print("	Press S or s for Sea freight");  
            System.out.print("	Press A or a for Air freight");  
           String s =input.next();
           String r =input.next();
            System.out.print("");  
            System.out.print("");  
            System.out.print("");  
            
            
           }   
           
            
            
            
            
            
            
            
            
            
            
           
           
      

  
        
   
    
    

