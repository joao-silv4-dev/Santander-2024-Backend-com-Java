import java.util.Arrays;
import java.util.List;

public class Desafio18{
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(numeros.stream().allMatch(arg0 -> {
				for (int i = 0; i<numeros.size(); i++){
					if(!arg0.equals(numeros.get(i))) return false;
				}
				return true;
			}));
	}
}