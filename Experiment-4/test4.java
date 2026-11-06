class Fruit {
    String name;
    String taste;

    Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet");
    }

    @Override
    void eat() {
        System.out.println("Apple (" + taste + "): It is crisp and delicious!");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Citrus/Tangy");
    }

    @Override
    void eat() {
        System.out.println("Orange (" + taste + "): It is juicy and refreshing!");
    }
}

class test4 {
    public static void main(String[] args) {
        Fruit fruit1 = new Apple();
        Fruit fruit2 = new Orange();

        fruit1.eat();
        fruit2.eat();
    }
}

