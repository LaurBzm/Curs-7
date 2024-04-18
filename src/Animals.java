class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal mouse = new Mouse();
        Animal chicken;
//        chicken = new Chicken();
        Animal duck;
//        duck = new Duck();


        dog.walk();
        cat.talk();
        mouse.eat();
//        chicken.eat();
//        duck.walk();


    }
}

interface Walk {
    public void walk();
}

interface Eat {
    public void eat();
}

interface Talk {
    public void talk();
}

interface Animal extends Eat, Talk, Walk {

}

class Dog implements Animal {

    String getName() {
        return "dog";
    }

    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void talk() {

    }

    @Override
    public void eat() {

    }

}


class Cat implements Animal {

    String getName() {
        return  "cat";
    }

    @Override
    public void walk() {

    }

    public void talk() {
        System.out.println("Cat is talking");
    }


    @Override
    public void eat() {

    }
}

class Mouse implements Animal {

    String getName() {
        return "mouse";
    }

    public void walk() {
        System.out.println("Mouse is eating");
    }

    @Override
    public void talk() {

    }

    @Override
    public void eat() {

    }

}