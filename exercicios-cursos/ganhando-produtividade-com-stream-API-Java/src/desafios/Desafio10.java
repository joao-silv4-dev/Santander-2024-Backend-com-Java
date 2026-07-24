import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio10{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> multiplos = new ArrayList<>();

		multiplos.addAll(numeros.stream().filter(n -> n%3==0||n%5==0).toList());
		multiplos.forEach(System.out::println);
	}
}