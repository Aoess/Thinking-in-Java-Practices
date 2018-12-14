package yfc.chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Practice30 {
    public static void main(String[] args) {
        CollectionSequence c1 = new CollectionSequence();
        for(int i = 0; i < 5; i++) {
            c1.add(Generator_String.next());
        }
        System.out.println(c1);
        System.out.println(c1.contains(Generator_String.next()));
        System.out.println(c1.remove(Generator_String.next()));
        System.out.println(c1.remove(Generator_String.next()));
        System.out.println(c1);
        c1.clear();
        System.out.println(c1.isEmpty());
    }
}

class CollectionSequence implements Collection<String>{

    private String[] pokemon = new String[100];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    @Override
    public boolean contains(Object o) {
        String str = (String)o;
        for(int i = 0; i < size; i++) {
            if(pokemon[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int ii = 0;
            @Override
            public boolean hasNext() {
                return ii < size ? true : false;
            }

            @Override
            public String next() {
                return pokemon[ii++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return pokemon;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        T[] arr = (T[]) pokemon.clone();
        return arr;
    }

    @Override
    public boolean add(String s) {
        if(size < 100){
            pokemon[size++] = s;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        String str = (String) o;
        for(int i = 0; i < size; i++) {
            if(pokemon[i].equals(str)){
                size--;
                for(int j = i; j < size; j++) {
                    pokemon[j] = pokemon[j+1];
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for(int i = 0 ;i < size; i++) {
            pokemon[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            sb.append(pokemon[i]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
