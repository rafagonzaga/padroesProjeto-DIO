package one.digitalinnovation.gof.singleton;

/**
 * Singleton Lazy Holder
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Ref</a>
 *
 * @author rafagonzaga
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // o pulo do gato é deixar o construtor privado
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
