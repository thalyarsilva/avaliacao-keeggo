@TesteKeego
Feature: Criar Conta

  @CriarNovaConta
  Scenario: Cadastro realizado com sucesso
    Given que abro a pagina de login 
    When clico em criar uma nova conta 
    And preencho meu cadatro com detalhes da conta, detalhes pessoais, morada.Concordo com os termos de uso e privacidade 
    Then realizo meu registro com sucesso 
