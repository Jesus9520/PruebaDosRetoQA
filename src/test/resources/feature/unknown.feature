# new feature
# Tags: optional

Feature:  colores desconocidos
  como usuario veo la lista de colores
  necesito verificar los colores que se encuentran en la lista
  para poder seleccionar un color

  Scenario: lista de colores desconocidos
    Given necesito cuantos colores desconocidos hay en la lista
    When para realizar peticion a la solicitud de muestra
    Then nos mostrara el listado de colores desconocidos que se encuentran en la lista