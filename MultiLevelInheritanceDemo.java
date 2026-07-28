class PavanKalyan {

    PavanKalyan() {
        System.out.println("PavanKalyan Constructor");
    }
}

class Varun extends PavanKalyan {

    Varun() {
        super();
        System.out.println("Varun Constructor");
    }
}

class Shekhar extends Varun {

    Shekhar() {
        super();
        System.out.println("Shekhar Constructor");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Shekhar s = new Shekhar();
    }
}