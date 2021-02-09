Feature: Inicio de Sesion en CRM de Telefonica

  Scenario Outline: Inicio de sesion en CRM
    Given que estoy en la pagina de inicio de CRM
    When ingreso mis credenciales en la plataforma del CRM 
      |usuario|clave|
      |<Usuario>|<Clave>|
    Then valido que el login ha sido completado

    Examples: 
      |Usuario|Clave|
      |102|Abc1234%|
  