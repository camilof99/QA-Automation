@tag
Feature: Search for flights in Despegar
  Yo como automatizador voy a probar la busqueda de vuelos.

  @tag1
  Scenario: Search flights
    Given El usuario debe dirigirse a la pagina "Despegar flights"
    When Ingresa información de vuelo
      | origen          | Cartagena de Indias, Bolívar, Colombia |
      | destino         | Medellín, Antioquia, Colombia          |
      | dateIda         | 11/03                                  |
      | dateVuelta      | 12/04                                  |
      | valuePassengers |                                      3 |
    Then Valido que aparezcan la lista de vuelo "Vuelos ida y vuelta"
