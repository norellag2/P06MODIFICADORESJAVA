# Modificadores de acceso en Java
Los modificadores nos permiten establecer la visibilidad de los elementos del programa, es decir si se puede acceder a ellos o no para utilizarlos.

Encapsulación

## Modificador de acceso  default

- Lo establece Java por defecto y no tiene palabra reservada
Para las clases default, estas estarán disponibles solamente en su paquete.
Para los atributos y métodos si tuvieran default pasaría lo mismo pero no es un comportamiento que queramos salvo algunos casos concretos.

## Modificador de acceso public 

- Visible o accesible desde cualquier parte del programa
- En el caso de las clases, casi siempre las declararemos públicas, con dos observaciones:
      - Si la usamos en un paquete diferente hay que importarla.
      - Si en un archivo tenemos varias clases solo una puede ser pública.

## Modificador de acceso private
- Las clases ni las interfaces pueden ser privadas
¿para qué sirve el modificador? Para proteger el uso de miembros fuera de  la clase.
Normalmente los atributos o propiedades serán privados y los métodos serán públicos (para conseguir la encapsulación).

## Modificador de acceso protected
- Relacionado con herencia de clases 

# RESUMEN DE USO HABITUAL

- Las clases o interfaces serán casi siempre públicas
- Los atributos serán casi siempre privados 
- Los métodos serán casi siempre públicos
# RESUMEN DEL ORDEN EN LA LA SINTAXIS
-   modificadores-acceso  modificadores  tipoDato
Ejemplo:

public static void ....