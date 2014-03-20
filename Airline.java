import java.util.Scanner;

import java.util.Random;

public class Airline
{
    public static void main(String[] args)
    {
        int n, i, cnt = 0;
        int[] first = new int[5]; 
        int[] Economy = new int[5];
        
        System.out.println("Please type 1 for first class or 2 for Economy");
        
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        switch(n)
        {
            case 1: 
                for(i = 0; i < 5; i++)
                {
                    Random randomNumbers = new Random();
                    first[i] = 1 + randomNumbers.nextInt(5);
                    System.out.printf("%d", first[i]);
                    while(i != 0) 
                    {
                        while(first[i] == first[i - 1])
                        {
                            first[i] = randomNumbers.nextInt();
                        }
                        i--;
                        cnt++;
                    }
                    i += cnt;
                }
            case 2:
                for(i = 0; i < 5; i++)
                {
                    Random randomNumbers = new Random();
                    Economy[i] = 6 + randomNumbers.nextInt(10);
                    System.out.printf("%d", Economy[i]);
                    while(i != 0) 
                    {
                        while(Economy[i] == Economy[i - 1])
                        {
                            Economy[i] = randomNumbers.nextInt();
                        }
                        i--;
                        cnt++;  
                    }
                    i += cnt;
                }
            default:
                System.out.println("Please input correct option.");
        }
        System.out.println("\t\t\tB O A R D I N G   P A S S"); 
    }
}          
                  
