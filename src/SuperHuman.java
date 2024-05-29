public class SuperHuman extends Human {
    private String superPower;

    public SuperHuman(String name, String superPower) {
        super(name);
        this.superPower = superPower;
    }

    public String getSuperPower() {
        return superPower;
    }

    @Override
    public String getName() {
        return super.getName() + " with super power: " + superPower;
    }
}
