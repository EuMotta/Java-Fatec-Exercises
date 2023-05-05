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
