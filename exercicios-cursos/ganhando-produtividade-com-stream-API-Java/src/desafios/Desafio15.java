import java.util.Arrays;
import java.util.List;

public class Desafio15{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(numeros.stream().anyMatch(n -> n<0));
	}
}