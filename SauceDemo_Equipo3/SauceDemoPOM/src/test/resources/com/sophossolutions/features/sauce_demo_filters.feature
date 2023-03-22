

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given El usuario debe estar en la pagina "Sauce Demo Login"
    When Ingresa para autenticarse "Username Login" y "Password Login"
    Then Valido que estoy en la pagina de inventario "Products"

  @tag1
  Scenario: Filtrar productos
    Given El usario debe estar en la pagina del inventario "Products"
    When Selecciona campo con el filtro Desc Z - A "za"
    Then Imprimir en consola los productos ordenados Desc

    When Selecciona campo con el fitro Asc A - Z "az"
    Then Imprimir en consola los productos ordenados Asc

    When Selecciona campo con el filtro Asc Low - High "lohi"
    Then Imprimir en consola los productos ordenados por precio Asc
    
    When Selecciona campo con el filtro Desc Low - High "hilo"
    Then Imprimir en consola los productos ordenados por precio Desc
  
  
