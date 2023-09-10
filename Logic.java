
import java.util.Scanner;
public class Logic {
   Cards cards = new Cards();
    private int player;
    private int computer;
    private int[] card = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10};
       void ComputerInput()
    {
            
        if (computer <= player && computer <= 21)
        {
            computer += ChoiceDraw();
        }
   }
    void Play()
   {
       player = ChoiceDraw();
       System.out.println(player);
       player += ChoiceDraw();  
       System.out.println(player);
       computer = ChoiceDraw();
       System.out.println(computer);
       computer += ChoiceDraw();
       System.out.println(computer);
   }   

       
    void CheckWin()
    {
        int checkwin;
        if(player <= 21 && player > computer)
        {
            checkwin =  1;// = player win    
        
        }
        else if(player < computer && computer <= 21)
        {
            checkwin =  2;// computer win
        }
        else if(player > 21 && computer <= 21)
        {
            checkwin =  2;
        }
        else if(computer > 21 && player <= 21 )
            checkwin = 1 ;
        else
        {
            checkwin =  3;// = draw 
        }
        
        System.out.println("your card" + player);
        System.out.println("computer card" + computer);
      
    
        
         switch (checkwin)
     {
         case 1:
             System.out.println("you win");
             break;
     
         case 2:
             System.out.println("you lose");
             break;
             
         case 3 : 
             System.out.println("its a draw");
             break;
             
                    
     
     }
        
                 
    }
     
    int ChoiceDraw()
    {
        int temp;
        temp = cards.Draw(card);
        cards.RemoveTheElement(card , temp);
        return temp;
    
    }
   

   public void GameRunning()
   {
      Scanner scan  = new Scanner(System.in);
      int choice;
      int checkWin;
      Play();
      System.out.println("your card" + player);
      System.out.println("computer card" + computer);
      
    
      System.out.println("**********************\n1. Draw \n2. stand \n**********************");
      choice = scan.nextInt();
      do{
      switch(choice )
      {
          
      
          case 1: 
              player += ChoiceDraw();
              ComputerInput();
              break;
              
          case 2 : 
              ComputerInput();
              CheckWin();
              break;
              
      
      
      } 
   }while(computer < 21 || player < 21);
      CheckWin();
}
   
   
   
    
}
   


    
   
   

