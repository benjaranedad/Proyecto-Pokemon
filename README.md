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
1. Se propone implementar una clase denominada Pokemon, cuyas caracteristicas seran el nombre, el tipo, la energía y una serie de habilidades. Ademas cada pokemon podrá atacar y recibir daño hacia/desde el oponente.

2. Un pokemon puede ser de un tipo específico, representados por las clases Hoja, Agua y Fuego. A su vez, cada tipo tiene una debilidad contra otro tipo de pokemon, por lo tanto si recibe daño de un pokemon rival, del que presenta debilidad, se multiplicará el daño de acuerdo al factor de daño.

3. Cada pokemon tendra una serie de habilidades, que estan representadas por la clase Habilidad, donde se pueden apreciar sus caracteristicas, las que involucran el nombre, el daño y un factor de ataque dependiendo del tipo que sea el pokemon rival.

4. Finalmente, tendremos una clase encargada de fabricar los diferentes tipos de pokemon, representada por la clase Fabrica Pokemon, en esta contaremos con tres metodos, uno para crear un Squirtle, un Charmander y un Caterpy. 
