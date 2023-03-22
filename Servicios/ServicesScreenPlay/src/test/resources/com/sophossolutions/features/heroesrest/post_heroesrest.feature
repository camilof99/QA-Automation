@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @postHeroes
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Heroes Rest" del servicio.
    When Consulta el endpoint "Heroes Endpoint" por post y data "Heroes Data Post"
    Then Validar que el status sea 201.
