@tag
Feature: Filters for flights in Despegar
  Yo como automatizador voy a probar los filtros de vuelo, rápidos, baratos y recomendados.

  Background: 
    Given El usuario debe dirigirse a la pagina "Despegar flights"
    When Ingresa información de vuelo
      | origen          | Cartagena de Indias, Bolívar, Colombia |
      | destino         | Medellín, Antioquia, Colombia          |
      | dateIda         | 11/03                                  |
      | dateVuelta      | 12/04                                  |
      | valuePassengers |                                      3 |
    Then Valido que aparezcan la lista de vuelo "Vuelos ida y vuelta"

  @tag1
  Scenario Outline: Filters flight
    Given El usuario debe estar en la pagina de lista de vuelos "Vuelos ida y vuelta"
    When Selecciona campo con el "<filterOption>"
    Then Imprimir los vuelos mas baratos

    Examples: 
      | filterOption |
      | barato       |
      | rapido       |
      | recomendado  |
