package emma.watson;

/**
 * 延迟加载线程安全写法
 */
public class Singleton {

    private Singleton(){

    }

    private static class SingleHolder{
        private final static Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton(){
        return SingleHolder.singleton;
    }

}
