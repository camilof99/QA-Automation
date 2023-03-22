

@tag
Feature: Login into guru page
  Yo como automatizador voy a probar el logueo de usuarios en la pagina guru.

  @tag1
  Scenario: Iniciar sesion Guru99
    Given El usuario debe estar en la pagina "Guru99 Login"
    When Ingresa nombre de usuario "Guru99 username" y contraseña "Guru99 password"
    Then Y valida el mensaje de la pantalla home "Manger Id : mngr480443"
