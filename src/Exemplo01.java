import java.util.stream.IntStream;

public class Exemplo01 {
    public static void main(String[] args) {
        int [] x={7,4,6,1,2};
        IntStream fluxo = IntStream.of(x);
        //filtra apenas os números impares e coloca em ordem crescente
        fluxo.filter(valor-> valor %2 == 1).sorted().forEach(System.out::println);


    }
}
