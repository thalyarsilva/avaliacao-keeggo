@TesteKeego
Feature: Adicionar Produtos

  @AdicionarProdutos
  Scenario: Adicionar um Produto
    Given com navegador aberto na url correta
    When clico em um produto especifico
    And o adiciono no meu carrinho
    Then valido o produto adicionado com sucesso
