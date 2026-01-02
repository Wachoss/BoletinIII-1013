import java.util.*;

public class HashBag<E> {

    private ArrayList<E> table;      // Almacena los elementos
    private ArrayList<Integer> count; // Almacena el número de copias
    private int size;                // Número total de elementos (sumando copias)
    private int used;                // Número de entradas ocupadas en la tabla

    /**
     * (a) Devuelve la posición de dispersión inicial para un item 
     */
    private int hash(E item) {
        return Math.abs(item.hashCode()%table.size());
    }

    /**
     * (b) Devuelve el número de copias de un item [cite: 31]
     */
    public int count(E item) {
        // Tu código aquí:
        // 1. Calcula posición inicial con hash(item)
        // 2. Recorre linealmente mientras count sea distinto de -1
        // 3. Si encuentras el item, devuelve su valor en 'count'
        return 0;
    }

    /**
     * (c) Añade una copia del elemento [cite: 33]
     * Devuelve true si es la primera vez que se añade, false si ya existía [cite: 34]
     */
    public boolean add(E item) {
        // Tu código aquí:
        // 1. Si el item ya existe, incrementa su contador en 'count'
        // 2. Si no existe, busca el primer hueco disponible (-1 o 0) e insértalo
        // 3. No olvides actualizar 'size' y 'used' según corresponda
        return false;
    }
}