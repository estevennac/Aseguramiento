Feature: Gestión de libros
  Este feature cubre los escenarios para agregar, editar y eliminar libros en la aplicación.

  Background:
    Given el usuario está en la página de gestión de libros

  @AgregarLibro
  Scenario Outline: Agregar libro
    When el usuario agrega un libro con código "<Codigo>", título "<Titulo>", autor "<Autor>", categoría "<Categoria>" y fecha de publicación "<FechaPublicacion>"
    Then el resultado de agregar libro es "<ResultadoEsperado>"

    Examples:
      | Codigo  | Titulo       | Autor        | Categoria | FechaPublicacion | ResultadoEsperado       |
      | 123ABC  | El Gran Libro | Juan Pérez   | 1         | 2024-08-01       | Libro registrado!       |
      | 123XYZ  | Otro Libro    | Ana Gómez    | 2         | 2024-08-02       | Libro registrado!       |
      |         |              |              |           |                 | Faltan completar datos   |

  @EditarLibro
  Scenario Outline: Editar libro
    When el usuario edita el libro con ID <IdLibro> con código "<Codigo>", título "<Titulo>", autor "<Autor>", categoría "<Categoria>" y fecha de publicación "<FechaPublicacion>"
    Then el resultado de editar libro es "<ResultadoEsperado>"

    Examples:
      | IdLibro | Codigo  | Titulo       | Autor       | Categoria | FechaPublicacion | ResultadoEsperado      |
      | 1       | 123ABC  | Libro Editado | Juan Pérez  | 1         | 2024-08-10       | Se guardaron los cambios |
      | 2       | 456DEF  | Otro Editado  | Ana Gómez   | 2         | 2024-08-11       | Se guardaron los cambios |
      | 1       |         |              |             |           |                 | No se pudo editar      |

  @EliminarLibro
  Scenario Outline: Eliminar libro
    When el usuario elimina el libro con ID <IdLibro>
    Then el resultado de eliminar libro es "<ResultadoEsperado>"

    Examples:
      | IdLibro | ResultadoEsperado          |
      | 1       | El libro fue eliminado.    |
      | 2       | No se pudo eliminar         |
