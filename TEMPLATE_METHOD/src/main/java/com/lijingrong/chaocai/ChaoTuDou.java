package com.lijingrong.chaocai;

//酸辣土豆丝
public class ChaoTuDou extends ChaoCai {

    @Override
    protected void zhuangDie() {
        System.out.println("装大碟");
    }

    @Override
    protected void fangCaiFanChao() {
        System.out.println("放土豆丝");
    }

    @Override
    protected void jiaCaiLiao() {
        System.out.println("放辣椒和醋");
    }

    @Override
    protected void jiaYou() {
        System.out.println("加豆油");
    }
}
