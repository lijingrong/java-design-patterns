package com.lijingrong.remoteControl;

public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        remoteControl.setBtn(new LightOnCommand(light));
        remoteControl.buttonWasPressed();
        remoteControl.setBtn(new LightOffCommand(light));
        remoteControl.buttonWasPressed();
        remoteControl.setBtn(new AirConditionerOnCommand(airConditioner));
        remoteControl.buttonWasPressed();
        remoteControl.setBtn(new AirConditionerOffCommand(airConditioner));
        remoteControl.buttonWasPressed();
    }
}
