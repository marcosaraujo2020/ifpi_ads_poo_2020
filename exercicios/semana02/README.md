# Respostas das Questões Subjetivas


### Questão 01

Para compilarmos uma classe em java o primeiro comando para gerar o bytecode deverá ser o seguinte: `javac Avaliacao.java`
Após esse comando ser executado no diretorio é criado um arquivo `.class` com o mesmo nome da classe.
Em seguida para executar o programa usa o comando `java Avaliacao` 

### Questão 02

A variável `contador` não será inicializada uma vez que só foi declarada e não recebeu nenhum valor de atribuição. Alem disso, no `main()` ficou faltando os parâmetros `String[] args`.
Codigo deveria seguir assim:

```
public class Aplicacao {

	public static void main(String[] args) {
		int contador = 1;	
		System.out.println(contador++);
	}
}
```

### Questão 03

Ao executar codigo abaixo, teremos como resultado o valor 9. Isso acontece porque no JAVA realiza-se o operador curto circuito no qual na primeira condição do operador lógico `&& (and)` sendo falsa o resultado ja cai no print do else, ou seja `a-b >> 9 - 0 = 9`.

```
public class Exemplo {

	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		if ((a > 11) && (++b <= 100)) {
			System.out.println(a*b);
		} else {
			System.out.println(a-b);
		}
	}
}
```

### Questão 04

Com a execução do código abaixo, o resultado foi a impressão do número 1 três vezes. Isso se deu pelo fato de na estrutura do switch como não tem o `break` para cada caso, ele seguiu testanto as outras.

```
public class Questao4 {

	public static void main(String[] args) {
		int op = 1;
		
		switch (op) {
			case 1: System.out.println(op);
			case 2: System.out.println(op);
			default: System.out.println(op);
		}
	}
}
```

### Questão 05

A correção do código acontece incluindo apenas a soma de a+b detro dos parênteses >> `(a+b)`.

```
public class Questao5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		System.out.println("Soma: " + (a + b));
	}
}
```

### Questão 09

A abordagem mais estruturada é a quesatão 06 e as questoes 07 e 08 são as orientadas a objetos se  tornando mais modularizada e reutilizavel. A orientada a objeto se torna mais burocrática devido a necessidade de codificar mais e criar outros arquivos, no entanto tem o poder de organização comparada a estruturada.
