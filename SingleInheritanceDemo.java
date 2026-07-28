class Varun {

    void eat() {
        System.out.println("Varun eats food");
    }
}

class Shekhar extends Varun {

    void study() {
        System.out.println("Shekhar study java);
    }
}

public class SingleInheritanceDemo {

    public static void main(String[] args) {

        Shekhar s = new Shekhar();

        s.eat();     // Inherited method
        s.study();   // Child class method
    }
}