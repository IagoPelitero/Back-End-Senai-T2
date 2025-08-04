# Encapsulamento

2º pilar de POO;

É esconder os detalhes internos de um objeto e só prmitir de forma controlada.

Analogia:
Pense em uma caixa de remédios:
Você não precisa saber como o remédio é feito.
Você toma só a dose correta, com instruções.

Protege o conteúdo e controla o acesso.

Por que encapsular?

Segurança: impede mudanças indevidas nos dados internos;
Manutenção: facilita no conserto e atualizar o código;
Organização
Controle

Como fazer?

Atributos privados
Métodos públicos 
Validações internas nos métodos

~~~Java
public class Pessoa{
  private String nome;
  private int idade;
  public String getNome(){
   return nome;
}
public void setNome(String nome){
  if (nome != null && !nome.isEmpty()){
   this.nome=nome;
 }
}

public int getIdade(){
   return idade;
}

public void setIdade(int idade){
   if (idade >= 0 && idade <= 120){
     this.idade=idade;
   }
  }
 }
~~~

Interface 

Lista de serviços fornecidos por um componente. É o contato com o mundo exterior. É formada apenas por métodos, geralmente abstratos.

Não possui atritutos apenas métodos. É padronizado e tem todos os métodos que as classes precisam ter.