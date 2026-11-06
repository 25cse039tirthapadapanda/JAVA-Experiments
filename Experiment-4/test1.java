class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }

    void sleep() {
        System.out.println("Animal sleeps peacefully.");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird pecks at seeds and insects.");
    }

    @Override
    void sleep() {
        System.out.println("Bird sleeps in its nest.");
    }

    void fly() {
        System.out.println("Bird flies high in the sky.");
    }
}

class test1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}

