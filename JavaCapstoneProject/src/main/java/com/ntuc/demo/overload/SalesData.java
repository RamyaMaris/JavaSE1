
package com.ntuc.demo.overload;

public class SalesData {

    public static void main(String args[]) {
        SalesData sd = new SalesData();
        int cost = sd.finalPrice(100,10);
        int costAfterDisc = sd.finalPrice(100,10,10);
        System.out.println("-->"+cost);
        System.out.println("-->" +costAfterDisc);
    }
    
    int finalPrice(int up, int qty){
        return up* qty;
    }
    
    int finalPrice(int up, int qty, int disc){
        return ((up*qty)-disc);
//        return (up*qty)*(1-disc);
    }
}

