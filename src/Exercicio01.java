import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercicio01 {
    public static void main(String[] args) {
        String[] aux = {"Antonio","Beto","Ana","Carlos","Anabella"};
        List<String> lista = Arrays.asList(aux);

        lista.stream().filter(a-> a.startsWith("A")).map(String::toLowerCase).sorted().forEach(System.out::println);

    }
}
