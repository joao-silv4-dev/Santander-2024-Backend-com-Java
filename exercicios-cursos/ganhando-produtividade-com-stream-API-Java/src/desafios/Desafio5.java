import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio5{
	public static void main(String[] args) {
		List<Double> numeros = Arrays.asList(1d,2d,3d,4d,5d,6d,7d,8d);
		List<Double> numerosM5 = numeros.stream().filter(n -> n>5).toList();
		System.out.println(numerosM5.stream().reduce((n1,n2) -> (n1+n2)/2));

	}
}