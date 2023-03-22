@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @getHeroes
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Heroes Rest" del servicio.
    When Consulta el endpoint "Heroes Endpoint" y el id "6".
    Then Validar que el status sea 200 y la informacion "Heroes Data Get".

