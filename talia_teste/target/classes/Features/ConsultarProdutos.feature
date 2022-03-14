@TesteKeego
Feature: Consultar Produtos

  @ConsultarProdutos
  Scenario: Consultar Produto 
    Given que esteja logado no site
    When clico no icone da lupa 
    And pesquiso algum produto especifico
    Then aparece na tela opcoes compativeis a minha pesquisa 
