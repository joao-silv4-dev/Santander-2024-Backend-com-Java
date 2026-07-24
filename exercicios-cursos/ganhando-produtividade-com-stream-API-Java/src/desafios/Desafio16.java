import java.util.Arrays;
import java.util.List;

public class Desafio16{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> pares = numeros.stream().filter(n -> n%2==0).toList();
		List<Integer> impares = numeros.stream().filter(n -> !(n%2==0)).toList();
		System.out.println("Numeros pares: ");
		pares.stream().forEach(System.out::println);
		System.out.println("Numeros impares: ");
		impares.stream().forEach(System.out::println);
		
	}
}