
@tag @get
Feature: Api get Heroes
  I want to use this template for my feature file

  @run @get
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Heroes Rest" del servicio....
    When Consulta el endpoint "Heroes Endpoint"
    Then Validar que el status sea 200 y Validar Json Schema "Heroes Schema Get"..
