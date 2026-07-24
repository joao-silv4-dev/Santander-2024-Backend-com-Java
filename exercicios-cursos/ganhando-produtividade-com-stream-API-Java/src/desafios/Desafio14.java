import java.util.Arrays;
import java.util.List;

public class Desafio14{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,11);

		System.out.println(numeros.stream().filter(n -> {
					if (n<=1){
						return false;
					}
					for (int i=2; i*i<=n; i++){
						if (n %i==0) return false;
					}
					return true;
				}).max((n1,n2) -> Integer.compare(n1, n2)));

	}
}