#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login into guru tours new
  Yo como automatizador voy a probar el logueo de usuarios en la pagina guru tours new.

  @tag1
  Scenario: Iniciar sesión ToursNew
    Given El usuario debe estar en la pagina. "https://demo.guru99.com/test/newtours/"
    When Ingresa "camilo99" y "12345678" para autenticarse
    Then Y valida el mensaje de la pantalla Home "Login Successfully"
