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
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
		

  @tag1
  Scenario: Reservar un vuelo
    Given El usario debe estar en la pagina.. "New Tour Flight Page"
    When Ingresar datos para reservation:
      | type      | oneway           |
      | passenger |              	 2 |
      | departing | London           |
      | on        | June             |
      | onDay     |               13 |
      | arriving  | Paris            |
      | return    | October          |
      | dayReturn |               15 |
      | service   | Business         |
      | airline   | Unified Airlines |
    Then Y valida que aparezca mensaje en pantalla home "After flight finder - No Seats Avaialble  "
    
    