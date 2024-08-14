#Feature: Editar Usuario
#
#  Scenario: Usuario edita información del usuario
#    Given el usuario accede a la página de gestión de usuarios
#    When el usuario intenta editar un usuario con datos "<nombreCompleto>" "<nombreUsuario>" "<contraseña>" "<repetirContraseña>"
#    Then el resultado de editar usuario es "<resultadoEsperado>"
#
#    Examples:
#      | nombreCompleto | nombreUsuario | contraseña | repetirContraseña | resultadoEsperado                   |
#      | Olivia    | olivia     | abc         | abc                | Usuario editado exitosamente        |
#      | Juan     | jp        | pass123     | pass123            | Las contraseñas no coinciden        |
#
