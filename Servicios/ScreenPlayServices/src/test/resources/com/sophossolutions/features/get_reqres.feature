@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Req Rest" del servicio..
    When Consulta el endpoint "Req Endpoint"..
    Then Validar que el status sea 200 y que la respuesta contenga toda la información del usuario..
      | id         |                      7 |
      | email      | janet.weaver@reqres.in |
      | first_name | Janet                  |
      | last_name  | Weaver                 |
    And Validar Json Schema "Req Schema Get"..
