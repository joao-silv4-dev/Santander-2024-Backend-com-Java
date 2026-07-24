import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo{
	public static void main(String[] args) {

		List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		// Lambda
		Consumer<Integer> numeroPares = n -> {
			if(n%2==0) System.out.println(n);
		};

		// Imprimindo passando list
		numerosList.stream().forEach(numeroPares);;
	}
}