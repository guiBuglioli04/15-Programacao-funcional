package Exercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Empregados> lista = new ArrayList<>();
        lista.add(new Empregados("Guilherme",6,2000));
        lista.add(new Empregados("Roberto",4,3000));
        lista.add(new Empregados("Adalberto",7,10000));

        //predicado --> filtro lógico --> armazenado como um objeto
        Predicate<Empregados> filtro = e -> e.anosExperiencie() >=5;

/*        lista.stream().map(c-> new Empregados(c.nome(),c.anosExperiencie(),
                c.salario()* (filtro.test(c)? 1.20 :1.10)))
                .sorted(Comparator.comparing(Empregados::nome))
                .forEach(System.out::println);*/

        List<Empregados> aux= lista.stream().map(c-> new Empregados(c.nome(),c.anosExperiencie(),
                        c.salario()* (filtro.test(c)? 1.20 :1.10)))
                .sorted(Comparator.comparing(Empregados::nome))
                .toList();

        aux.forEach(System.out::println);
    }
}
