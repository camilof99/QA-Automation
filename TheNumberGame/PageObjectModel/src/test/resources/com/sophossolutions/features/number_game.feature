
@tag
Feature: The number game
  Yo como automatizador, quiero probar la pagina de Number Game
  para simular el lanzamiento de los dados, adivinar el número generado
  y poder imprimir el número de intentos

  @run
  Scenario: Random number
    Given Dado que me encuentro en la pagina "The Number Game Page"
    When Cuando hago roll con cantidad "Demo"
    Then Entonces veo el mensaje Correct
    And Y debería imprimir el numero de intentos por consola
