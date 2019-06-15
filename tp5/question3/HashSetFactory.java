package question3;

import java.util.Set;
import java.util.HashSet;

/**
 * Fournit une factory de cr�ation pour les ensembles non ordonn�s de type {@see java.util.HashSet}.
 * 
 * @param <T> Type d'�l�ment contenu dans l'ensemble non ordonn�.
 */
public class HashSetFactory<T> implements Factory<Set<T>>{
    /**
     * Cr�e une nouvelle instance de {@see java.util.HashSet}.
     * 
     * @return La nouvelle instance de {@see java.util.HashSet}.
     */
    public Set<T> create() {
        return new HashSet<T>();
    }
}