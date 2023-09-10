import java.util.Scanner;

public class user {
   Cards Cards = new Cards();
   Renderer renderer = new Renderer();
   String name;
   int money = 1000;
   Logic logic = new Logic();
   
   public void UserMenuChoice()
   {
       Scanner scan = new Scanner(System.in);
       renderer.RenderStart();
       scan.nextLine() ;
       for(int i = 0 ; i < 50 ; i++)
       {
       
           System.out.println();
       
       }
       int choice;
       System.out.print("your name = ");
       name = scan.nextLine();
       
       renderer.RenderStart();
       do{
           renderer.RenderChoice(money, name);
           choice = scan.nextInt();
           switch(choice)
           {
               case 1: 
                 logic.GameRunning();
                break;  
               case 2:
                   break;
               default:
                   break;
           }
       
       }while(choice != 0);
       
   
   
   }
   
   
   
    
   public void DeleteScanner()
   {
        Scanner scan  = new Scanner(System.in);
      scan.close();
   
   
   }
    
   
   
}
