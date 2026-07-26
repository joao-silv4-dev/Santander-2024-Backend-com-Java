import java.util.Arrays;
import java.util.List;

public class Desafio3{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,51,2,4,5);
		// numeros.add(-4);
		System.out.println(numeros.stream().allMatch(n -> n>0));
	}
}