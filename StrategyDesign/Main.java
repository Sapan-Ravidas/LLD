package StrategyDesign;

import StrategyDesign.classes.Goodsvehicle;
import StrategyDesign.classes.SportsDriveVehicle;
import StrategyDesign.classes.Vehicle;

public class Main {
    public static void main(String... args) {
        Vehicle sportsVehicle = new SportsDriveVehicle();
        sportsVehicle.drive();

        Vehicle goodsVehicle = new Goodsvehicle();
        goodsVehicle.drive();
    }
}
