import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio2{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2,43,6,8,3,1,4,6,4,7);
		System.out.println(numeros.stream().filter(n -> n%2==0).toList().stream().reduce(0, (n1,n2)->n1+n2));
	}
}