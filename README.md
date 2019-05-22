# CatalogoPJ Animado 

Integrantes: 

. Cristian David Rodríguez López - 20171020072 

. John Sebastián Martínez Zabala - 2017102005

![catalogo](https://github.com/cristianrodriguez05/CatalogoPJAnimado/blob/master/diagramas/Diagrama%20general.png)



## Catalogo de personajes

El catalogo de personajes es un programa hecho en JAVA. El objetivo del programa es el de permitir mostrar cuatro personajes lo cuales pertenecen a las clases: Arquero, guerrero, mago y ladrón; a cada clase se le asocia tres opciones de arma primaria, tres de arma secundaria, 3 tipos de armadura y una única montura.
para realizar el programa se implementó el patrón abstract Factory; témenos una clase FabricaAbstractaPJ (dentro del paquete fabricaAbstr) que es la fabrica la cual contiene métodos de las clases abstractas contenidas dentro del paquete de clasesPorducto. 
El paquete clases concretas contiene las clases todos los elementos que se van a mostrar o   animar. 
Dentro del paquete fabricaAbstr también están contenidas las clases que son las fábricas de los personajes las cuales contendrán los elementos que corresponden a cada una. 

## Builder
Los patrones de diseño son la base para la búsqueda de soluciones a problemas comunes en el desarrollo de software y otros ámbitos referentes al diseño de interacción o interfaces.

    Un patrón de diseño es una solución a un problema de diseño.

Los patrones de diseño son un conjunto de prácticas de óptimo diseño que se utilizan para abordar problemas recurrentes en la programación orientada a objetos.

El concepto de patrones de diseño fue el resultado de un trabajo realizado por un grupo de 4 personas Erich Gamma, Richard Helm, Ralph Johnson y John Vlissides, (Gang of four) que se publicó en los 90s en un libro titulado "Design Patterns. Elements of Reusable Object-Oriented Software" en el que se esbozaban 23 patrones de diseño.

Un patrón de diseño puede considerarse como un documento que define una estructura de clases que aborda una situación particular. Para que una solución sea considerada un patrón debe poseer ciertas características. Una de ellas es que debe haber comprobado su efectividad resolviendo problemas similares en ocasiones anteriores. Otra es que debe ser reusable, lo que significa que es aplicable a diferentes problemas de diseño en distintas circunstancias.

Los patrones de diseño representa un nivel de abstracción un poco mas elevado de lo que hasta ahora el estudiante esta habituado a trabajar, pero una vez entendido su funcionamiento y utilidad, los diseños serán mucho más flexibles, modulares y reutilizables.
En esencia un patrón tiene los siguientes 4 elementos:

- **Nombre del patrón:** describe el problema de diseño, su solución y consecuencias en una o dos palabras.
- **El problema:** describe cuando aplicar el patrón, explica el problema y su contexto.
- **La solución:** describe los elementos del diseño, sus relaciones, responsabilidades y colaboraciones. No describe la implementación o un diseño particular específicamente ya que se adapta mas a una plantilla (template) que puede ser aplicada a varias situaciones.
- **Las consecuencias:** son los resultados de aplicar el patrón, los pros y contras de su aplicación. Las consecuencias de la aplicación de un patrón debe incluir el impacto en la flexibilidad, extensibilidad y/o portabilidad del sistema.

## Adapter
