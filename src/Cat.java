public class Cat extends Animal{
    public Cat() {
        super("Vasya", true);
    }

    public Cat(String name, boolean isWalking) {
        super(name, isWalking);
    }

    @Override
    public String toString() {
        return "Cat:" + this.getName() +"; walk: "+  this.isWalking();
    }
}
