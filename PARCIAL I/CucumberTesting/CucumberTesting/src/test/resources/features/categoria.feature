#Feature: Gestión de categorias
#  Este feature cubre los escenarios para agregar, editar y eliminar categorias en la aplicación.
#
#  Background:
#    Given el usuario está en la página de gestión de categorías
#
#  @AgregarCategoría
#  Scenario Outline: Agregar categoría
#    When el usuario agrega una categoría con nombre "<Nombre>"
#    Then el resultado de agregar categoría es "<ResultadoEsperado>"
#
#    Examples:
#      | Nombre     | ResultadoEsperado          |
#      | Categoría de Prueba | Categoria registrada!      |
#      |                    | Debe ingresar el nombre.    |
#
#  @EditarCategoría
#  Scenario Outline: Editar categoría
#    When el usuario edita la categoría con ID <IdCategoria> con nombre "<Nombre>"
#    Then el resultado de editar categoría es "<ResultadoEsperado>"
#
#    Examples:
#      | IdCategoria | Nombre     | ResultadoEsperado          |
#      | 1           | Categoría Editada   | Se guardaron los cambios!    |
#      | 1           |                    | No se pudo editar           |
#
#  @EliminarCategoría
#  Scenario Outline: Eliminar categoría
#    When el usuario elimina la categoría con ID <IdCategoria>
#    Then el resultado de eliminar categoría es "<ResultadoEsperado>"
#
#    Examples:
#      | IdCategoria | ResultadoEsperado          |
#      | 1           | La categoria fue eliminado. |
#      | 2           | No se pudo eliminar         |
#
