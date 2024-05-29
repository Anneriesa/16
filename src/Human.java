public class Human extends Actor {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}