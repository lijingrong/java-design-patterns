package com.lijingrong.mediator;

public class TankUnit implements ArmedUnit {

    private final Commander commander;

    public TankUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("TankUnit:Attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("TankUnit:Cannot attack now,other units are attacking....");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("TankUnit:Stop attacking...");
        commander.setAttackStatus(true);
    }
}
