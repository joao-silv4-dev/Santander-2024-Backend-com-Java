import java.util.Arrays;
import java.util.List;

public class Desafio6{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,24,3,64,58,69,7,-8,39);
		System.out.println(numeros.stream().anyMatch(n -> n>10));
	}
}