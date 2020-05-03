package org.singleton;

public class Test {

    Singleton ob1;
    Singleton ob2;

    public static void main( String[] args )
    {
        Test test = new Test();
        test.ob1 = Singleton.getInstance();
        test.ob2 = Singleton.getInstance();
        test.existOnlyOneInstance();

    }

    private void existOnlyOneInstance() {
        if (assertion(true, ob1.equals(ob2))) {
            System.out.println("Passed Test");
        }else {
            System.out.println("No Passed Test");
        }
    }

    private boolean assertion(boolean expected,boolean result) {
        return expected == result;
    }

}
