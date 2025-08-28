#Continuação...

Teste dos métodos gets com o posteman.

`@PostMapping` -> mapeamento de inclusão de dados. Ele usará o protocolo http post.

`@RequestBody` -> no front para enviarmos as informações usamos formulários. E os formulários vem do body do front.

`return ResponseEntity.status(HttpStatus.CREATED)` -> ele envia a informação para inserir no protocolo http.

Na hora de cadastrar ele cadastra apenas um formulário por vez.