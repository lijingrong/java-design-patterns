package com.lijingrong.remoteControl;

public class RemoteControl {

    private Command btn;

    public void setBtn(Command btn) {
        this.btn = btn;
    }

    public void buttonWasPressed(){
        btn.execute();
    }
}
