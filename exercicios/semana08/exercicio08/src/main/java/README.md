## Questões Subjetivas
***

__Questão 01__

Não é possível instanciar classes abstratas. O principal objetivo dessas classes é servir de referência como uma super Classe na utilização de Polimorfismo 
e Herança dos atributos e métodos contribuindo assim para uma implementação sem redundâncias e deixando o código mais elegante e funcional.

__Questão 02__

Nessa situação, a classe filha `ClasseConcreta` deve reescrever o mesmo método da classe mãe `ClasseAbstrata` sem a palavra reservada `abstract` e que o método tenha um corpo.

__Questão 03__

Ocorrerá erro de compilação. Pois a Classe Abstrata tem seu método abstrato que apenas tem a finalidade de referencia e não é permitido ser chamada, com isso as classes filhas 
serão obrigadas a reescrever este método tornando-as concreto.
