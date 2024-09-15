package StrategyDesign.classes;
import StrategyDesign.strategy.SportsDriveStrategy;

public class SportsDriveVehicle extends Vehicle {
    
    public SportsDriveVehicle() {
        super(new SportsDriveStrategy());
    }
}
