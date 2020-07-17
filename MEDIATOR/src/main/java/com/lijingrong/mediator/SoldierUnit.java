package com.lijingrong.mediator;

public class SoldierUnit implements ArmedUnit {

    private final Commander commander;

    public SoldierUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("SoldierUnit:Attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("SoldierUnit:Cannot attack now,other units are attacking... ");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("SoldierUnit:Stop Attacking...");
        commander.setAttackStatus(true);
    }
}
