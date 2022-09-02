package Romario;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(123,"Otavyo",12);
        Pessoa pessoa2 = new Pessoa(321,"Tyago",17);
        Pessoa pessoa3 = new Pessoa(231,"Dyego",32);
        Pessoa pessoa4 = new Pessoa(132,"Gosttavu",48);
        Pessoa pessoa5 = new Pessoa(213,"Vaitor",29);
        Pessoa pessoa6 = new Pessoa(312,"Quenso",37);
        Pessoa pessoa7 = new Pessoa(312,"Quenso2",37);

        Set<Pessoa> pessoaSet = new TreeSet<>();
        Collections.addAll(pessoaSet,pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6,pessoa7, pessoa5);
        pessoaSet.add(pessoa1);
        pessoaSet.add(pessoa5);


        Iterator<Pessoa> iterator = pessoaSet.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}

