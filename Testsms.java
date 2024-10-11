import java.util.Scanner;
public class Testsms{
    public static void main(String[] args) {
        
        
        SmsSystem s1=new SmsSystem();

        while(true){

        
       System.out.println("Enter 1 to display all contact details");
       System.out.println("Enter 2 to search a specific contact");
       System.out.println("Enter 3 to send text");
       System.out.println("Enter 4 to add a contact");
       System.out.println("Enter 5 to delete a contact");
       System.out.println("Enter 0 to exit!");

       Scanner scanner1=new Scanner(System.in);
       System.out.println("PLEASE ENTER:");
       int i=scanner1.nextInt();

       switch(i){

        case 1:
        {
            s1.display();
            break;
        }
        case 2:{
            s1.searchContact();
            break;
        }
        case 3:{
            s1.SendText();
            break;
        }
        case 4:{
            s1.addContact();
            break;
        }
        case 5:{
            s1.delete();
            break;
        }
        case 0:{
            System.out.println("\t\tEXITING!");
            System.exit(0);
            break;
        }
        default:{
            System.out.println("Please enter a valid digit");
            break;
        }
        

        }
        
       
}
}
}