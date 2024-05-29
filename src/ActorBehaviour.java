public interface ActorBehaviour {
    String getName();
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}