#Feature: Gestión de Usuarios

 # Scenario Outline: Usuario realiza diferentes operaciones en la gestión de usuarios
  #  Given el usuario ingresa a la página de login
   # When el usuario ingresa datos de login correctos "<usuario>" "<contraseña>"
    #Then el usuario es redirigido a la página de gestión de usuarios
  #  When el usuario intenta agregar un nuevo usuario con datos "<nombreCompleto>" "<nombreUsuario>" "<contraseña>" "<repetirContraseña>"
   # Then el resultado de agregar usuario es "<resultadoEsperado>"

    #Examples:
     # | usuario | contraseña | nombreCompleto | nombreUsuario | contraseña | repetirContraseña | resultadoEsperado                        |
      #| admin   | 123        | Juan Perez     | jperez        | 123    | 123           | Usuario agregado exitosamente            |
    #  | admin   | 123        |                |               |            |                   | Campos vacíos muestran los placeholders |
   #   | admin   | 123        | Juan Perez     | jperez        | 123    | 124           | Contraseñas no coinciden                |
    #  | admin   | 123        | Usuario Erroneo| erruser       | wrongpass  | wrongpass         | Intento fallido de agregar usuario      |


#
#Feature: Gestión de Usuarios
#
#  Scenario Outline: Usuario realiza diferentes operaciones en la gestión de usuarios
#    Given el usuario ingresa a la página de gestión de usuarios
#    When el usuario intenta agregar un nuevo usuario con datos "<nombreCompleto>" "<nombreUsuario>" "<contraseña>" "<repetirContraseña>"
#    Then el resultado de agregar usuario es "<resultadoEsperado>"
#
#    Examples:
#      | nombreCompleto | nombreUsuario | contraseña | repetirContraseña | resultadoEsperado                        |
#      | Estefania      | estefania     | abc        | abc          | Usuario agregado exitosamente                 |
#      | Juan Perez     | jperez        | pass123    | pass124           | Contraseñas no coinciden                 |
#      |                | erruser       | wrongpass  | wrongpass         | Intento fallido de agregar usuario       |
#      | Juan    | jp        | pass123    | pass123           | Usuario ya registrado                               |
