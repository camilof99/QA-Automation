
@tag
Feature: Api post Heroes
  I want to use this template for my feature file

  @run @post
  Scenario: Title of your scenario
    Given Dado que "Actor" establece la base url "Heroes Rest" del servicio.
    When Consulta el endpoint "Heroes Endpoint" por una peticion post con la data "Heroes Data"
    Then Validar que el status sea 201 y que el esquema sea el correcto "Heroes Schema Post"...
