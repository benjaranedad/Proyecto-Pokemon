# Proyecto-Pokemon
# El problema
Un pokémon (pkmn) tiene un nombre, energía, un tipo y hasta 4 habilidades.
Un tipo de pkmn puede ser de tipo hoja, agua o fuego. Donde agua es débil contra hoja, hoja es débil contra fuego y fuego es débil contra agua. Cada tipo de pkmn tiene un factor de daño que varia según el pkmn.
Las habilidades tienen un nombre y una cantidad de daño que varia en efectividad según el tipo del pkmn rival.
Un pkmn comienza con el 100% de energía y puede disminuir según el daño recibido, si el pokmn tiene debilidad sobre el oponente, el daño se multiplica por el factor de daño indicado según su tipo.
Un pkmn puede atacar, donde el ataque varia su daño según el tipo del pkmn enemigo y la habilidad utilizada, ejemplo si la habilidad es "Placaje", el daño para tipo hoja puede ser 5, para agua puede ser 5 y para fuego puede ser 10.
Para crear un pkmn existirá una fabrica de pokémon donde puede crear un caterpy, un squartle y un charmander.

# Propuesta Solución
![alt text](https://raw.githubusercontent.com/benjaranedad/Proyecto-Pokemon/master/diagrama_clase.jpg)
1.- Se propone implementar una clase denominada Pokemon, cuyos atributos seran el nombre, el tipo, la energía y una serie de habilidades. Ademas cada pokemon podrá atacar y recibir daño.
2.- Un pokemon puede ser de un tipo específico, existen 3 Hoja, Agua y Fuego. A su vez, cada tipo tiene una debilidad contra otro tipo de pokemon, por lo tanto si recibe daño de un pokemon rival, del que es debil, se multiplica el daño de acuerdo al factor de daño especificado en la clase Tipo.
3.- Cada pokemon tendra una serie de habilidades, que estan representadas por la clase Habilidad, donde lo que involucra es el nombre de la habilidad y el daño que provoca.
4.- tendremos una clase encargada de fabricar los diferentes tipos de pokemon, representada por la clase Fabrica Pokemon.
5.-como predefinido tendremos fabricados a 3 pokemones , Charmander , Caterpie y Squartle , que por medio de una herencia obtendran los atributos de la clase pokemon.
6.- contaremos con una clase batalla , que sera la encargada de instanciar a 2 pokemones para llevar a cabo un combate, ademas de mostrar el tiempo de combate y turnos de la batalla.
7.- adyacente a lo anterior incluiremos una clase resultado , para asi mostrar el nombre del ganador de la batalla, el duracion total del combate y energia restante del ganador.

# experiencias del dia 23/07
hoy se intento de programar la propuesta realizada el dia de ayer que fue representada con un diagrama de clases , tuvimos que comenzar a trabajar con GitHub para el desarrollo por versiones en conjunto.
se puso enfasis en que el programa fuera lo mas apegado al diagrama , cosa que no ocurrio , porque tuvimos muchos problemas con el repositorio , tenemos falta de experiencia de trabajo en el lenguaje de JAVA y falta de experiencia con GitHub para el trabajo colaborativo y falta de comunicacion y costumbre al trabajo en equipo.

