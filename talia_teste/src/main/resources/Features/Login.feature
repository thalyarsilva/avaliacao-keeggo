@TesteKeego @Login
Feature: Login

  @RealizarLogin
  Scenario: Login Realizado com Suceso
    Given que esteja no site Advantage clico no icone USER
    When preencho o campo usuario
    And preencho o campo senha
    And clico em SigIn
    Then valido o acesso ao sistema
