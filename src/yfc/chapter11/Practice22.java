package yfc.chapter11;

import java.util.*;

public class Practice22 {

    public static void main(String[] args) {
        String[] strlist = Generator_String.sublist(0,20);
        System.out.println(Arrays.toString(strlist));
        Set<pokemon> set = new HashSet<>();
        for(int i = 0; i < strlist.length; i++) {
           pokemon p = new pokemon(strlist[i]);
           set.add(p);
        }
        System.out.println(set);
    }
}
class pokemon {

    private String name;
    private int number = 1;

    public pokemon(String name) {
        this.name = name;
    }

    public pokemon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "pokemon{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pokemon pokemon = (pokemon) o;
        if(Objects.equals(name, pokemon.name)){
            int ii = pokemon.getNumber();
            pokemon.setNumber(++ii);
            return true;
        };
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}