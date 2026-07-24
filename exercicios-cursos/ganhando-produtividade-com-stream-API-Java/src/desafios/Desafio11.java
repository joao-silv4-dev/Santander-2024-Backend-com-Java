import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio11{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(numeros.stream().mapToInt(n -> n*n).sum());
	}
}