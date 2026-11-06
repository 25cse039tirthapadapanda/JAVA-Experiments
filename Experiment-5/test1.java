interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class test1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}

