package one.digitalinnovation.gof.singleton;

/**
 * Singleton preguiçoso
 *
 * @author rafagonzaga
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    // o pulo do gato é deixar o construtor privado
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }

}
