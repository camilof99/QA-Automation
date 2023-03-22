@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given El usuario debe estar en la pagina "Sauce Demo Login"
    When Ingresa para autenticarse "Username Login" y "Password Login"
    Then Valido que estoy en la pagina de inventario "Products"

  @tag1
  Scenario Outline: Filtrar productos
    Given El usario debe estar en la pagina del inventario "Products"
    When Selecciona campo con el filtro Desc Z - A "<filterOption>"
    Then Imprimir en consola los productos ordenados <productOrder>

    Examples: 
      | filterOption | productOrder    |
      | za           | Desc            |
      | az           | Asc             |
      | lohi         | por precio Asc  |
      | hilo         | por precio Desc |
    #When Selecciona campo con el filtro Desc Low - High "hilo"
    #Then Imprimir en consola los productos ordenados por precio Desc
