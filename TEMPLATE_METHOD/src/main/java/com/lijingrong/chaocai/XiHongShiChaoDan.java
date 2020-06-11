package com.lijingrong.chaocai;

public class XiHongShiChaoDan extends ChaoCai {

    @Override
    protected void zhuangDie() {
        System.out.println("装小盘子");
    }

    @Override
    protected void fangCaiFanChao() {
        System.out.println("加西红柿");
    }

    @Override
    protected void jiaCaiLiao() {
        System.out.println("加入鸡蛋");
    }

    @Override
    protected void jiaYou() {
        System.out.println("加菜子油");
    }
}
