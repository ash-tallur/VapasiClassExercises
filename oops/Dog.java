package AbstractionExercise;

class Dog implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog says: bow bopw");
    }

    @Override
    public void run() {
        System.out.println("Dog crazily runs");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create a Pig object
        myDog.animalSound();
        myDog.sleep();
    }
}
