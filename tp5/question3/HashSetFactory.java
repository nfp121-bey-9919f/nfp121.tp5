package question3;

import java.util.Set;
import java.util.HashSet;

/**
 * Fournit une factory de création pour les ensembles non ordonnés de type {@see java.util.HashSet}.
 * 
 * @param <T> Type d'élément contenu dans l'ensemble non ordonné.
 */
public class HashSetFactory<T> implements Factory<Set<T>>{
    /**
     * Crée une nouvelle instance de {@see java.util.HashSet}.
     * 
     * @return La nouvelle instance de {@see java.util.HashSet}.
     */
    public Set<T> create() {
        return new HashSet<T>();
    }
}