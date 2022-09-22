/*
 * Activity 2.4.1
 */
import java.util.Scanner;

public class Swagalicious
{
  public static void main(String[] args)
  {
    int num = 0;
    Scanner console = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    do {
        System.out.println("Enter your numbers or type -1 to stop");
        
        num = console.nextInt();
        if(num == -1)  
            break;
        
        if (num < min){
            min = num;
        }
        
        if(num > max){
            max = num;
        }
    } while (true);
    
    System.out.println("Max: " + max);
    System.out.println("Min: " + min); 
    
  }
  
}