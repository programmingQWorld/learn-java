package com.base.threaddemo2;

public class PublicVarThreadA  extends Thread {
    private PublicVar publicVar;
    public PublicVarThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }
    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
