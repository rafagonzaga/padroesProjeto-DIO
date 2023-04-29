package one.digitalinnovation.gof.singleton;

public class Test {

    public static void main(String[] args) {
        // Testes relacionados ao Design Pattern Singleton

        // Lazy
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        // Eager
        CepApi eager = CepApi.getInstancia();
        System.out.println(eager);
        eager = CepApi.getInstancia();
        System.out.println(eager);

        // Lazy Holder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



    }
}
