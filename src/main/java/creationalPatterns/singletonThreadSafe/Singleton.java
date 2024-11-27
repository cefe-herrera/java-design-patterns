package creationalPatterns.singletonThreadSafe;

public class Singleton {
    /*
    The static instance is initialized when the class is loaded by the ClassLoader, which ensures thread safety in multithreaded environments.
     */
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

        if(INSTANCE != null){
            throw new IllegalStateException("Instance was created");
        }
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
