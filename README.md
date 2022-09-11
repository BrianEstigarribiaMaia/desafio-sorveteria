# Desafio

Uma sorveteria fez uma pesquisa para descobrir qual dos cinco 
sabores que servem é o mais popular. As opções de sabor são:
flocos, chocolate, morango, creme e napolitano. O seu trabalho 
é contabilizar qual é o sabor mais popular.
Os sabores foram mapeados para códigos de acordo com a seguinte 
tabela:

0 - Flocos
1 - Chocolate
2 - Morango
3 - Creme
4 - Napolitano


Você deve escrever uma função que recebe como parâmetro um 
array contendo os votos de todos os participantes identificados
pelos respectivos códigos e retorna o código do sabor mais 
popular. Se houver um empate, o menor código entre os empatados
deve ser retornado.

Exemplos:

Entrada [ 0, 2, 3, 4, 4]
Deve retornar 4, pois é o sabor com maior ocorrência


Entrada [ 1, 1, 1, 3, 4, 4]
Deve retornar 1, pois é o sabor com maior ocorrência


Entrada [ 1, 1, 3, 0, 1, 4, 0, 0]
Deve retornar 0, pois, apesar de ter o mesmo número de ocorrência
s que 1, esse código é menor.
