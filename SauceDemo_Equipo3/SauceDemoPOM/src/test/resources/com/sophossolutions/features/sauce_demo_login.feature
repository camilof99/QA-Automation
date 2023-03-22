

@tag
Feature: Login into page sauceDemo 
  Yo como automatizador voy a probar el logueo de usuarios en la pagina sauceDemo.

  tag1
  Scenario: Login
    Given El usuario debe estar en la pagina "Sauce Demo Login"
    When Ingresa para autenticarse "Username Login" y "Password Login"
    Then Valido que estoy en la pagina de inventario "Products"

