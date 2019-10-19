package com.lfy.state;

/**
 * 状态类
 */
public abstract class State {
    /**
     * 扣除积分
     */
    public abstract void reduceMoney();

    /**
     * 进行抽奖
     * @return 是否抽奖成功
     */
    public abstract boolean raffle();

    /**
     * 领取奖品
     */
    public abstract void dispencePrize();
}
