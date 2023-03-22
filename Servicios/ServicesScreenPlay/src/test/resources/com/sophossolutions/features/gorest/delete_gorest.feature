
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @deleteGo
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "Go Endpoint" para delete con id "99023"
    Then Validar que el status sea 204
