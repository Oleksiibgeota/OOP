package geometry;

public class Test {

    private static Test instance;

    public static Test getTest(){
        if(instance==null){
            instance = new Test();
        }
        return instance;
    }

    private int test1;
    private String test2;
    private Square test3;
    private boolean test4;

    private Test() {
    }

    public int getTest1() {
        return test1;
    }

    public String getTest2() {
        return test2;
    }

    public Square getTest3() {
        return test3;
    }

    public boolean isTest4() {
        return test4;
    }
}
