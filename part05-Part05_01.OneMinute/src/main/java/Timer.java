public class Timer {
    private ClockHand second;
    private ClockHand hundreth;
    public Timer(){
        this.second= new ClockHand(60);
        this.hundreth= new ClockHand(100);
    }

    @Override
    public String toString(){
        return this.second + ":" + this.hundreth;
    }

    public void advance(){
        this.hundreth.advance();
        if (this.hundreth.value() == 00) {
            this.second.advance();
        }
    }
}
