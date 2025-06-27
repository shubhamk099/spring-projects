package com.codeplay.factory;

import com.codeplay.beans.Vehicle;

public class VehicleFactory {

    // have to make the methods static, because the supplier functional interface
    // does not take any input arguments, that can be used as object upon which
    // these methods can be called
    public static Vehicle createAudiVehicle() {
        Vehicle audi = new Vehicle();
        audi.setName("AUDI-R8");
        return audi;
    }

    public static Vehicle createTeslaVehicle() {
        Vehicle tesla = new Vehicle();
        tesla.setName("Tesla Model X");
        return tesla;
    }
}
