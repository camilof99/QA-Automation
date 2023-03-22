@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Iniciar sesión ToursNew
    Given El usuario debe estar en la pagina. "New Tours Login"
    When Ingresa "New Tours username" y "New Tours password" para autenticarse
    Then Y valida el mensaje de la pantalla Home "Login Successfully"
