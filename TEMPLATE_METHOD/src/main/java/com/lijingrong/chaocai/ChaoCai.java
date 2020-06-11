package com.lijingrong.chaocai;

public abstract class ChaoCai {

    public final void chao() {
        reGuo();
        jiaYou();
        jiaCaiLiao();
        fangCaiFanChao();
        zhuangDie();
    }

    //装碟
    protected abstract void zhuangDie();

    //放菜翻炒
    protected abstract void fangCaiFanChao();

    //加材料
    protected abstract void jiaCaiLiao();

    //加油
    protected abstract void jiaYou();

    //热锅
    protected void reGuo() {
        System.out.println("开火热锅...");
    }
}
