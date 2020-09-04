//ohood alharbi , 1706801, DAR, Oalhaarbi0106@stu.kau.edu.sa
package dar1706801p4;

import java.util.Scanner;

public class DAR1706801P4 {

 // defind varibles
public static int RDiTIME = 900;
        public static int ICTIME = 800;
        public static int SURTIME = 930;
        public static int DENTTIME = 1000;
    //method for calculet BMI
    public static String BMIcalculet(double BMI, double weight, double height) {
        height = height / 100; //  convert it to cm
        BMI = weight / (height * height);
        if (BMI <= 18.5) {
            return " Underweight ";
        } else if (BMI <= 20) {
            return " Normal  ";
        } else if (BMI <= 30) {
            return " Overweight   ";
        } else {
            return " Obese  ";
        }
    }

    //method for displayInformation to adding
    public static void displayInfo(int id, String name, int age, String phone, String clinic, double weight, double height, double BMI) {
        String CM = "cm";
        String KG = "kg";
        System.out.println("      -------------------------------------------------\n"
                + "          Information Details for Adding Patient\n"
                + "      -------------------------------------------------");

        System.out.printf("Name                    :%-10s                 National ID Number         :%-10d", name, id);
        System.out.println("");
        System.out.printf("Age                     :%-10d                 Phone number               :%-10s", age, phone);
        System.out.println("");
        System.out.printf("Clinic                  :%-10s                 Weight                     :%-10.2f%-10s", clinic, weight, KG);
        System.out.println("");
        System.out.printf("BMI                     :%-10s                 Height                     :%-10.2f%-10s ", BMIcalculet(BMI, weight, height), height, CM);
        System.out.println("");

    }

    public static void printMsg(String main) { //method for display mageses

        if ("mainMenuError".equals(main)) {
            System.out.println("  Wrong Selection of Service Type!");
            return;

        } else if ("clinError".equals(main)) {
            System.out.println("  Wrong Selection of clinic... try again!");
            return;
        } else if ("clink".equals(main)) {
            System.out.println("  -------------------------------------------------");
            System.out.println("  DEPARTMENT: please select the correct department:");
            System.out.println("  -------------------------------------------------");
            System.out.println("  Enter I or i for ICU:");
            System.out.println("  Enter R or r for Radiology:");
            System.out.println("  Enter S or s for Surgery:");
            System.out.println("  Enter D or d for Dentistry:");
            System.out.println("Enter your Choice:");
            System.out.println();

            return;
        } else if ("redir".equals(main)) {
            System.out.println("---------------------------------------------------------------------------------------------------\n"
                    + "---------------------------Redirect to the main menu-----------------------------------------------");
            return;

        }
    }

    public static void displayMainMenu() { //method for displayMainMenu

        System.out.println("----------------------------------------------------------------");
        System.out.println("  Welcome to the Jeddah National Hospital Administration");
        System.out.println("----------------------------------------------------------------");
        System.out.println("  Enter \"Book\" to book a new appointment");
        System.out.println("  Enter \"Add\" to add a new patient");
        System.out.println("  Enter \"Exit\" to exit the program");
        System.out.println("Enter your Choice:");
        System.out.println();

    }//method for displayInformation to booking

    public static void displayInfo(int id, String name, int TIME, String clink, int fee, String rial) {



System.out.println("      -------------------------------------------------");
        System.out.println("          Information Details for Booking Appointment");
        System.out.println("      -------------------------------------------------");
        System.out.printf("Name                    :%-10s            National ID Number         :%-10d", name, id);
        System.out.println();
        System.out.printf("Clinic                  : %-10s           Appointment Time           :%-10s ", clink, timeFormating(TIME));
        System.out.println();
        System.out.println("Appointment fee         : " + fee + rial);

    }

    public static char readAndVerify(char clinkk) {//method for check "IRSD" of booking
        Scanner input = new Scanner(System.in);

        String list = "IRSD";
        if (list.contains(clinkk + "")) {

            return clinkk;
        } else {
            printMsg("clinError");//+

            NameIdAppointment(); //*

        }
        return 't';
    }

    public static char readAndVerifyy(char clinkk) {//method for check "risd" of adding
        Scanner input = new Scanner(System.in);

        String list = "IRSD";
        // useing if &  else statment
        if (list.contains(clinkk + "")) {

            return clinkk;

        } else {
            printMsg("clinError");//+

            NameIdAppHightWeght(); //*
        }
        return 't';
    }

