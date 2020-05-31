package com.lijingrong.remoteControl;

public class AirConditionerOnCommand implements Command{

    private final AirConditioner airConditioner;

    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.on();
    }
}
