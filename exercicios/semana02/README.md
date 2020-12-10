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

### Questão 02

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

### Questão 09

A abordagem mais estruturada é a quesatão 06 e as questoes 07 e 08 são as orientadas a objetos se  tornando mais modularizada e reutilizavel. A orientada a objeto se torna mais burocrática devido a necessidade de codificar mais e criar outros arquivos, no entanto tem o poder de organização comparada a estruturada.
