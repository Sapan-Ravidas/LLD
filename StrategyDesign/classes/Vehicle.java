package StrategyDesign.classes;
import StrategyDesign.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    
    // this is known as constructor injection
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }

    public void drive() {
        driveObject.drive();
    }
}
