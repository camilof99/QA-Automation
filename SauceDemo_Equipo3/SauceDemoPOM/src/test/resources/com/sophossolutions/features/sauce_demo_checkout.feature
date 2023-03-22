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

    Given Debe ir a la pagina del carrito "shopping_cart_link"
    And Ver mensaje "Your Cart"
    When Busco los productos en el carrito "cart_item"
    Then Muestro por consola los productos del carrito
	
  @tag1
  Scenario: Checkout compra
    Given Deber dirigirse a la pagina de checkout "checkout"
    And Validar que esté el mensaje "Checkout: Your Information"
    When Llenar el formulario y completar checkout
      | firstName | James |
      | lastName  | Bond  |
      | zipCode   | 007   |
    Then Validar que aparezca texto "Checkout: Overview"
   	
   	When Buscar información de la compra y finalizar
   	Then Imprimir por consola información de la compra
   	And Validar que aparezca texto en pantalla "Thank you for your order!"
    
    

