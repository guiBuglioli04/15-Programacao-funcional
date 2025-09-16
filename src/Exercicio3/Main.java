package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(new Produto("Video game",1001,"Eletrônico"));
        listaProduto.add(new Produto("Garrafa",1000,"Acessório"));
        listaProduto.add(new Produto("Bala",1000,"Comida"));

        Predicate<Produto> filtro = p -> Objects.equals(p.categoria(), "Eletrônico") && p.preco()>1000;


        List<Produto> aux = listaProduto.stream()
                .filter(filtro)
                .map(c-> new Produto(c.nome(),c.preco() - (c.preco() * 0.10) ,c.categoria())).toList();
        aux.forEach(System.out::println );
    }
}
