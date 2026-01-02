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
     * (b) Devuelve el número de copias de un item
     */
    public int count(E item) {
        int pos =hash(item);
        while(count.get(pos)!=-1){
            if (count.get(pos)>0 && table.get(pos).equals(item)) return count.get(pos);
            pos = (pos + 1) % table.size();
            if (pos == hash(item)) break;
        }
        return 0;
    }

    /**
     * (c) Añade una copia del elemento
     * Devuelve true si es la primera vez que se añade, false si ya existía
     */
    public boolean add(E item) {
        // Tu código aquí:
        // 1. Si el item ya existe, incrementa su contador en 'count'
        // 2. Si no existe, busca el primer hueco disponible (-1 o 0) e insértalo
        // 3. No olvides actualizar 'size' y 'used' según corresponda
        int pos = hash(item);
        int primerHueco = -1;

        while(count.get(pos) != -1 ){
            if(item.equals(table.get(pos))){
                count.set(pos,count.get(pos) +1);
                size++;
                return false;
            }

            if(count.get(pos) == 0 && primerHueco ==-1){
                primerHueco = pos;
            }
            pos = (pos+1) % table.size();
            if(pos == hash(item))break;
        }
        int destino;
        if(primerHueco != -1){
            destino = primerHueco;
        } else {
            destino = pos;
        }
        if(count.get(destino) == -1){
            used ++;
        }

        table.set(destino, item);
        count.set(destino, 1);
        size++;
        return true;

    }
}