package oop;

public class Init extends SuperInit{

    Init() {
        new Dummy("constructor @ child");
    }

    {
        new Dummy("block @ child");
    }

    static {
        new Dummy("static block @ child");
    }

    Dummy childA = new Dummy("field @ child");
    static Dummy childB = new Dummy("static field @ child");


}