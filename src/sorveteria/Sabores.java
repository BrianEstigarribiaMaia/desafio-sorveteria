package sorveteria;
/*
Uma sorveteria fez uma pesquisa para descobrir qual dos cinco sabores que servem
é o mais popular. As opções de sabor são: flocos, chocolate, morango, creme e napolitano.
O seu trabalho é contabilizar qual é o sabor mais popular. Os sabores foram mapeados para
códigos de acordo com a seguinte tabela:

0 - Flocos
1 - Chocolate
2 - Morango
3 - Creme
4 - Napolitano

Você deve escrever uma função que recebe como parâmetro um array contendo os votos de todos
os participantes identificados pelos respectivos códigos e retorna o código do sabor mais 
popular. Se houver um empate, o menor código entre os empatados deve ser retornado.
*/
import java.util.Arrays;

public class Sabores {
	public int contarFrequencia(int[] arr) {
		Arrays.sort(arr);

		int n = arr.length;
		int max = 1;
		int temp = arr[0];
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1])
				count++;
			else {
				if (count > max) {
					max = count;
					temp = arr[i - 1];
				}
				count = 1;
			}
		}
		
		if (count > max) {
			max = count;
			temp = arr[n - 1];
		}
		
		return temp;
	}
}
