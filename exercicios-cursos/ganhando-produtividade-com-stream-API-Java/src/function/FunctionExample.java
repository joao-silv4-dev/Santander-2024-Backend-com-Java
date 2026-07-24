import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		Function<Integer, Integer> dobrar = n -> n*2;
		numeros.stream().map(dobrar).forEach(n -> System.out.println(n));
	}
}