public class Dog extends Animal implements DogFeature{
    @Override
    public void speak() {
        System.out.println("Bow Bow");
    }

    @Override
    public boolean AreDogsLoyal() {
        System.out.println("Dog are loyal");
        return false;
    }
}
