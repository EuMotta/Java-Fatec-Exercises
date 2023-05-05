<p align="center">

  <img src="https://www.svgrepo.com/show/432999/checklist.svg" alt="Matriz Logo" width="200px" height="50px" align="right">
  <h1 align="left"> Exercicios de Métodos parte 03 </h1>

</p>

### Exercício 1

>  Crie um programa de conversão de temperaturas em Celsius para Fahrenheit. O usuário deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a fórmula F= (9*C/5) + 32.


| Entrada | Saída |
|:------:|:-----------:|
| Entre com a temperatura em Celsius | Temperatura em Fahrenheit |
| 0 | 32 |
| 100 | 212 |
| 30 | 86 |

---

### Exercício 2

>  Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como parâmetro de entrada e retorne a temperatura convertida. Para os cálculos de conversão, utilize asfórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuário desejar.

| Entrada | Saída | Cálculo |
|:------:|:-----------:|:-----------:|
| [C]Celsius, [F] Fahrenheit e [S] Sair: V | Opção Inválida! ||
| [C]Celsius, [F] Fahrenheit e [S] Sair: C <br> Entre com a temperatura: 0  | 32 | [ F = (9 * 0 / 5) + 32 ] |
| [C]Celsius, [F] Fahrenheit e [S] Sair: F <br> Entre com a temperatura: 86  | 30 | [ C = 5 * (86 – 32) / 9 ] |

---

### Exercício 3

>  Semelhante ao exercício [POO-015] Crie um programa de conversão de temperaturas, mas agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit e Kelvin. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser executado enquanto o usuário desejar.

