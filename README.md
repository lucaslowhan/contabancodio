# Banco - Sistema de Cadastro de Contas

Este é um sistema simples desenvolvido em Java que permite o cadastro de informações de uma conta bancária, como o número da agência, número da conta, nome do cliente e saldo. Após a inserção desses dados, o sistema exibe uma mensagem de boas-vindas para o cliente com os detalhes da sua conta.

## Funcionalidades

- Entrada de dados do cliente:
    - Número da agência
    - Número da conta
    - Nome do cliente
    - Saldo da conta
- Exibição de mensagem personalizada com as informações cadastradas.

## Como Executar

1. Certifique-se de que você tenha o JDK (Java Development Kit) instalado no seu computador.
2. Crie um arquivo `Main.java` e cole o código fornecido.
3. Compile o código:
   ```bash
   javac Main.java
4. Execute o programa:
   ```bash
   java Main

## Exemplo de Saída

Ao executar o programa, o usuário será solicitado a inserir os seguintes dados:
```yaml
Por favor, digite o número da agência:
1234
Digite o número da conta:
56789
Digite o nome do cliente:
João Silva
Digite o saldo:
1000.50
```
A saída será:
```css
Olá João Silva, obrigado por criar uma conta em nosso banco, sua agencia é 1234, conta 56789 e seu saldo 1000.5 já está disponível para saque.
