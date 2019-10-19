package com.lfy.state;

public class RaffleActivity {

    /**
     * 剩余奖品的数量
     */
    private int count = 0;
    /**
     * 当前活动的状态
     */
    private State state = null;

    NoRaffleState noRaffleState = new NoRaffleState(this);
    CanRaffleState canRaffleState = new CanRaffleState(this);
    DispenceState dispenceState = new DispenceState(this);
    DispenceOutState dispenceOutState = new DispenceOutState(this);

    /**
     * 初始化活动
     * @param count 奖品的数量
     */
    public RaffleActivity(int count) {
        this.count = count;
        //设置状态为不能抽奖状态
        this.state = noRaffleState;
    }

    /**
     * 扣分
     */
    public void debuctMoney() {
        state.reduceMoney();
    }

    /**
     * 抽奖
     */
    public void raffle() {
        if (state.raffle()) {
            state.dispencePrize();
        }
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setState(State state) {
        this.state = state;
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public DispenceState getDispenceState() {
        return dispenceState;
    }

    public DispenceOutState getDispenceOutState() {
        return dispenceOutState;
    }

}
