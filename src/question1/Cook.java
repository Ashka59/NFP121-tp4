package question1;

public class Cook implements Strategy{

    private Strategy strategy;

    public void setStrategy(Strategy strategy) { this.strategy = strategy; }

    @Override
    public RiceCookingWays cookRice() {
        return strategy.cookRice();
    }
}
