# Array 

Um conjunto de dados do mesmo tipo. Ele possui uma limitação de valor fixo.

# ArrayList

Ele pode crescer ou encolher confome você adiciona ou remove elementos.

Por que usar?
1- Tamanho dinâmico: não precisa se preocupar com números exatos
2- Fácil de usar
3- Versatilidade

## Como criar um ArrayList
Primeiro improtamos igual o scanner
Segundo se cria assim: `ArrayList<tipo> lista = Array<>();`
Terceiro os mais usados são: add: `nomeAtribuido.add(item)`; remove: `nomeAtribuido.remove(item)`; get: acessa o elemento solicitado -> `nomeAtribuido.get(índice)`; size(): mostra quantos elementos possui -> `nomeAtribuido.size();` 
Dica: Qual o primeiro elemento de um vetor? O primeiro é 0. Se são 10 precisa começar em 0 e terminar em 9. Ao pedir o 10 ele mostra um erro.
Contains: verifica se um item está na lita retornando verdadeiro ou falso; `nomeAtribuido.contains(item)`
Clear: remove todos os itens da lista; `nomeAtribuido.clear()`
Collections.sort: coloca os elementos da lista em ordem crescente (alfabética no caso de strings);
`Collections.sort(lista)`