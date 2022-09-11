package sorveteriateste;
/*
Entrada [ 0, 2, 3, 4, 4]
Deve retornar 4, pois é o sabor com maior ocorrência

Entrada [ 1, 1, 1, 3, 4, 4]
Deve retornar 1, pois é o sabor com maior ocorrência

Entrada [ 1, 1, 3, 0, 1, 4, 0, 0]
Deve retornar 0, pois, apesar de ter o mesmo número de ocorrência que 1,
esse código é menor.
 */
import sorveteria.Sabores;

public class TesteSabores {

	public static void main(String[] args) {
		int[] arr01 = {0, 2, 3, 4, 4};          //4 ok
		int[] arr02 = {1, 1, 1, 3, 4, 4};       //1 ok
		int[] arr03 = {1, 1, 3, 0, 1, 4, 0, 0}; //0 ok
		
		Sabores sabores = new Sabores();
		
		System.out.println(sabores.contarFrequencia(arr01));
		System.out.println(sabores.contarFrequencia(arr02));
		System.out.println(sabores.contarFrequencia(arr03));

	}

}
