
package com.ntuc.demos.conditions;

public class NestedTernaryOperator {
    public static void main(String args[]) {
        // Nested Ternary Operator
        int n1 = 11, n2 = 9, n3 = -11;

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest);
        
        int smallest = (n1 <= n2) ? ((n1 <= n3) ? n1 : n3) : ((n2 <= n3) ? n2 : n3);
        System.out.println("Smallest Number: " + smallest);
        
    }
}
