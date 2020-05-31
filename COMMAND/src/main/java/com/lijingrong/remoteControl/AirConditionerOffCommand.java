package com.lijingrong.remoteControl;

public class AirConditionerOffCommand implements Command {

    private final AirConditioner airConditioner;

    public AirConditionerOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.off();
    }
}
