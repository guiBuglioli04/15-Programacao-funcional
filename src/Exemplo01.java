import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Exemplo01 {
    public static void main(String[] args) {
        int [] x={7,4,6,1,2};
        IntStream fluxo = IntStream.of(x);

        //filtra apenas os números impares e coloca em ordem crescente
/*        fluxo.filter(valor-> valor %2 == 1)
                .sorted()
                .forEach(System.out::println);*/

        //filtrar os números pares, somar 10 unidades e colocar em ordem crescente
//        fluxo.filter(valor-> valor %2==0)
//                .map(valor-> valor +10)
//                .sorted()
//                .forEach(System.out::println);

        //impressão da soma dos elementos
        int total = fluxo.reduce(0,(a,b)->a+b);
        System.out.println(total);
    }
}