    public static void NameIdAppointment() { //method for " booking"
        Scanner input = new Scanner(System.in);
        String STRclink = "";
        char clinkk = 'A';
        String Name = "";
        String rial = " SR";
        int id = 0;
        int fee = 0;
        int Time = 0;
        String Choice = "";
        // using do-while loop
        do {
            printMsg("clink");//+

            clinkk = input.nextLine().charAt(0);
            clinkk = Character.toUpperCase(clinkk);

            clinkk = readAndVerify(clinkk);
        } while (('t' == clinkk));
        System.out.print("  Enter the name (first and last): ");
        Name = input.nextLine();
        System.out.print("  Enter the national ID number:");
        id = Integer.parseInt(input.nextLine());
        System.out.print("  The appointment will be at");
        // useing switch   to selct clinc    
        switch (clinkk) {
            case 'I':
                Time = ICTIME;
                fee = 1000;
                STRclink = "ICU";
                break;

            case 'R':
                Time = RDiTIME;
                fee = 200;
                STRclink = "RADIOLOGY";

                break;
            case 'S':
                Time = SURTIME;
                fee = 3000;
                STRclink = "SURGERY";

                break;

            case 'D':
                Time = DENTTIME;
                fee = 150;
                STRclink = "Dentistry";
                break;
        }

        System.out.println(timeFormating(Time));

        System.out.println("  Press 1 to confirm, 2 to cancel : ");
        int conf = input.nextInt();
        // useing if statment 
        if (conf == 1) {
            
            displayInfo(id, Name, Time, STRclink, fee, rial);

            System.out.println();
            // useing switch   to add one houre
            switch (clinkk) {
                case 'I':
                    ICTIME += 100;
                    break;

                case 'R':

                    RDiTIME += 100;
                    break;

                case 'S':

                    SURTIME += 100;
                    break;

                case 'D':

                    DENTTIME += 100;
                    break;

            }
        }
        printMsg("redir");///contunu 

        // break;
    }



// continue;        
    public static void NameIdAppHightWeght() { //method for "adding"
        Scanner input = new Scanner(System.in);
        String STRclink = "";
        char clinkk = 'A';
        String Name = "";
        String rial = "SR";
        int id = 0;
       
        int fee = 0;
        int Time = 0;
        double BMI = 0;
        int AGE = 0;

        String PHONE = "";
        double WIGHT = 0;
        double HEGHT = 0;

        String Choice = "";
        do {
            printMsg("clink");

            clinkk = input.nextLine().charAt(0);
            clinkk = Character.toUpperCase(clinkk);

            clinkk = readAndVerifyy(clinkk);
        } while (('t' == clinkk));
        System.out.println("  Enter the name (first and last): ");
        Name = input.nextLine();
        System.out.println("  Enter the national ID number:");
        id = Integer.parseInt(input.nextLine());
        System.out.println("  Enter your age:");
        AGE = Integer.parseInt(input.nextLine());
        System.out.println("  Enter your mobile number (###-###-####):  ");
        PHONE = input.nextLine();
        System.out.println("  Enter your weight in Kilogram:");
        WIGHT = Double.parseDouble(input.nextLine());
        System.out.println("  Enter your height in Centimeter: ");
        HEGHT = Double.parseDouble(input.nextLine());

        switch (clinkk) {
            case 'I':
                Time = ICTIME;
                fee = 1000;
                STRclink = "ICU";
                break;

            case 'R':
              
                STRclink = "RADIOLOGY";

                break;
            case 'S':
              
                STRclink = "SURGERY";

                break;

            case 'D':
                
                STRclink = "DENTISTRY";
                break;
        }

     

            displayInfo(id, Name, AGE, PHONE, STRclink, WIGHT, HEGHT, BMI);
            System.out.println();
            printMsg("redir"); //+

        

        //continue; 
    }

    public static String timeFormating(int Time) {  //method "time " to calculat time 

        String pariod = "AM ";//morning
        String pariodD = "PM ";  //evening

        String HOUR = "";
        String MIN = "";
        if (Time > 1300 || (Time == 1300)) {
            pariod = "  PM";
            Time = Time % 1200;

        } else if (Time == 1200) {
            pariod = "  PM";
        } else if (Time < 1200) {
            pariodD = " AM";
        }
        HOUR = Time / 100 + "";
        MIN = Time % 100 + "";
        if (MIN.length() < 2) {
            MIN = "0" + MIN;
        }

        return HOUR + ":" + MIN + "" + pariod;
    }
   
    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);  //create Scanner
        // defind varibles
        char choice = 'C';


       while (true){
             displayMainMenu();
                 String Choice=input.nextLine();
         Choice=Choice.toLowerCase();
        
         
            if(  Choice.equals("exit")){
            System.exit(0);
           
           
           }
            else if(  Choice.equals("book")){

              NameIdAppointment();
       
         continue; 
            }
          
     
         
         else if(  Choice.equals("add")){ 
          
          
          NameIdAppHightWeght();
          
           continue; 
          
          
          }
          
         
         
           else {
                printMsg ("mainMenuError") ;

           
            
           }
        
        
        
    }
    

    }
    
}
