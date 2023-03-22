

@tag
Feature: The number game
  Yo como automatizador voy a probar.

  @run
  Scenario: Random number
    Given Dado que me encuentro en la pagina  "The Number Game Page"
    When Hago roll con cantidad "Demo"
    Then Veo el mensaje Correct
    And Imprimo el numero de intentos por consola
    