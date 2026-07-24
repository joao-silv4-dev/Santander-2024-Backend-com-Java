import java.util.Arrays;
import java.util.List;

public class Desafio1{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(4,2,4,6,8,31,3);
		numeros.stream().sorted().forEach(System.out::println);
	}
}