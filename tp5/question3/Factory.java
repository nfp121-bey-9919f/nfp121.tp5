package question3;

/**
 * Fournit une abstraction pour la création d'objet de type T.
 * 
 * @param <T> Type d'objet.
 */
public interface Factory<T> {
    /**
     * Crée une nouvelle instance de T.
     * 
     * @return L'instance de T.
     */
    public T create();
}