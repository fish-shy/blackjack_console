public class Renderer {
  
    
    void RenderStart()
    {
        String[] asciiArt = {
            ".------..------..------..------..------..------..------..------..------.",
            "|B.--. ||L.--. ||A.--. ||C.--. ||K.--. ||J.--. ||A.--. ||C.--. ||K.--. |",
            "| :(): || :/\\: || (/\\) || :/\\: || :/\\: || :(): || (/\\) || :/\\: || :/\\: |",
            "| ()() || (__) || :\\/: || :\\/: || :\\/: || ()() || :\\/: || :\\/: || :\\/: |",
            "| '--'B|| '--'L|| '--'A|| '--'C|| '--'K|| '--'J|| '--'A|| '--'C|| '--'K|",
            "`------'`------'`------'`------'`------'`------'`------'`------'`------'",
            "press any key to continue"
        };

        for (String line : asciiArt) {
            System.out.println(line);
        }
       
        
    }
    
    void RenderChoice(int money ,String name)
    {
        System.out.println("********************** \n"+ name + " money = " + money + "\n1 . play \n2 . \n 0 . exit \n********************** ");
    
        
    
    
    }
    
    void CardRender(int card)
    {
        switch(card)
        {
            case 1:
                
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
        
        
        
        }
    
    }
}
