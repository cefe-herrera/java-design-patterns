package singletonThreadSafe;

public class Main {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        if(singleton1 == singleton2){
            System.out.println("are unique instances");
        }
    }

}
