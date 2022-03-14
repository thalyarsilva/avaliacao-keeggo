@TesteKeego @Logout
Feature: Logout

  @RealizarLogout
  Scenario: Sair do sistema
    Given que esteja no site Advantage clico no icone USER
    When preencho o campo usuario
    And preencho o campo senha
    And clico em SigIn
    And clico no menu user
    And clico em sair
    Then valido o Logout
