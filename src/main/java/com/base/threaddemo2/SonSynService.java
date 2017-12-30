package com.base.threaddemo2;

public class SonSynService extends FatherSynService {

    public void run () {
        super.run();
        SonSynService son = new SonSynService();  // 子类声明，子类实例化
        son.operateIMainMethod();
    }
}
