#Feature: Login

 # Scenario Outline: Usuario ingresa sus credenciales y es redirigido o muestra un error
  #  Given el usuario ingresa a la página de login
   # When el usuario ingresa datos "<usuario>" "<contraseña>"
    #Then el resultado del login es "<resultado>"

    #Examples:
      #| usuario | contraseña | resultado                    |
      #| admin   | 123        | redirigido                   |
      #| admin   | 456        | No se encontraron coincidencias |
      #|         |            | Campos vacíos                |
      #| admin   | admin  | Intento fallido de redirigir |
      #Con la linea de abajo se supera la prueba fallida
      # | admin   | 123        | redirigido                   |

