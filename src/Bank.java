interface advBank {
    void facebook();
    void email();
    void print();
}


abstract class Adv1 implements advBank {
    public void facebook()
    {
        System.out.println("Your bank is on facebook :");
    }
}

abstract class Adv2 extends Adv1 {
    public void email()
    {
        System.out.println("Your bank email :");
    }
}

class Adv3 extends Adv2 {
    public void print() {}
}


class GFG {
    public static void main(String[] args)
    {
        Adv3 d = new Adv3();
        d.facebook();
        d.email();
        d.print();
    }
}