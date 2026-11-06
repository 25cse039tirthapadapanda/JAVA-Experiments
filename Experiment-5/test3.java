interface Greetings {
    void sayHello();

    default void sayBye() {
        System.out.println("Default Method: Goodbye! Have a nice day.");
    }
}

class PersonGreeting implements Greetings {
    @Override
    public void sayHello() {
        System.out.println("Abstract Method Implemented: Hello! Welcome to Java.");
    }
}

class test3 {
    public static void main(String[] args) {
        Greetings greeting = new PersonGreeting();
        greeting.sayHello();
        greeting.sayBye();
    }
}

