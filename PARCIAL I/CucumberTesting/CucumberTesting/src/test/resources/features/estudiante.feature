#Feature: Gestión de estudiantes
#  Este feature cubre los escenarios para agregar, editar y eliminar estudiantes en la aplicación.
#
#  Background:
#    Given el usuario está en la página de gestión de estudiantes
#
#  @AgregarEstudiante
#  Scenario Outline: Agregar estudiante
#    When el usuario agrega un estudiante con nombres "<Nombres>" y apellidos "<Apellidos>"
#    Then el resultado de agregar estudiante es "<ResultadoEsperado>"
#
#    Examples:
#      | Nombres  | Apellidos | ResultadoEsperado          |
#      | Juan     | Pérez     | Estudiante registrado!     |
#      | Joss      | Pérez     | Faltan completar datos     |
#
#  @EditarEstudiante
#  Scenario Outline: Editar estudiante
#    When el usuario edita el estudiante con ID <IdEstudiante> con nombres "<Nombres>" y apellidos "<Apellidos>"
#    Then el resultado de editar estudiante es "<ResultadoEsperado>"
#
#    Examples:
#      | IdEstudiante | Nombres | Apellidos | ResultadoEsperado     |
#      | 1            | Carlos  | Gómez     | Se guardaron los cambios |
#      | 1            |         | Gómez     | No se pudo editar     |
#
#  @EliminarEstudiante
#  Scenario Outline: Eliminar estudiante
#    When el usuario elimina el estudiante con ID <IdEstudiante>
#    Then el resultado de eliminar estudiante es "<ResultadoEsperado>"
#
#    Examples:
#      | IdEstudiante | ResultadoEsperado |
#      | 1            | El estudiante fue eliminado.         |
#      | 2            | No se pudo eliminar |
