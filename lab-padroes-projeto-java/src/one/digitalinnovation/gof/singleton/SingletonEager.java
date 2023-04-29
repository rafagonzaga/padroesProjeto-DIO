package one.digitalinnovation.gof.singleton;

/**
 * Singleton apressado
 *
 * @author rafagonzaga
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    // o pulo do gato é deixar o construtor privado
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
