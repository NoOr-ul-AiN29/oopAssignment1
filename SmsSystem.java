import java.time.LocalDateTime;
import java.util.Scanner;

public class SmsSystem{

        Sms s[][]=new Sms[10][100];
      {  
        
        for(int i=0;i<s.length;i++){
          for(int j=0;j<s[i].length;j++){
            s[i][j]=new Sms(new Receiver("null","null","null","null"),"Seen");
          }
        }

        for(int k=0;k<s.length;k++){
          for(int l=0;l<s[k].length;l++){
            s[0][l]=new Sms(new Receiver("Receiver email1","name1","03417782601"),"Seen");

          }
        }
        
        for(int k=0;k<s.length;k++){
          for(int l=0;l<s[k].length;l++){
            s[1][l]=new Sms(new Receiver("Email2","name2","03417782602"),"Seen");
            
          }
        }
        s[0][0].getReceiver().setText("This is my 1st message to receiver index 0");
        s[0][0].getReceiver().setReceiverTime(LocalDateTime.now());
        s[0][1].getReceiver().setText("This is my 2nd message to receiver index 0");
        s[0][1].getReceiver().setReceiverTime(LocalDateTime.now());
        s[0][2].getReceiver().setText("This is my 3rd message to receiver index 0");
        s[0][2].getReceiver().setReceiverTime(LocalDateTime.now());
        s[1][0].getReceiver().setText("This is my 1st message to receiver index 1");
        s[1][0].getReceiver().setReceiverTime(LocalDateTime.now());
        s[1][1].getReceiver().setText("This is my 2nd message to receiver index 1");
        s[1][1].getReceiver().setReceiverTime(LocalDateTime.now());
        s[1][2].getReceiver().setText("This is my 3rd message to receiver index 1");
        s[1][2].getReceiver().setReceiverTime(LocalDateTime.now());
    
    }

    public void display(){

      //display

      System.out.println("Enter 1 to display all details\nEnter 2 to display only Texts");
      Scanner sd=new Scanner(System.in);
          int s1=sd.nextInt();
          sd.nextLine();
     for(int i=0;i<s.length;i++)
     {
      
       for(int j=0;j<s[i].length;j++){

        if(!s[i][j].getReceiver().getText().equals("null")) {
          switch(s1){
            case 1:{
              s[i][j].display();
              break;
            }
            case 2: {
          
              System.out.println(s[i][j].getReceiver().getName()+" : "+s[i][j].getReceiver().getText()+"\n");
              break;
            }
            default: {
              System.out.println("Enter a valid digit");
              break;
            }
          }
        }
       }
       
     }
   }

    public void delete(){

      //deleting
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
      
        System.out.println("\t\tEnter the name of receiver you want to delete");
        String name=sc.nextLine();
        System.out.println("Enter 1 if you want to delete the complete history of receiver ");
        System.out.println("Enter 2 if you want to delete all the messages of this receiver ");
        System.out.println("Enter 3 if you want to delete a specific message of this receiver");
        int check=sc.nextInt();
        switch(check){
          
        case 1:
        
        {
          //deleting the entire history
          for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
              if(s[i][j].getReceiver().getName().equals(name))
              {
                flag=true;
                s[i][j].getReceiver().setText("null");
                
              }
                
             }
     }
     break;
  }
        case 2:
  {
    //deleting all texts of specific receiver
    for(int i=0;i<s.length;i++){
      for(int j=0;j<s[i].length;j++){
        if(s[i][j].getReceiver().getName().equals(name)&&!s[i][j].getReceiver().getText().equals("null"))
        {
          flag=true;
          s[i][j].getReceiver().setText("Text Deleted");
        }
       }

}
  break;
        
  }
  case 3:{
    // deleting a specific text of a specific receiver
    System.out.println("Enter the index of the receiver:");
    int receiverIndex=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the index of message:");
    int messageIndex=sc.nextInt();
    sc.nextLine();
    s[receiverIndex][messageIndex].getReceiver().setText("Text deleted");

    break;
  }
  default:{
    System.out.println("Not a valid digit");
    break;
  }
  }
    if(flag==false){
      System.out.println("The name you entered is not found!");
    }
    else{
      System.out.println("DISPLAYING MESSAGES AFTER DELETING!: ");
      display();
    }
}


