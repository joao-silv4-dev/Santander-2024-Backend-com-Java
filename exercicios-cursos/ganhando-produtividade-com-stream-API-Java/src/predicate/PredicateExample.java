import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		Predicate<Integer> pares = n -> n%2==0;

		numeros.stream().filter(pares).forEach(n -> System.out.println(n));

	}
}