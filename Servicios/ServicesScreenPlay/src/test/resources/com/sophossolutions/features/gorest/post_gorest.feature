@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @postGo
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "Go Endpoint" por medio de una peticion post
      | email  | jamesbond007@gmail.com |
      | name   | James Bond            |
      | gender | male                  |
      | status | active                |
    Then Validar que el status sea 201 y que el esquema sea el correcto "Go Schema"
