package StrategyDesign.classes;
import StrategyDesign.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    
    public OffRoadVehicle() {
        super(new SportsDriveVehicle());
    }
}
