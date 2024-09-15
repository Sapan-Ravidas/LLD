package StrategyDesign.classes;

import StrategyDesign.strategy.NormalDriveStrategy;

public class Goodsvehicle extends Vehicle {
    public Goodsvehicle() {
        super(new NormalDriveStrategy());
    }
}
