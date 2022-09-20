
package com.ntuc.demo.useinterface;

import com.ntuc.demo.interfaces.Vehicle;

public class cars implements Vehicle{
    public static void main(String args[]) {
        // TODO code application logic here
    }

    @Override
    public int engineCapacity() {
        return 3;
    }

    @Override
    public String fuelType() {
        return "liquid";
    }

    @Override
    public boolean hybrid() {
        return false;
    }

    @Override
    public float milage() {
        return 10.3f;
    }

    @Override
    public String typeOFBody() {
        return "suv";
    }

    @Override
    public int passengerCapacity() {
        return 5;
    }
}
