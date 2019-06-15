package question3;

import java.util.Set;
import java.util.TreeSet;

/**
 * Fournit une factory de création pour les ensembles ordonnés de type {@see java.util.TreeSet}.
 * 
 * @param <T> Type d'élément contenu dans l'ensemble ordonné.
 */
public class TreeSetFactory<T extends Comparable<T>> implements Factory<Set<T>>{
    /**
     * Crée une nouvelle instance de {@see java.util.TreeSet}.
     * 
     * @return La nouvelle instance de {@see java.util.TreeSet}.
     */
    public Set<T> create() {
        return new TreeSet<T>();
    }
}