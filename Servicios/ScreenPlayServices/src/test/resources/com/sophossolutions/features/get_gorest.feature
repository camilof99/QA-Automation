@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Dado que "Camilo" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "Go Endpoint" y el id "85968"
    Then Validar que el status sea 200 y que la respuesta contenga toda la información del usuario
      | id     |                      85968 |
      | name   | Charuchandra Naik          |
      | email  | naik_charuchandra@dare.org |
      | gender | female                     |
      | status | inactive                   |
    And Validar Json Schema "Go Schema"
