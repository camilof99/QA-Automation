@tag
Feature: Buscar habitaciones en el destino deseado
  Yo como automatizador debo ser capaz de buscar habitaciones con los filtros especificaos

  @search
  Scenario Outline: Filtro <typeFilter> Destino <destino>
    Given El usuario "Actor" debe estar en la pagina de booking e ir a alojamientos "Booking URL"
    When Ingresa datos de prueba para filtrar alojamientos
      | destino      | <destino>      |
      | fechaIn      | <fechaIn>      |
      | fechaOn      | <fechaOn>      |
      | adultos      | <adultos>      |
      | niños        | <niños>        |
      | habitaciones | <habitaciones> |
    And Filtrar hospedajes por <typeFilter>
    Then Imprimir por consola los datos de la reserva

    Examples: 
      | destino                       | fechaIn       | fechaOn      | adultos | niños | habitaciones | typeFilter |
      | Cartagena de Indias, Colombia | 26 abril 2023 | 3 mayo 2023  |       3 | 2/2/4 |            2 |          1 |
      | Barcelona, Cataluña, España	  | 31 mayo 2023  | 7 junio 2023 |       1 | 1/5   |            1 |          2 |
      
      
      #Destino : No repetir
      #Fecha In/Out :	(Abr 26 - May 3)
			#								(May 31 - Jun 7)
      #Pasajeros :			 3 Adultos, 2 Niños (2 y 4 años) 2 Habitaciones
      #								1 Adultos, 1 Niños (5 años) 1 Habitaciones
