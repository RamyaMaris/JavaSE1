
package com.ntuc.demo.array.multidimentiion;
public class RowsColumnsCountry1 {

    public static void main(String args[]) {
       
        String[][] country = new String[2][4];
        
            country[0][0] = "Country";
            country[0][1] = "India";
            country[0][2] = "Singapore";
            country[0][3] = "Malaysia";
            
            country[1][0] = "Capital";
            country[1][1] = "delhi";
            country[1][2] = "SG";
            country[1][3] = "KL";
            
            System.out.printf("%s %10s \n",country[0][0],country[1][0]);
            System.out.println("________________________");
            
            for (int j = 1; j < 4; j++) {
                System.out.printf("%s %10s \n",country[0][j],country[1][j]);
            }
        
    }
}

