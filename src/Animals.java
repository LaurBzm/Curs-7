class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal mouse = new Mouse();
        Animal chicken = new Chicken();
        Animal duck = new Duck();



        dog.walk();
        cat.talk();
        mouse.eat();
        chicken.eat();
        duck.walk();


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

abstract class Animal implements Eat, Talk, Walk {
    abstract String getName();
    public abstract void walk();
    public abstract void talk();
    public  abstract void eat();
    public String name;
}

class Dog extends Animal {

    String getName() {
        return name = "dog";
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


class Cat extends Animal {

    String getName() {
        return name = "cat";
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

class Mouse extends Animal {

    String getName() {
        return name = "mouse";
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

    static class Duck extends Animal {

        String getName() {
            return name = "duck";
        }

        public void walk() {
            System.out.println("Duck is walking");
        }

        @Override
        public void talk() {

        }

        @Override
        public void eat() {

        }
    }
}