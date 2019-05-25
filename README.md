# CatalogoPJ Animado 

Integrantes: 

. Cristian David Rodríguez López - 20171020072 

. John Sebastián Martínez Zabala - 2017102005

## Catalogo de personajes

![catalogo](https://github.com/cristianrodriguez05/CatalogoPJAnimado/blob/master/diagramas/Diagrama%20general.png)

El catalogo de personajes es un programa hecho en JAVA. El objetivo del programa es el de permitir mostrar cuatro personajes lo cuales pertenecen a las clases: Arquero, guerrero, mago y ladrón; a cada clase se le asocia tres opciones de arma primaria, tres de arma secundaria, 3 tipos de armadura y una única montura.
para realizar el programa se implementó el patrón abstract Factory; témenos una clase FabricaAbstractaPJ (dentro del paquete fabricaAbstr) que es la fabrica la cual contiene métodos de las clases abstractas contenidas dentro del paquete de clasesPorducto. 
El paquete clases concretas contiene las clases todos los elementos que se van a mostrar o   animar. 
Dentro del paquete fabricaAbstr también están contenidas las clases que son las fábricas de los personajes las cuales contendrán los elementos que corresponden a cada una. 
Al ejecutar el programa se podran seleccionar una de las clases de los Pj y se visualizaran el grupo de elementos propios de ese pj. 

## Builder

![builder](https://github.com/cristianrodriguez05/CatalogoPJAnimado/blob/master/diagramas/builder.png)

El buider lo qUe hace en el programa es mostrar el personaje con el arma primaria, el arma secundaria, la armadura y la mostura seleccionada. 

el director de esos elementos seleccionados los envia al costructor de cada personaje y finalmente y en la interfaz gráfica se muestra el personaje con el equipo seleccionado.
Para la implementación del builder la fabrica abstrata deja de ser relevante porque el mismo constructor puede dar el personaje con el equipo que se desea y si se hbuera dejado la fabrica se realizaria un proceso que no es necesaio, por esta razón la fabrica abstacta se utilizará para la animaciones y el decorator. 

## Adapter

![adapter](https://github.com/cristianrodriguez05/CatalogoPJAnimado/blob/master/diagramas/adapter.png)

Para la implementación del adapter se uso la fabrica ogro del proyecto seleecionado. El personaje solo tiene un arma primaria y un arma secundaria, se crea el adaptador para que la clase orco sea compatible con el constructor y así al momento de usar la clase del personaje permita mostrar lo que viene con el personaje, aparte de las clases creadas para complementarlo.
