

@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
		Given El usuario debe estar en la pagina "Sauce Demo Login"
    When Ingresa para autenticarse "Username Login" y "Password Login"
    Then Valido que estoy en la pagina de inventario "Products"
    
    Given Debe estar en la página del inventario "Products"
    When Clickea los productos a agregar "add-to-cart-sauce-labs-fleece-jacket" y "add-to-cart-sauce-labs-bolt-t-shirt" 
    Then Valido que los productos se agreguen correctamente "2"

  @tag1
  Scenario: See products in cart
    Given Debe ir a la pagina del carrito
    And Ver mensaje "Your Cart"
    When Busco los productos en el carrito
    Then Muestro por consola los productos del carrito
