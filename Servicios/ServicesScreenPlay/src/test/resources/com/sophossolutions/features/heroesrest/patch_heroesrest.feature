@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @patchHeroes
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Heroes Rest" del servicio.
    When Consulta el endpoint "Heroes Endpoint" por patch con id "1" y data "Heroes Data Post" 
    Then Validar que el status sea 200.
