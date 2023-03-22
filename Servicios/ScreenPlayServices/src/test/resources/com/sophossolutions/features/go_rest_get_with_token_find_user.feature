@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "Go Endpoint" con una peticion get usando toekn y el id "1014359"
    Then Validar que el status sea 200 y que la respuesta contenga toda la información del usuario
      | id     |           1014359 |
      | name   | James Bond        |
      | email  | bond007@gmail.com |
      | gender | male              |
      | status | active            |
