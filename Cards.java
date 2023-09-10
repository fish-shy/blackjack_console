import java.util.Random;
import java.util.Arrays;

public class Cards {
    
    public static int[] RemoveTheElement(int[] arr, int index)
    {
  
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
            || index >= arr.length) {
  
            return arr;
        }
  
        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];
  
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
  
            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
  
            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }
  
        // return the resultant array
        return anotherArray;
    } 
    
    
    public int RandomNumberGenerator(int[] cards)
    {
        Random random  =new Random();
        int randomNumber = random.nextInt(cards.length) ;
    
        return randomNumber;
    }
    
    int Draw(int[] cards)
    {   
        int value = 0;  
        int randomNumber = RandomNumberGenerator(cards);
        for(int i = 0 ; i < cards.length ; i++ )
        {
            if(i == randomNumber)
            {   
                if(cards[i] == 1 )
                {
                    if(value < 11  )// value < 11 ace jadi 11 
                    {
                         value+=11;
                         
                         return value;
                    }
                }
                
                else
                {
                    value +=  cards[i];
                    return value;
                }
                
                
            }
        
        }
         return value;   
        
    
    
    }
}
    
