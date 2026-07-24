import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample{
	public static void main(String[] args) {
		Supplier<String> listaSaudacoes = () -> "Olá!";
		List<String> saudacoes = Stream.generate(listaSaudacoes).limit(5).toList();

		saudacoes.forEach(e -> System.out.println(e));

	}
}