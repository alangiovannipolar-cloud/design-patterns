package org.singleton;

class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(null==instance) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}