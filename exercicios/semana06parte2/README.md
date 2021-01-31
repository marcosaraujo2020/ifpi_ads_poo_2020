## Questões Subjetivas
***

__Questão 04__

b) 
```ruby 
Peixe p = new Animal();
```

Apresenta erro de compilação, falha na construção. Informa que  são de tipos incompatível. Animal nao pode convertido para Peixe. 
Ou seja, o construtor deve obrigatoriamente ter o mesmo nome da Classe.
Nessa Situação Animal é a classe super. O Erro é corrigido quando o construtor tem o mesmo nome da CLasse.  

O correto seria: `Peixe p = new Peixe();`

__Questão 11__ :  Marque V ou F:

Legenda:
- [x] Verdadeiro
- [ ] Falso    

- [x] em uma instancia b da classe B, se fizermos b `instanceof` A retorna true
- [x] em uma instancia a da classe A, se fizermos a `instanceof` B retorna false
- [ ] B possui o atributo1
- [x] Em B o atributo não é visível
- [x] Caso o atributo fosse modificado de private para protected, poderia ser acessado normalmente em B

__Questão 12__

```ruby
  A a = new B();
  System.out.println(a.metodo1());
 ```
  Exibiu: _"metodo 1, classe B"_
  
  __Questão 13__

```ruby
  A a = new B();
  System.out.println(a.metodo2());
 ```
  Apresenta Erro de compilação. A justificativa é que o objeto "a" é uma instância da `Classe A` no qual não possui o "`método2()`";
  
  __Questão 14__

```ruby
  public class B extends A {
    public String metodo1(){
      return super.metodo1();
    }
  }
 ```
 A saída exibiu: _"metodo 1, Classe A"_
 
Ou seja, o uso do "__super__" no metodo sobreescrito na `Classe B` utilizou-se do método da `Classe Mãe`.


__Questão 16__

```ruby
public class B {
  public String metodo1() {
    return "metodo 1 da classe B";
  } 

  public String metodo1() {
    return "metodo 1 da classe B, segunda versão";
  }
}
```
Os métodos1 implementado duas vezes com a mesma assinatura (sem parâmetros), apresenta erro no segundo que foi implementado, pois já foi definido e o  sistema nao aceita 
repetição do método. Portanto, para isso ser possível, o Polimorfismo de Sobrecarga resolveria essa situação caso o metodo1 que foi implementado novamente tivesse 
assinatura por exemplo do tipo "String texto" como parâmetro.

__Questão 17__

```ruby
      public class Calculadora {
          public int soma(int op1, int op2) {
              return op1 + op2;
          }

          public double soma(int op1, int op2) {
              return op1 + op2;
          }
      }
```
O problema da definição referente aos métodos, é que segundo o Polimorfismo de sobrecarga, os metodos que são iguais devem apresentar assinaturas diferentes. 
Na implementação acima, por mais que o tipo de retorno sejam diferentes, mas as assinaturas referentes aos parâmetros são de *quantidades e tipos iguais*.
  
  