public void SendText(){

  //sending text

  System.out.println("Enter the index of the receiver: ");
  Scanner scanner=new Scanner(System.in);
  int id2=scanner.nextInt();
  scanner.nextLine();

boolean flagg=false;
for(int i=0;i<s.length;i++){
  for(int j=0;j<s[i].length;j++){
    if(s[id2][j].getReceiver().getText().equals("null")){
      flagg=true;
      System.out.println("Enter Text: ");
      String text=scanner.nextLine();
      s[id2][j].getReceiver().setText(text);
      System.out.println(s[id2][j].getReceiver().getName()+" Have you seen the text?\nEnter yes or no");
      String b=scanner.nextLine();
      if(b.equals("yes"))
      {
        s[id2][j].setTestStatus("Seen");
        s[id2][j].getReceiver().setReceiverTime(LocalDateTime.now());
      }
      else{
        s[id2][j].setTestStatus("Unseen");
        s[id2][j].getReceiver().setReceiverTime(null);
      }
      break;
    
    }
  }
  if(flagg==true)
  break;
}

}

public void addContact(){

  //Adding a Contact

  System.out.println("The available receiver indexes are:");

  for(int n=0;n<s.length;n++){
    for(int m=0;m<s[n].length;m++){
      if (s[n][m].getReceiver().getName().equals("null")) {
          System.out.print(n+" \n");
          break;
      }
      break;
  }
}
  System.out.println("Please enter the receiver index you want to add:");
  Scanner ad=new Scanner(System.in);
  int id=ad.nextInt();
  ad.nextLine();
  if(id>9){
    System.out.println("Enter receiver index between 0 and 9");
  }
  else if(!s[id][0].getReceiver().getName().equals("null")){
    System.out.println("This receiver index is already occupied");
  }
  else{
  System.out.println("\t\tENTER COMPLETE DETAILS OF RECEIVER:");
  System.out.println("Enter name: ");
  String n1=ad.nextLine();
  System.out.println("Enter number: ");
  String no1=ad.nextLine();
  System.out.println("Enter email:");
  String e1=ad.nextLine();

    for(int i=0;i<s.length;i++){
      for(int j=0;j<s[i].length;j++){
        if(s[id][j].getReceiver().getName().equals("null"))
        {
          for(int k=0;k<s.length;k++){
            for(int l=0;l<s[k].length;l++){
              s[id][j]=new Sms(new Receiver(e1,n1,no1),"Unseen");
            }
          }
        }
    }
}
}

        System.out.println("\t\t..............\n\t\tContact Added!\n\t\t..............\n");
}


public void searchContact(){


  //displaying a single contact
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter the receiver index of the contact:");
  int index=s1.nextInt();
  s1.nextLine();
  if(index>9||index<0){
    System.out.println("Not a valid receiver index!");
  }
  else if(!s[index][0].getReceiver().getName().equals("null")){
    
      for(int i=0;i<s[index].length;i++){
        if(!s[index][i].getReceiver().getText().equals("null"))
        {
        s[index][i].display();
        }
      }
    
  }
  else{
    System.out.println("This receiver index is not added");
  }
}

//public void sortContact(){

  //using bubble sort method

  //for(int i=0;i<s.length;i++){
    //for(int j=0;j<s[i].length-1;j++){
      //for(int k=0;k<s[i].length-j-1;k++){
        //  if(s[i][k].getSenderTime().isBefore(s[i][k+1].getSenderTime()))
          //{
            //Sms temp = s[i][k];
            //s[i][k] =s[i][k+1];
            //s[i][k+1] =temp;
          //}
     // }
    //}
  //}

//}



}
