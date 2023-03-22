@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @patchGo
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "Go Endpoint" por patch con id "98021"
      | email  | hulk@gmail.com |
      | name   | Bruce Banner   |
      | gender | male           |
      | status | inactive       |
    Then Validar que el status sea 200