| Entrada | Saída | Cálculo |
|:------:|:-----------:|:-----------:|
| [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: M | Opção Inválida! ||
| [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C <br> Entre com a temperatura: 0  | F: 32 e K: 273 | [ F = (9 * 0 / 5) + 32 ] <br> [ K = 0 + 273 ]|
| [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: F <br> Entre com a temperatura: 86  | C: 30 e K: 303  | [ C = 5 * (86 – 32) / 9 ] <br> [ K = 86 + 273 ] |
| [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: K <br> Entre com a temperatura: 0  | C: -273 e F: -459,4  | [ C = 0 – 273 ] <br> [ F = (9 * (0 – 273) / 5) + 32 ] |

---

### Exercício 4

>  Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta as duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário o valor double das 3 notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota mais alta e a nota mais baixa. Tente criar apenas um método para retornar essas médias. Este método deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. As notas devem ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.

| Entrada | Saída | Cálculo |
|:------:|:-----------:|:-----------:|
| Entre com a nota | Resultado | Formula utilizada |
| 6 ; 8 ; 4 | Média maiores: 7 <br> Média aritmética: 6 <br> Maior nota: 8 <br> Menor nota: 4  | [ (6 + 8) / 2 ] <br> [ (6 + 8 + 4) / 3 ] <br> [ 6, __8___, 4 ] <br> [ 6, 8, __4__ ] |
| 6 ; 8 ; 14 | Média maiores: 7 <br> Média aritmética: 4,7 <br> Maior nota: 8 <br> Menor nota: 0  | [ (6 + 8) / 2 ] <br> [ (6 + 8 + 0 ) / 3 ] <br> [ 6, __8__, 0 ] <br> [ 6, 8, __0__ ] |
---

<br>
<br>

<p align="center">

  <h1 align="center"> Números primos </h1>
  
Um número inteiro primo tem exatamente dois divisores naturais distintos: o número 1 e ele 
mesmo. Por definição, 0, 1 e -1 não são números primos. A propriedade de um número inteiro ser 
um primo é chamada "primalidade", e a palavra "primo" também é utilizada como substantivo ou 
adjetivo, se um número inteiro tem módulo maior que um e não é primo, diz-se que é composto 
(0, 1 e -1 também não são compostos). Como "dois" é o único número primo par, o termo "primo 
ímpar" refere-se a todo primo maior do que dois. Existem 168 números primos positivos menores 
do que 1000. São eles: <br> 

> 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 
83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 
191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 
307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 
431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 
563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 
677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 
823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 
967, 971, 977, 983, 991 e 997
</p>

<br>
<br>

### Exercício 5

>  Crie um programa que imprima na tela todos os números primos de 1 até 1000. Para tanto, crie um método que receba um número inteiro como parâmetro de entrada e verifique se este número é primo ou não retornando um boolean como resposta.

| Saída |
|:-----------:|
|2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991 e 997|

---

### Exercício 6

>  Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados como parâmetros de entrada para um método que irá gerar todos os números primos existentes no intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com a responsabilidade de imprimir o array de primos retornado pelo método. O método deve aceitar e entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.

| Entrada | Saída | 
|:------:|:-----------:|
| Entre os valores | Resultado |
| 10 ; 50 |  11 13 17 19 23 29 31 37 41 43 47  | 
| 231 ; 205 | 211 223 227 229  |
| 19 ; 19 | 19  |
---

<p align="center">

  <h1 align="center"> Como se calcula o MDC?  </h1>
  
Uma das maneiras de calcular o MDC entre dois ou mais números inteiros é realizando a listagem dos divisores de cada número envolvido e verificando qual é o maior deles que aparece igualmente nas listas em questão.
<br> 
 Neste exemplo sabemos que o resultado é 10. Chegaremos a esse resultado utilizando o 
método da fatoração em números primos.
<br>

| Entrada | Divisão | 
|:------:|:-----------:|
| 20 ; 10 | 2  |
| 10 ; 5 | 2  |
| 5 ; 5 | 5  |
| 1 ; 1 | |
</p>
<br>
<br>

### Exercício 6

>   Crie um programa que solicite ao usuário dois números inteiros. Através de um método que receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor Comum) destes números fornecidos. 

| Entrada | Saída | Cálculo |
|:------:|:-----------:|:-----------:|
| Entre com um valor | MDC | Fórmula utilizada |
| 10 <br> 20 | 10 | 10, 20 &#124; 2 [√] <br> 5, 10 &#124; 2 [x] <br>   5, 5 &#124; 5 [√] <br> 1, 1 &#124; <br> 1 * 2 * 5 = 10 |
| 162 <br> 90 | 18 | 162, 90 &#124; 2 [√] <br> 81, 45 &#124; 3 [√] <br> 27, 15 &#124; 3 [√] <br> 9, 5 &#124; 3 [x] <br> 3, 5 &#124; 3 [x] <br> 1, 5 &#124; 5 [x] <br> 1, 1 &#124; <br>  1 * 2 * 3 * 3 = 18 |
| 23 <br> 21 | 1 | 23,21 &#124; 3 [x]<br>23,7 &#124; 7 [x]<br>23,1 &#124; 23 [x]<br>1,1 &#124; <br> 1 =1|
---

### Exercício 6

>   Crie um programa que solicite ao usuário um número inteiro, que representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um array. Através de um método que receba esse array de números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor Comum) desse conjunto de dados. Valide as entradas para aceitar apenas números positivos (pode ser um método). 

| Entrada | Saída | Cálculo |
|:------:|:-----------:|:-----------:|
| Entre com a quantidade de termos | MDC | Fórmula utilizada |
| 5 <br> 10 <br> 50 <br> 30 <br> 20 <br> 40 | 10 | 10, 50, 30, 20, 40 &#124; 2 [√] <br> 5, 25, 15, 10, 20 &#124; 2 [x] <br> 5, 25, 15 ,5 ,10 &#124; 2 [x] <br> 5, 25, 15, 5, 5 &#124; 3 [x] <br> 5, 25, 5, 5, 5 &#124; 5 [√] <br>1, 5, 1, 1, 1 &#124; 5 [x] <br>1,1 ,1 ,1 ,1 &#124; <br> 1 *2 *5 =10 |
|3 <br>45 <br>27 <br>36 |9 |45 ,27 ,36 &#124;2 [x]<br>45 ,27 ,18 &#124;2 [x]<br>45 ,27 ,9 &#124;3 [√]<br>15 ,9 ,3 &#124;3 [√]<br>5 ,3 ,1 &#124;3 [x]<br>5 ,1 ,1 &#124;5 [x]<br>1 ,1 ,1 &#124; <br> 1 *3 *3 =9|
|2 <br>162 <br>90 |18 |162 ,90 &#124; 2 [√]<br>81 ,45 &#124; 3 [√]<br>27 ,15 &#124; 3 [√]<br>9 ,5 &#124; 3 [x]<br>3 ,5 &#124; 3 [x]<br>1 ,5 &#124; 5 [x]<br>1 ,1 &#124;  <br> 1 *2 *3 *3 =18|
|1 <br>23 |23 |23 &#124; 23 [√]<br>1 &#124; <br>  1 * 23 = 23|
|0 |- |- |
|-7 |Erro! Valor inválido |- |
