
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @deleteHeroes
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Heroes Rest" del servicio.
    When Consulta el endpoint "Heroes Endpoint" para delete con id "2".
    Then Validar que el status sea 204.
