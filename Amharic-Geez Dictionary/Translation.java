import java.util.HashMap;
import java.util.Map;

public class Translation {
    private Map<String, String> englishToSpanish;
    private Map<String, String> spanishToEnglish;
    private Map<String, String> englishDescriptions;
    private Map<String, String> spanishDescriptions;

    public Translation() {
        englishToSpanish = new HashMap<>();
        spanishToEnglish = new HashMap<>();
        englishDescriptions = new HashMap<>();
        spanishDescriptions = new HashMap<>();

        // Initialize the dictionary
        initializeDictionary();
    }

    private void initializeDictionary() {

        addTranslation("apple", "manzana", "A fruit that is usually red, green, or yellow", "Una fruta que generalmente es roja, verde o amarilla");
        addTranslation("ant", "hormiga", "A small insect that lives in colonies", "Un pequeño insecto que vive en colonias");
        addTranslation("arm", "brazo", "A limb of the human body extending from the shoulder to the hand", "Un miembro del cuerpo humano que se extiende desde el hombro hasta la mano");
        addTranslation("ask", "preguntar", "To inquire or seek information", "Indagar o buscar información");
        addTranslation("air", "aire", "The invisible gaseous substance surrounding the earth", "La sustancia gaseosa invisible que rodea la tierra");
        addTranslation("angry", "enojado", "Feeling or showing strong annoyance", "Sentir o mostrar un fuerte enojo");
        addTranslation("animal", "animal", "A living organism that feeds on organic matter", "Un organismo vivo que se alimenta de materia orgánica");
        addTranslation("artist", "artista", "A person who creates art", "Una persona que crea arte");
        addTranslation("actor", "actor", "A person who performs in plays, movies, or television shows", "Una persona que actúa en obras de teatro, películas o programas de televisión");
        addTranslation("avenue", "avenida", "A broad road in a town or city", "Una amplia calle en una ciudad");
        addTranslation("banana", "plátano", "A long, curved fruit with a yellow skin", "Una fruta larga y curvada con piel amarilla");
        addTranslation("ball", "pelota", "A round object used in games and sports", "Un objeto redondo usado en juegos y deportes");
        addTranslation("bed", "cama", "A piece of furniture for sleep or rest", "Un mueble para dormir o descansar");
        addTranslation("book", "libro", "A set of written or printed pages, usually bound with a protective cover", "Un conjunto de páginas escritas o impresas, generalmente encuadernadas con una cubierta protectora");
        addTranslation("bird", "pájaro", "A warm-blooded egg-laying vertebrate animal distinguished by feathers", "Un animal vertebrado de sangre caliente que pone huevos, distinguido por sus plumas");
        addTranslation("bread", "pan", "A staple food prepared from a dough of flour and water", "Un alimento básico preparado a partir de una masa de harina y agua");
        addTranslation("blue", "azul", "The color of the clear sky", "El color del cielo despejado");
        addTranslation("brother", "hermano", "A male sibling", "Un hermano varón");
        addTranslation("butter", "mantequilla", "A pale yellow edible fatty substance made by churning cream", "Una sustancia comestible grasa pálida y amarilla hecha al batir la crema");
        addTranslation("baby", "bebé", "A very young child", "Un niño muy pequeño");
        addTranslation("cat", "gato", "A small domesticated carnivorous mammal", "Un pequeño mamífero carnívoro domesticado");
        addTranslation("car", "coche", "A road vehicle, typically with four wheels", "Un vehículo de carretera, típicamente con cuatro ruedas");
        addTranslation("cup", "taza", "A small bowl-shaped container for drinking from", "Un pequeño recipiente en forma de tazón para beber");
        addTranslation("cake", "pastel", "A sweet baked dessert", "Un postre dulce horneado");
        addTranslation("city", "ciudad", "A large town", "Una gran ciudad");
        addTranslation("cold", "frío", "Of or at a low or relatively low temperature", "De o a una temperatura baja o relativamente baja");
        addTranslation("cow", "vaca", "A fully grown female animal of a domesticated breed of ox", "Un animal hembra completamente crecido de una raza doméstica de buey");
        addTranslation("chair", "silla", "A separate seat for one person, typically with a back and four legs", "Un asiento separado para una persona, típicamente con respaldo y cuatro patas");
        addTranslation("child", "niño", "A young human being below the age of puberty", "Un ser humano joven por debajo de la edad de la pubertad");
        addTranslation("clock", "reloj", "A mechanical or electrical device for measuring time", "Un dispositivo mecánico o eléctrico para medir el tiempo");
        // D
        addTranslation("dog", "perro", "A domesticated carnivorous mammal", "Un mamífero carnívoro domesticado");
        addTranslation("door", "puerta", "A hinged, sliding, or revolving barrier", "Una barrera con bisagras, deslizante o giratoria");
        addTranslation("dance", "bailar", "To move rhythmically to music", "Moverse rítmicamente al ritmo de la música");
        addTranslation("day", "día", "A period of twenty-four hours", "Un período de veinticuatro horas");
        addTranslation("drink", "beber", "To take liquid into the mouth and swallow", "Tomar líquido en la boca y tragarlo");
        addTranslation("drive", "conducir", "To operate and control the direction of a vehicle", "Operar y controlar la dirección de un vehículo");
        addTranslation("desk", "escritorio", "A piece of furniture with a flat top for writing or working on", "Un mueble con una superficie plana para escribir o trabajar");
        addTranslation("doctor", "doctor", "A qualified practitioner of medicine", "Un profesional calificado de la medicina");
        addTranslation("dinner", "cena", "The main meal of the day", "La comida principal del día");
        addTranslation("duck", "pato", "A waterbird with a broad blunt bill", "Un ave acuática con un pico ancho y roma");
        addTranslation("egg", "huevo", "An oval or round object laid by a female bird, reptile, fish, or invertebrate", "Un objeto ovalado o redondo puesto por una ave hembra, reptil, pez o invertebrado");
        addTranslation("ear", "oreja", "The organ of hearing and balance in humans and other vertebrates", "El órgano de la audición y el equilibrio en los humanos y otros vertebrados");
        addTranslation("eat", "comer", "To put food into the mouth, chew, and swallow it", "Poner comida en la boca, masticarla y tragarla");
        addTranslation("elephant", "elefante", "A large mammal with a trunk", "Un mamífero grande con una trompa");
        addTranslation("eye", "ojo", "The organ of sight", "El órgano de la vista");
        addTranslation("earth", "tierra", "The planet on which we live", "El planeta en el que vivimos");
        addTranslation("engine", "motor", "A machine with moving parts that converts power into motion", "Una máquina con partes móviles que convierte la energía en movimiento");
        addTranslation("energy", "energía", "The strength and vitality required for sustained physical or mental activity", "La fuerza y vitalidad necesaria para una actividad física o mental sostenida");
        addTranslation("fish", "pez", "A limbless cold-blooded vertebrate animal with gills", "Un animal vertebrado sin extremidades, de sangre fría, con branquias");
        addTranslation("flower", "flor", "The seed-bearing part of a plant", "La parte de una planta que produce semillas");
        addTranslation("fire", "fuego", "Combustion or burning", "La combustión o arder de algo");
        addTranslation("friend", "amigo", "A person with whom one has a bond of mutual affection", "Una persona con la que se tiene un vínculo de afecto mutuo");
        addTranslation("family", "familia", "A group of one or more parents and their children", "Un grupo de uno o más padres y sus hijos");
        addTranslation("fruit", "fruta", "The sweet and fleshy product of a tree or other plant that contains seed", "El dulce y carnoso producto de un árbol u otra planta que contiene semillas");
        addTranslation("foot", "pie", "The lower extremity of the leg below the ankle", "La extremidad inferior de la pierna debajo del tobillo");
        addTranslation("forest", "bosque", "A large area covered chiefly with trees and undergrowth", "Una gran área cubierta principalmente con árboles y vegetación");
        addTranslation("frog", "rana", "A tailless amphibian with a short squat body", "Un anfibio sin cola con un cuerpo corto y rechoncho");
        addTranslation("food", "comida", "Any nutritious substance that people or animals eat or drink", "Cualquier sustancia nutritiva que las personas o los animales comen o beben");
        addTranslation("hat", "sombrero", "A shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform", "Un accesorio en forma de cubierta para la cabeza usado para abrigarse, como un artículo de moda o como parte de un uniforme");
        addTranslation("house", "casa", "A building for human habitation, especially one that is lived in by a family or small group of people", "Un edificio para la habitación humana, especialmente uno en el que vive una familia o un pequeño grupo de personas");
        addTranslation("hand", "mano", "The end part of a person's arm beyond the wrist, including the palm, fingers, and thumb", "La parte final del brazo de una persona más allá de la muñeca, incluida la palma, los dedos y el pulgar");
        addTranslation("heart", "corazón", "A hollow muscular organ that pumps the blood through the circulatory system by rhythmic contraction and dilation", "Un órgano muscular hueco que bombea la sangre a través del sistema circulatorio por contracción y dilatación rítmica");
        addTranslation("horse", "caballo", "A large plant-eating domesticated mammal with solid hoofs and a flowing mane and tail, used for riding, racing, and to carry and pull loads", "Un mamífero doméstico grande que come plantas, con cascos sólidos, crin y cola largas, usado para montar, correr, y cargar y jalar cargas");
        addTranslation("happy", "feliz", "Feeling or showing pleasure or contentment", "Sentir o mostrar placer o contentamiento");
        addTranslation("hot", "caliente", "Having a high degree of heat or a high temperature", "Tener un alto grado de calor o una alta temperatura");
        addTranslation("help", "ayuda", "The action of helping someone to do something", "La acción de ayudar a alguien a hacer algo");

        // I
        addTranslation("ice", "hielo", "Frozen water, a brittle, transparent crystalline solid", "Agua congelada, un sólido cristalino frágil y transparente");
        addTranslation("island", "isla", "A piece of land surrounded by water", "Un pedazo de tierra rodeado de agua");
        addTranslation("idea", "idea", "A thought or suggestion as to a possible course of action", "Un pensamiento o sugerencia sobre un posible curso de acción");
        addTranslation("insect", "insecto", "A small arthropod animal that has six legs and generally one or two pairs of wings", "Un pequeño animal artrópodo que tiene seis patas y generalmente uno o dos pares de alas");
        addTranslation("ink", "tinta", "A colored fluid used for writing, drawing, or printing", "Un fluido de color usado para escribir, dibujar o imprimir");
        addTranslation("iron", "hierro", "A strong, hard magnetic silvery-gray metal", "Un metal fuerte, duro, magnético y plateado-grisáceo");
        addTranslation("important", "importante", "Of great significance or value", "De gran importancia o valor");
        addTranslation("interest", "interés", "The state of wanting to know or learn about something", "El estado de querer saber o aprender sobre algo");
        addTranslation("ill", "enfermo", "Not in good health; sick", "No estar en buena salud; enfermo");
        addTranslation("imagine", "imaginar", "To form a mental image or concept of something", "Formar una imagen mental o concepto de algo");

        // J
        addTranslation("jacket", "chaqueta", "A short coat", "Un abrigo corto");
        addTranslation("jump", "saltar", "To push oneself off a surface and into the air by using the muscles in one's legs and feet", "Impulsarse fuera de una superficie y hacia el aire usando los músculos de las piernas y los pies");
        addTranslation("jungle", "selva", "An area of land overgrown with dense forest and tangled vegetation, typically in the tropics", "Un área de tierra cubierta de densos bosques y vegetación enredada, típicamente en los trópicos");
        addTranslation("job", "trabajo", "A paid position of regular employment", "Un puesto remunerado de empleo regular");
        addTranslation("joke", "broma", "A thing that someone says to cause amusement or laughter", "Una cosa que alguien dice para causar diversión o risa");
        addTranslation("join", "unirse", "To bring or come together in a union or group", "Unir o juntarse en una unión o grupo");
        addTranslation("joy", "alegría", "A feeling of great pleasure and happiness", "Un sentimiento de gran placer y felicidad");
        addTranslation("juice", "jugo", "The liquid obtained from or present in fruit or vegetables", "El líquido obtenido de o presente en frutas o verduras");
        addTranslation("jewel", "joya", "A precious stone", "Una piedra preciosa");
        addTranslation("jam", "mermelada", "A sweet spread or preserve made from fruit and sugar boiled to a thick consistency", "Una dulce crema o conserva hecha de frutas y azúcar hervidos hasta obtener una consistencia espesa");
        // K
        addTranslation("kangaroo", "canguro", "A large plant-eating marsupial with a long powerful tail and strongly developed hindlimbs that enable it to travel by leaping", "Un marsupial grande que come plantas con una larga cola poderosa y extremidades traseras fuertemente desarrolladas que le permiten viajar saltando");
        addTranslation("king", "rey", "The male ruler of an independent state, especially one who inherits the position by right of birth", "El gobernante masculino de un estado independiente, especialmente aquel que hereda el cargo por derecho de nacimiento");
        addTranslation("kiss", "beso", "A touch or caress with the lips as a sign of love, sexual desire, or greeting", "Un toque o caricia con los labios como señal de amor, deseo sexual o saludo");
        addTranslation("key", "llave", "A small piece of shaped metal with incisions cut to fit the wards of a particular lock, which is inserted into a lock and turned to open or close it", "Un pequeño trozo de metal con forma y con incisiones cortadas para encajar en las contraseñas de una cerradura en particular, que se inserta en una cerradura y se gira para abrir o cerrarla");
        addTranslation("kind", "tipo", "A group of people or things having similar characteristics", "Un grupo de personas o cosas que tienen características similares");
        addTranslation("kitchen", "cocina", "A room or area where food is prepared and cooked", "Una habitación o área donde se prepara y cocina la comida");
        addTranslation("kid", "niño", "A child or young person", "Un niño o persona joven");
        addTranslation("knee", "rodilla", "The joint between the thigh and the lower leg", "La articulación entre el muslo y la pierna");

        // L
        addTranslation("lion", "león", "A large tawny-colored cat that lives in prides, found in Africa and northwestern India", "Un gran felino de color leonado que vive en manadas, se encuentra en África y el noroeste de la India");
        addTranslation("light", "luz", "The natural agent that stimulates sight and makes things visible", "El agente natural que estimula la vista y hace visibles las cosas");
        addTranslation("love", "amor", "An intense feeling of deep affection", "Un sentimiento intenso de profundo afecto");
        addTranslation("leaf", "hoja", "A flattened structure of a higher plant, typically green and blade-like, that is attached to a stem directly or via a stalk", "Una estructura aplanada de una planta superior, típicamente verde y parecida a una hoja, que está unida a un tallo directamente o a través de un pecíolo");
        addTranslation("lake", "lago", "A large body of water surrounded by land", "Un gran cuerpo de agua rodeado de tierra");
        addTranslation("letter", "carta", "A written, typed, or printed communication, especially one sent in an envelope by mail or messenger", "Una comunicación escrita, mecanografiada o impresa, especialmente una enviada en un sobre por correo o mensajero");
        addTranslation("loud", "ruidoso", "Producing or capable of producing much noise", "Producir o ser capaz de producir mucho ruido");
        addTranslation("laugh", "reír", "Make the spontaneous sounds and movements of the face and body that are the instinctive expressions of lively amusement and sometimes also of derision", "Hacer los sonidos y movimientos espontáneos de la cara y el cuerpo que son las expresiones instintivas de la diversión animada y a veces también del desprecio");
        addTranslation("long", "largo", "Measuring a great distance from end to end", "Medir una gran distancia de un extremo a otro");
        addTranslation("little", "pequeño", "Small in size, amount, or degree", "Pequeño en tamaño, cantidad o grado");
        // M
addTranslation("moon", "luna", "The natural satellite of the earth, visible (chiefly at night) by reflected light from the sun", "El satélite natural de la tierra, visible (principalmente por la noche) por la luz reflejada del sol");
addTranslation("mountain", "montaña", "A large natural elevation of the earth's surface rising abruptly from the surrounding level; a large steep hill", "Una gran elevación natural de la superficie terrestre que se eleva abruptamente desde el nivel circundante; una colina grande y empinada");
addTranslation("music", "música", "Vocal or instrumental sounds combined in such a way as to produce beauty of form, harmony, and expression of emotion", "Sonidos vocales o instrumentales combinados de tal manera que producen belleza de forma, armonía y expresión de emoción");
addTranslation("man", "hombre", "An adult human male", "Un hombre humano adulto");
addTranslation("map", "mapa", "A diagrammatic representation of an area of land or sea showing physical features, cities, roads, etc.", "Una representación diagramática de un área de tierra o mar que muestra características físicas, ciudades, carreteras, etc.");
addTranslation("mother", "madre", "A woman in relation to her child or children", "Una mujer en relación con su hijo o hijos");
addTranslation("money", "dinero", "A current medium of exchange in the form of coins and banknotes; coins and banknotes collectively", "Un medio de intercambio actual en forma de monedas y billetes; monedas y billetes en conjunto");
addTranslation("monkey", "mono", "A small to medium-sized primate that typically has a long tail, most kinds of which live in trees in tropical countries", "Un primate pequeño a mediano que típicamente tiene una cola larga, la mayoría de los cuales viven en árboles en países tropicales");
addTranslation("milk", "leche", "An opaque white fluid rich in fat and protein, secreted by female mammals for the nourishment of their young", "Un líquido blanco opaco rico en grasa y proteínas, secretado por mamíferos hembra para la alimentación de sus crías");
addTranslation("morning", "mañana", "The period of time between midnight and noon, especially from sunrise to noon", "El período de tiempo entre la medianoche y el mediodía, especialmente desde el amanecer hasta el mediodía");

// N
addTranslation("night", "noche", "The period of darkness in each twenty-four hours", "El período de oscuridad en cada veinticuatro horas");
addTranslation("nose", "nariz", "The part of the human face or the forward part of the head of other vertebrates that contains the nostrils and organs of smell and forms the beginning of the respiratory tract", "La parte de la cara humana o la parte anterior de la cabeza de otros vertebrados que contiene las fosas nasales y los órganos del olfato y forma el comienzo del tracto respiratorio");
addTranslation("name", "nombre", "A word or set of words by which a person or thing is known, addressed, or referred to", "Una palabra o conjunto de palabras por las cuales una persona o cosa es conocida, dirigida o referida");
addTranslation("new", "nuevo", "Not existing before; made, introduced, or discovered recently or now for the first time", "No existente antes; hecho, introducido o descubierto recientemente o ahora por primera vez");
addTranslation("nine", "nueve", "Equivalent to the product of three and three; one more than eight, or one less than ten; 9", "Equivalente al producto de tres y tres; uno más que ocho, o uno menos que diez; 9");
addTranslation("noon", "mediodía", "Twelve o'clock in the day; midday", "Doce en punto del día; mediodía");
addTranslation("nice", "agradable", "Pleasant; agreeable; satisfactory", "Agradable; agradable; satisfactorio");
addTranslation("north", "norte", "The direction in which a compass needle normally points, toward the horizon on the left-hand side of a person facing east", "La dirección hacia la cual normalmente apunta la aguja de una brújula, hacia el horizonte en el lado izquierdo de una persona que mira hacia el este");
addTranslation("nail", "uña", "A horny covering on the upper surface of the tip of the finger and toe in humans and other primates", "Una cubierta córnea en la superficie superior de la punta del");
// P
addTranslation("pen", "pluma", "An instrument for writing or drawing with ink", "Un instrumento para escribir o dibujar con tinta");
addTranslation("phone", "teléfono", "A system that converts acoustic vibrations to electrical signals in order to transmit sound, typically voices, over a distance using wire or radio", "Un sistema que convierte las vibraciones acústicas en señales eléctricas para transmitir sonido, típicamente voces, a través de una distancia utilizando cable o radio");
addTranslation("pig", "cerdo", "An omnivorous domesticated hoofed mammal with sparse bristly hair and a flat snout for rooting in the soil", "Un mamífero omnívoro domesticado con pezuñas, con cabello esparcido y cerdas y un hocico plano para enraizar en el suelo");
addTranslation("pencil", "lápiz", "An instrument for writing or drawing, consisting of a thin stick of graphite or a similar substance enclosed in a long thin piece of wood or fixed in a metal or plastic case", "Un instrumento para escribir o dibujar, que consiste en una delgada barra de grafito o una sustancia similar encerrada en una larga pieza delgada de madera o fijada en un estuche de metal o plástico");
addTranslation("picture", "imagen", "A painting, drawing, photograph, or engraving", "Una pintura, dibujo, fotografía o grabado");
addTranslation("potato", "patata", "A starchy plant tuber that is one of the most important food crops, cooked and eaten as a vegetable", "Un tubérculo de planta almidonada que es uno de los cultivos alimenticios más importantes, cocido y consumido como verdura");
addTranslation("pink", "rosa", "Of a color intermediate between red and white, as of coral or salmon", "De un color intermedio entre el rojo y el blanco, como el del coral o el salmón");
addTranslation("purple", "morado", "Of a color intermediate between red and blue", "De un color intermedio entre el rojo y el azul");
addTranslation("parent", "padre", "A person's father or mother", "El padre o la madre de una persona");
addTranslation("paper", "papel", "Material manufactured in thin sheets from the pulp of wood or other fibrous substances", "Material fabricado en hojas delgadas a partir de la pulpa de madera u otras sustancias fibrosas");

// Q
addTranslation("queen", "reina", "The female ruler of an independent state, especially one who inherits the position by right of birth or marriage to the king", "La gobernante femenina de un estado independiente, especialmente aquella que hereda el cargo por derecho de nacimiento o matrimonio con el rey");
addTranslation("question", "pregunta", "A sentence worded or expressed so as to elicit information", "Una oración formulada o expresada para obtener información");
addTranslation("quick", "rápido", "Moving fast or doing something in a short time", "Movimiento rápido o hacer algo en poco tiempo");
addTranslation("quiet", "silencioso", "Making little or no noise", "Hacer poco o ningún ruido");
addTranslation("quack", "cuac", "The characteristic harsh sound made by a duck", "El característico sonido áspero hecho por un pato");
addTranslation("quilt", "edredón", "A bedspread or covering made of two layers of fabric filled with padding held in place by lines of stitching", "Una colcha o cobertura hecha de dos capas de tela rellenas de acolchado y mantenidas en su lugar por líneas de costura");
addTranslation("quality", "calidad", "The standard of something as measured against other things of a similar kind; the degree of excellence of something", "El estándar de algo medido en comparación con otras cosas de una clase similar; el grado de excelencia de algo");
// R
addTranslation("rabbit", "conejo", "A burrowing, gregarious, plant-eating mammal with long ears, long hind legs, and a short tail", "Un mamífero cavador, gregario y herbívoro con orejas largas, patas traseras largas y una cola corta");
addTranslation("river", "río", "A large natural stream of water flowing in a channel to the sea, a lake, or another such stream", "Un gran curso de agua natural que fluye en un canal hacia el mar, un lago u otro curso de agua similar");
addTranslation("red", "rojo", "Of a color at the end of the spectrum next to orange and opposite violet, as of blood, fire, or rubies", "De un color al final del espectro junto al naranja y opuesto al violeta, como la sangre, el fuego o los rubíes");
addTranslation("run", "correr", "Move at a speed faster than a walk, never having both or all the feet on the ground at the same time", "Moverse a una velocidad más rápida que al caminar, nunca teniendo ambos o todos los pies en el suelo al mismo tiempo");
addTranslation("read", "leer", "Look at and comprehend the meaning of (written or printed matter) by mentally interpreting the characters or symbols of which it is composed", "Observar y comprender el significado de (material escrito o impreso) interpretando mentalmente los caracteres o símbolos de los que está compuesto");
addTranslation("rain", "lluvia", "Moisture condensed from the atmosphere that falls visibly in separate drops", "Humedad condensada de la atmósfera que cae visiblemente en gotas separadas");
addTranslation("room", "habitación", "A part or division of a building enclosed by walls, floor, and ceiling", "Una parte o división de un edificio cerrada por paredes, suelo y techo");
addTranslation("road", "carretera", "A wide way leading from one place to another, especially one with a specially prepared surface that vehicles can use", "Un amplio camino que conduce de un lugar a otro, especialmente uno con una superficie especialmente preparada que los vehículos pueden usar");
addTranslation("rose", "rosa", "A prickly bush or shrub that typically bears red, pink, yellow, or white fragrant flowers", "Un arbusto o arbusto espinoso que típicamente produce flores fragantes rojas, rosadas, amarillas o blancas");
addTranslation("rest", "descanso", "Cease work or movement in order to relax, refresh oneself, or recover strength", "Dejar de trabajar o moverse para relajarse, refrescarse o recuperar fuerzas");

// S
addTranslation("sun", "sol", "The star around which the earth orbits", "La estrella alrededor de la cual orbita la Tierra");
addTranslation("school", "escuela", "An institution for educating children", "Una institución para educar a los niños");
addTranslation("sky", "cielo", "The region of the atmosphere and outer space seen from the earth", "La región de la atmósfera y el espacio exterior vista desde la Tierra");
addTranslation("see", "ver", "Perceive with the eyes; discern visually", "Percebir con los ojos; discernir visualmente");
addTranslation("sing", "cantar", "Make musical sounds with the voice, especially words with a set tune", "Producir sonidos musicales con la voz, especialmente palabras con una melodía establecida");
addTranslation("sister", "hermana", "A woman or girl in relation to other daughters and sons of her parents", "Una mujer o niña en relación con otras hijas e hijos de sus padres");
addTranslation("street", "calle", "A public road in a city or town, typically with houses and buildings on one or both sides", "Una calle pública en una ciudad o pueblo, típicamente con casas y edificios a uno o ambos lados");
addTranslation("sleep", "dormir", "A condition of body and mind that typically recurs for several hours every night, in which the nervous system is relatively inactive, the eyes closed, the postural muscles relaxed, and consciousness practically suspended", "Una condición del cuerpo y la mente que típicamente se repite durante varias horas todas las noches, en la que el sistema nervioso está relativamente inactivo, los ojos cerrados, los músculos posturales relajados y la conciencia prácticamente suspendida");
addTranslation("snow", "nieve", "Atmospheric water vapor frozen into ice crystals and falling in light white flakes or lying on the ground as a white layer", "Vapor de agua atmosférico congelado en cristales de hielo y cayendo en copos blancos ligeros o formando una capa blanca en el suelo");
addTranslation("star", "estrella", "A fixed luminous point in the night sky that is a large, remote incandescent body like the sun", "Un punto luminoso fijo en el cielo nocturno que es un cuerpo incandescente grande y remoto como el sol");
// T
addTranslation("tree", "árbol", "A woody perennial plant, typically having a single stem or trunk growing to a considerable height and bearing lateral branches at some distance from the ground", "Una planta perenne leñosa, típicamente con un solo tallo o tronco que crece a una altura considerable y lleva ramas laterales a cierta distancia del suelo");
addTranslation("table", "mesa", "A piece of furniture with a flat top and one or more legs, providing a level surface on which objects may be placed", "Un mueble con una parte superior plana y una o más patas, que proporciona una superficie nivelada sobre la cual se pueden colocar objetos");
addTranslation("teach", "enseñar", "Impart knowledge to or instruct someone as to how to do something", "Impartir conocimientos o instruir a alguien sobre cómo hacer algo");
addTranslation("tiger", "tigre", "A very large solitary cat with a yellow-brown coat striped with black", "Un felino muy grande y solitario con un pelaje amarillo-marrón rayado con negro");
addTranslation("tooth", "diente", "Each of a set of hard, bony enamel-coated structures in the jaws of most vertebrates, used for biting and chewing", "Cada una de una serie de estructuras duras, óseas y recubiertas de esmalte en las mandíbulas de la mayoría de los vertebrados, usadas para morder y masticar");
addTranslation("town", "pueblo", "An urban area that has a name, defined boundaries, and local government, and that is generally larger than a village and smaller than a city", "Un área urbana que tiene un nombre, límites definidos y gobierno local, y que generalmente es más grande que un pueblo y más pequeño que una ciudad");
addTranslation("train", "tren", "A series of railroad cars moved as a unit by a locomotive or by integral motors", "Una serie de vagones de ferrocarril movidos como una unidad por una locomotora o por motores integrales");
addTranslation("two", "dos", "Equivalent to the sum of one and one; one less than three; 2", "Equivalente a la suma de uno y uno; uno menos que tres; 2");
addTranslation("tail", "cola", "The hindmost part of an animal, especially when prolonged beyond the rest of the body", "La parte posterior de un animal, especialmente cuando se prolonga más allá del resto del cuerpo");

// U
addTranslation("umbrella", "paraguas", "A device consisting of a circular canopy of cloth on a folding metal frame supported by a central rod, used as protection against rain or sometimes sun", "Un dispositivo que consiste en un dosel circular de tela en un marco de metal plegable soportado por una varilla central, utilizado como protección contra la lluvia o, a veces, el sol");
addTranslation("uncle", "tío", "The brother of one's father or mother or the husband of one's aunt", "El hermano del padre o la madre de uno o el esposo de la tía de uno");
addTranslation("understand", "entender", "Perceive the intended meaning of (words, a language, or speaker)", "Percebir el significado previsto de (palabras, un idioma o un hablante)");
addTranslation("use", "usar", "Take, hold, or deploy (something) as a means of accomplishing or achieving something; employ", "Tomar, sostener o desplegar (algo) como un medio para lograr o alcanzar algo; emplear");

// V
addTranslation("vegetable", "vegetal", "A plant or part of a plant used as food, typically as accompaniment to meat or fish, such as a cabbage, potato, carrot, or bean", "Una planta o parte de una planta utilizada como alimento, típicamente como acompañamiento de carne o pescado, como la col, la papa, la zanahoria o la judía");
addTranslation("village", "pueblo", "A group of houses and associated buildings, larger than a hamlet and smaller than a town, situated in a rural area", "Un grupo de casas y edificios asociados, más grande que una aldea y más pequeño que una ciudad, situado en una zona rural");
addTranslation("vase", "florero", "A decorative container, typically made of glass or china, used as an ornament or for displaying cut flowers", "Un recipiente decorativo, típicamente hecho de vidrio o porcelana, utilizado como adorno o para exhibir flores cortadas");
addTranslation("valley", "valle", "A low area of land between hills or mountains, typically with a river or stream flowing through it", "Un área baja de tierra entre colinas o montañas, típicamente con un río o arroyo que fluye a través de ella");
addTranslation("voice", "voz", "The sound produced in a person's larynx and uttered through the mouth, as speech or song", "El sonido producido en la laringe de una persona y expresado a través de la boca, como el habla o el canto");
addTranslation("view", "vista", "The ability to see something or to be seen from a particular place", "La capacidad de ver algo o ser visto desde un lugar particular");
addTranslation("visit", "visitar", "Go to see and spend time with (someone) socially", "Ir a ver y pasar tiempo con (alguien) socialmente");

// W
addTranslation("water", "agua", "A colorless, transparent, odorless liquid that forms the seas, lakes, rivers, and rain and is the basis of the fluids of living organisms", "Un líquido incoloro, transparente, inodoro que forma los mares, lagos, ríos y lluvias y es la base de los fluidos de los organismos vivos");
addTranslation("wind", "viento", "The perceptible natural movement of the air, especially in the form of a current of air blowing from a particular direction", "El movimiento natural perceptible del aire, especialmente en forma de corriente de aire que sopla desde una dirección particular");
addTranslation("walk", "caminar", "Move at a regular and fairly slow pace by lifting and setting down each foot in turn, never having both feet off the ground at once", "Moverse a un ritmo regular y bastante lento levantando y colocando cada pie por turno, nunca teniendo ambos pies fuera del suelo al mismo tiempo");
addTranslation("wait", "esperar", "Stay where one is or delay action until a particular time or until something else happens", "Permanecer donde uno está o retrasar la acción hasta un momento particular o hasta que suceda algo");
 // Y
addTranslation("yellow", "amarillo", "Of the color between green and orange in the spectrum, a primary subtractive color complementary to blue; colored like ripe lemons or egg yolks", "Del color entre verde y naranja en el espectro, un color primario sustractivo complementario del azul; de color como limones maduros o yemas de huevo");
addTranslation("year", "año", "The time taken by a planet to make one revolution around the sun", "El tiempo que tarda un planeta en dar una vuelta alrededor del sol");
addTranslation("young", "joven", "Having lived or existed for only a short time; not fully developed", "Haber vivido o existido solo por poco tiempo; no completamente desarrollado");
addTranslation("yes", "sí", "Used to give an affirmative response or agreement", "Utilizado para dar una respuesta afirmativa o acuerdo");
addTranslation("yell", "gritar", "A loud, sharp cry, especially of pain, surprise, or delight", "Un grito fuerte y agudo, especialmente de dolor, sorpresa o alegría");

// Z
addTranslation("zebra", "cebra", "An African wild horse with black-and-white stripes and an erect mane", "Un caballo salvaje africano con rayas en blanco y negro y una crin erguida");
addTranslation("zoo", "zoológico", "An establishment that maintains a collection of wild animals, typically in a park or gardens, for study, conservation, or display to the public", "Un establecimiento que mantiene una colección de animales salvajes, típicamente en un parque o jardines, para estudio, conservación o exhibición al público");
addTranslation("zero", "cero", "No quantity or number; naught; the absence of a magnitude or quantity of a given kind", "Sin cantidad o número; nada; la ausencia de una magnitud o cantidad de un tipo dado");

        
        // addTranslation("hello", "hola", "A greeting", "Un saludo");
        // addTranslation("world", "mundo", "The earth or the realm of human existence", "La tierra o el ámbito de la existencia humana");
        // addTranslation("goodbye", "adiós", "A farewell", "Una despedida");
        // addTranslation("please", "por favor", "A polite request", "Una solicitud educada");
        // addTranslation("thank you", "gracias", "An expression of gratitude", "Una expresión de gratitud");
        // addTranslation("yes", "sí", "An affirmative response", "Una respuesta afirmativa");
        // addTranslation("no", "no", "A negative response", "Una respuesta negativa");
        // addTranslation("cat", "gato", "A small domesticated carnivorous mammal", "Un pequeño mamífero carnívoro domesticado");
        // addTranslation("dog", "perro", "A domesticated carnivorous mammal", "Un mamífero carnívoro domesticado");
        // addTranslation("house", "casa", "A building for human habitation", "Un edificio para la habitación humana");
        // addTranslation("water", "agua", "A colorless, transparent, odorless liquid", "Un líquido incoloro, transparente e inodoro");
        // addTranslation("food", "comida", "Any nutritious substance that people or animals eat", "Cualquier sustancia nutritiva que comen las personas o los animales");
        // addTranslation("car", "coche", "A road vehicle, typically with four wheels", "Un vehículo de carretera, típicamente con cuatro ruedas");
        // addTranslation("book", "libro", "A set of written, printed, or blank pages", "Un conjunto de páginas escritas, impresas o en blanco");
        // addTranslation("music", "música", "Vocal or instrumental sounds combined in such a way as to produce beauty of form, harmony, and expression of emotion", "Sonidos vocales o instrumentales combinados de tal manera que producen belleza de forma, armonía y expresión de emoción");
    }

    private void addTranslation(String englishWord, String spanishWord, String englishDescription, String spanishDescription) {
        englishToSpanish.put(englishWord.toLowerCase(), spanishWord);
        spanishToEnglish.put(spanishWord.toLowerCase(), englishWord);
        englishDescriptions.put(englishWord.toLowerCase(), englishDescription);
        spanishDescriptions.put(spanishWord.toLowerCase(), spanishDescription);
    }

    // Get English to Spanish translation
    public String getEnglishToSpanish(String word) {
        return englishToSpanish.get(word.toLowerCase());
    }

    // Get Spanish to English translation
    public String getSpanishToEnglish(String word) {
        return spanishToEnglish.get(word.toLowerCase());
    }

    // Get English description
    public String getEnglishDescription(String word) {
        return englishDescriptions.get(word.toLowerCase());
    }

    // Get Spanish description
    public String getSpanishDescription(String word) {
        return spanishDescriptions.get(word.toLowerCase());
    }

    public String[] getEnglishWords() {
        return englishToSpanish.keySet().toArray(new String[0]);
    }

    public String[] getSpanishWords() {
        return spanishToEnglish.keySet().toArray(new String[0]);
    }
}
