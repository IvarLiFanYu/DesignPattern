package com.lfy.bridge;

public class XiaoMiPhone extends AbstractPhone {

    @Override
    public void playMusic() {
        System.out.println("小米播放音乐");
        shellInterface.wearShell();
    }

}
