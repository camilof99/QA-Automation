@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Req Rest" del servicio..
    When Consulta el endpoint "Req Endpoint" por medio de una peticion post..
      | name | James Bond |
      | job  | leader     |
    Then Validar que el status sea 201 y que el esquema sea el correcto "Req Schema Post"..
