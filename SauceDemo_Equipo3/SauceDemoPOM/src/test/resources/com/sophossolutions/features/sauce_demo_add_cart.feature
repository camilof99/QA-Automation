

@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
		Given El usuario debe estar en la pagina "Sauce Demo Login"
    When Ingresa para autenticarse "Username Login" y "Password Login"
    Then Valido que estoy en la pagina de inventario "Products"

  @tag1
  Scenario: Add products to Cart
    Given Debe estar en la página del inventario "Products"
    When Clickea los productos a agregar "add-to-cart-sauce-labs-fleece-jacket" y "add-to-cart-sauce-labs-bolt-t-shirt" 
    Then Valido que los productos se agreguen correctamente "2"
