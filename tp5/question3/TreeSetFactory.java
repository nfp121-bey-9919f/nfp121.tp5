package question3;

import java.util.Set;
import java.util.TreeSet;

/**
 * Fournit une factory de cr�ation pour les ensembles ordonn�s de type {@see java.util.TreeSet}.
 * 
 * @param <T> Type d'�l�ment contenu dans l'ensemble ordonn�.
 */
public class TreeSetFactory<T extends Comparable<T>> implements Factory<Set<T>>{
    /**
     * Cr�e une nouvelle instance de {@see java.util.TreeSet}.
     * 
     * @return La nouvelle instance de {@see java.util.TreeSet}.
     */
    public Set<T> create() {
        return new TreeSet<T>();
    }
}