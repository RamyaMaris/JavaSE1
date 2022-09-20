
package com.ntuc.demo.practicework;

public class OddnoEvenno {
    static OddnoEvenno obj = new OddnoEvenno();
    public static void main(String[] args) {
        obj.findOddEven();
    }
    public void findOddEven(){
        System.out.println("Odd Numbers are :");
        for(int i = 1; i <= 100; i++)
        {
            
            if((i%2) != 0)
            {
                 System.out.printf("%-4d ", i);
            }
           
        }
        System.out.println("\nEven Numbers are :");
        for(int j = 1; j <= 100; j++)
        {
            
            if((j%2) == 0)
            {
                 System.out.printf("%-4d ", j);
//                 System.out.print(j+"\t" );
            }
           
        }
    }
}
