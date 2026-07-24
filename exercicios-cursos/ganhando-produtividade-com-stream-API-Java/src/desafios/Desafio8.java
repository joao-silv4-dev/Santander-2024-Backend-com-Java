import java.util.Arrays;
import java.util.List;

public class Desafio8{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(numeros.stream().reduce(0, (n1,n2) -> n1+n2));
	}
}