package oop;

public class SuperInit {

    SuperInit() {
        new Dummy("constructor @ super");
    }

    {
        new Dummy("block @ super");
    }

    static {
        new Dummy("static block @ super");
    }

    Dummy superA = new Dummy("field @ super");
    static Dummy superB = new Dummy("static field @ super");
}
