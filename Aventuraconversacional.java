package aventuraconversacional;
import java.util.Scanner;
public class Aventuraconversacional {

    public static void main(String[] args) {
        int trampa,lugar,puente,rio,agua,walki,walki2,dormir,tramp,soldados;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Bienvenidos a Juegos decisivos");
        System.out.println("Te encuentras en medio de un bosque y estas buscando"
                + " llegar a tu campamento2 y recuperarlo de los enemigos con "
                + "el cargamento");
        
            System.out.println("Tus soldados estan avanzando todos unidos,"
                    + "  pero en un "
                    + "despiste 20 soldados caen en una trampa."
                    + "¿Que decides hacer?");
            System.out.println("1)Decides abandonar a esos 20 soldados y "
                    + "sacrificarlos para no retrasar más la operación");                     
            System.out.println("2)Pierdes el tiempo necesario para salvar a"
                    + " tus hombres");
            System.out.println("3)Llamas a otros soldados para que se encarguen"
                    + " de esos soldados");
            System.out.println("4)Los rematas con un tiro para que no sufran "
                    + "más porque piensas que no se le pueden salvar");
            System.out.println("5)Te haces el loco y sigues como si no hubiese "
                    + "pasado nada");
            trampa=teclado.nextInt();
            
            switch (trampa){
                case 1:
                    System.out.println("Bien hecho continua");
                    System.out.println("Sigues avanzando cansados y necesitais"
                            + " un lugar para descansar y conseguis salir del"
                            + " bosque. A lo lejos puedes ver una explanada,"
                            + " varias montañas y un lago. ¿Donde decides ir?");
                    System.out.println("1)Lago");
                    System.out.println("2)Montañas");
                    System.out.println("3)Explanada");
                    lugar=teclado.nextInt();
                    
                    switch (lugar){
                        case 1:
                            System.out.println("Descansais os refrescais en el "
                                    + "lago y seguis avanzando");
                            System.out.println("Tomais rumbo de nuevo y de "
                                    + "repente todos los walkis y aparatos"
                                    + " electronicos empiezan a hacer ruidos "
                                    + "extraños");
                            System.out.println("1)decides apagarlos y seguir"
                                    + " avanzando sin problema");
                            System.out.println("2)Ignoras el ruido y sigues como"
                                    + " si no hubiese ocurrido nada");
                            System.out.println("3)Decides desacerte de todos los"
                                    + " equipos electronicos y solo usar los"
                                    + " mapas y linternas");
                            walki=teclado.nextInt();
                            
                            switch (walki){
                                case 1:
                                    System.out.println("Continuas avanzando "
                                            + "pero te das cuenta de que "
                                            + "necesitas comunicarte por el "
                                            + "walki con tu equipo. ¿Que haces?");
                                    System.out.println("1)Encenderlos para"
                                            + " comunicarte");
                                    System.out.println("2)Decides seguir sin"
                                            + " usar los walkis");
                                    walki2=teclado.nextInt();
                                    switch (walki2){
                                        case 1:
                                            System.out.println("Al encenderlo "
                                                    + "los enemigos captan el "
                                                    + "mensaje y os hacen una "
                                                    + "emboscada y os matan");
                                            System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                                            break;
                                        case 2:
                                            System.out.println("Avanzais a "
                                                    + "ciegas por lo que todos"
                                                    + " tus hombre van muriendo"
                                                    + " a causa de las trampas");
                                            System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                                            break;
                                    }
                                    
                                    break;
                                case 2:
                                    System.out.println("Despues de un rato de "
                                            + "ruidos molestos explotan todos "
                                            + "los equipos electronicos y moris");
                                    System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                                    break;
                                case 3:
                                    System.out.println("Sigues avanzando sin"
                                            + " ningun problema. Pero llega la "
                                            + "noche y teneis mucho frio ");
                                    System.out.println("1)Decidis hacer una "
                                            + "hoguera para calentaros");
                                    System.out.println("2)Os meteis en una "
                                            + "cueva para resguardaros del frio");
                                    System.out.println("3)Dormis todos juntos y"
                                            + " pegados para mantener el calor"
                                            + " corporal");
                                    dormir=teclado.nextInt();
                                    
                                    switch (dormir){
                                        case 1:
                                            System.out.println("La hoguera atrae"
                                                    + " a todo tipo de animales"
                                                    + " y os devoran mientras"
                                                    + " dormis");
                                            System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                                            break;
                                        case 2:
                                            System.out.println("Empieza a llover"
                                                    + " la cueva se inunda y "
                                                    + "moris ahogados");
                                            System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                                            break;
                                        case 3:
                                            System.out.println("Pasais la noche"
                                                    + " todos juntos y unidos. "
                                                    + "A la siguiente mañana "
                                                    + "conseguis llegar al fin "
                                                    + "al campamento2. Una vez "
                                                    + "alli debes decidir"
                                                    + " cuantos soldados "
                                                    + "lucharan cuerpo a cuerpo"
                                                    + " y los demas atacarn "
                                                    + "desde la lejania");
                                            System.out.println("Tienes 5.000 "
                                                    + "soldados en total,"
                                                    + "¿cuantos envias a luchar"
                                                    + " cuerpo a cuerpo?");
                                            soldados=teclado.nextInt();
                                            
                                            if (soldados<=3000 && soldados>=2000){
                                                System.out.println("VICTORIA");
                                                System.out.println("Recuperais "
                                                        + "vuestro campamento y"
                                                        + " haceis una fiesta "
                                                        + "para celebrarlo");
                                                System.out.println(""+
                "    |@@@@|     |####|\n" +
                "    |@@@@|     |####|\n" +
                "    |@@@@|     |####|\n" + 
                "    \\@@@@|     |####/\n" +
                "     \\@@@|     |###/\n" +
                "      `@@|_____|##'\n" +
                "           (O)\n" +
                "        .-'''''-.\n" +
                "      .'  * * *  `.\n" +
                "     :  *       *  :\n" +
                "    : ~   E M I     :\n" +
                "    : ~ G A M E S ~ :\n" +
                "     :  *       *  :\n" +
                "      `.  * * *  .'\n" +
                "        `-.....-'");
                                            }else{
                                                System.out.println("No "
                                                        + "gestionaste bien los"
                                                        + " soldados y acabais "
                                                        + "muriendo y no "
                                                        + "recuperais el "
                                                        + "campamento");
                                            System.out.println("	"
                                + "\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       /\n" +
"                             ^-----^");
                                            }
                                                
                                            
                                            
                                            break;
                                            
                                    }
                                    break;
                            }
                            
                            break;
                        case 2:
                            System.out.println("Mientras estais descansando la"
                                    + " montaña sufre un desprendimiento de la "
                                    + "cima que cae sobre vosotros y moris "
                                    + "aplastados");
                            System.out.println(
"                            .xm*f\"\"??T?@hc.\n" +
"                          z@\"` '~((!!!!!!!?*m.\n" +
"                        z$$$K   ~~(/!!!!!!!!!Mh\n" +
"                      .f` \"#$k'`~~\\!!!!!!!!!!!MMc\n" +
"                     :\"     f*! ~:~(!!!!!!!!!!XHMk\n" +
"                     f      \" %n:~(!!!!!!!!!!!HMMM.\n" +
"                    d          X~!~(!!!!!!!X!X!SMMR\n" +
"                    M :   x::  :~~!>!!!!!!MNWXMMM@R\n" +
" n                  E ' *  ueeeeiu(!!XUWWWWWXMRHMMM>                :.\n" +
" E%                 E  8 .$$$$$$$$K!!$$$$$$$$&M$RMM>               :\"5\n" +
"z  %                3  $ 4$$$$$$$$!~!*$$$$$$$$!$MM$               :\" `\n" +
"K   \":              ?> # '#$$$$$#~!!!!TR$$$$$R?@MME              z   R\n" +
"?     %.             5     ^\"\"\"~~~:XW!!!!T?T!XSMMM~            :^    J\n" +
" \".    ^s             ?.       ~~d$X$NX!!!!!!M!MM             f     :~\n" +
"  '+.    #L            *c:.    .~\"?!??!!!!!XX@M@~           z\"    .*\n" +
"    '+     %L           #c`\"!+~~~!/!!!!!!@*TM8M           z\"    .~\n" +
"      \":    '%.         'C*X  .!~!~!!!!!X!!!@RF         .#     +\n" +
"        \":    ^%.        9-MX!X!!X~H!!M!N!X$MM        .#`    +\"\n" +
"          #:    \"n       'L'!~M~)H!M!XX!$!XMXF      .+`   .z\"\n" +
"            #:    \":      R *H$@@$H$*@$@$@$%M~     z`    +\"\n" +
"              %:   `*L    'k' M!~M~X!!$!@H!tF    z\"    z\"\n" +
"                *:   ^*L   \"k ~~~!~!!!!!M!X*   z*   .+\"\n" +
"                  \"s   ^*L  '%:.~~~:!!!!XH\"  z#   .*\"\n" +
"                    #s   ^%L  ^\"#4@UU@##\"  z#   .*\"\n" +
"                      #s   ^%L           z#   .r\"\n" +
"                        #s   ^%.       u#   .r\"\n" +
"                          #i   '%.   u#   .@\"\n" +
"                            #s   ^%u#   .@\"\n" +
"                              #s x#   .*\"\n" +
"                               x#`  .@%.\n" +
"                             x#`  .d\"  \"%.\n" +
"                           xf~  .r\" #s   \"%.\n" +
"                     u   x*`  .r\"     #s   \"%.  x.\n" +
"                     %Mu*`  x*\"         #m.  \"%zX\"\n" +
"                     :R(h x*              \"h..*dN.\n" +
"                   u@NM5e#>                 7?dMRMh.\n" +
"                 z$@M@$#\"#\"                 *\"\"*@MM$hL\n" +
"               u@@MM8*                          \"*$M@Mh.\n" +
"             z$RRM8F\"                             \"N8@M$bL\n" +
"            5`RM$#                                  'R88f)R\n" +
"            'h.$\"                                     #$x*");
                        break;
                        case 3:
                            System.out.println("Despues de descansar un rato "
                                    + " tomais rumbo de nuevo");
                            System.out.println("En vuestro rumbo veis un puente"
                                    + " por el cual se recortan 2 horas del"
                                    + " camino pero no sabeis si es seguro."
                                    + "¿Que decides hacer?");
                            System.out.println("1)Cruzarlo sin pensarlo 2 veces");
                            System.out.println("2)Comprobar su seguridad "
                                    + "mediante el peso de varias piedras");
                            System.out.println("3)No quieres arriesgarte y das "
                                    + "toda la vuelta");
                            puente=teclado.nextInt();
                            
                            switch (puente){
                                case 1:
                                    System.out.println("Pasais todos a la vez y"
                                            + " el puente no aguanta el peso y"
                                            + " caes al precipicio");
                                    System.out.println("     "+
"                                      .\"\"--.._\n" +
"                                           []      `'--.._\n" +
"                                           ||__           `'-,\n" +
"                                         `)||_ ```'--..       \\\n" +
"                     _                    /|//}        ``--._  |\n" +
"                  .'` `'.                /////}              `\\/\n" +
"                 /  .\"\"\".\\              //{///\n" +
"                /  /_  _`\\\\            // `||\n" +
"                | |(_)(_)||          _//   ||\n" +
"                | |  /\\  )|        _///\\   ||\n" +
"                | |L====J |       / |/ |   ||\n" +
"               /  /'-..-' /    .'`  \\  |   ||\n" +
"              /   |  :: | |_.-`      |  \\  ||\n" +
"             /|   `\\-::.| |          \\   | ||\n" +
"           /` `|   /    | |          |   / ||\n" +
"         |`    \\   |    / /          \\  |  ||\n" +
"        |       `\\_|    |/      ,.__. \\ |  ||\n" +
"        /                     /`    `\\ ||  ||\n" +
"       |           .         /        \\||  ||\n" +
"       |                     |         |/  ||\n" +
"       /         /           |         (   ||\n" +
"      /          .           /          )  ||\n" +
"     |            \\          |             ||\n" +
"    /             |          /             ||\n" +
"   |\\            /          |              ||\n" +
"   \\ `-._       |           /              ||\n" +
"    \\ ,//`\\    /`           |              ||\n" +
"     ///\\  \\  |             \\              ||\n" +
"    |||| ) |__/             |              ||\n" +
"    |||| `.(                |              ||\n" +
"    `\\\\` /`                 /              ||\n" +
"       /`                   /              ||\n" +
"      /                     |              ||\n" +
"     |                      \\              ||\n" +
"    /                        |             ||\n" +
"  /`                          \\            ||\n" +
"/`                            |            ||\n" +
"`-.___,-.      .-.        ___,'            ||\n" +
"         `---'`   `'----'`");
                                break;
                                
                                case 2:
                                    System.out.println("Os asegurais de que se"
                                            + " puede pasar pero de pocos en"
                                            + " pocos para no sobrecargarlo");
                                    System.out.println("Una vez pasado el "
                                            + "puente os dais cuenta de que la "
                                            + "unica salida que hay es tirarse "
                                            + "a un rio pero hay bastante altura"
                                            + " y justamente detras os cortan "
                                            + "el paso unos osos que estaban "
                                            + "escondidos en su cueva"
                                            + " y no sabeis la profundidad");
                                    System.out.println("Por lo que deciden:");
                                    System.out.println("1)tirarse");
                                    System.out.println("2)enfrentarse a los"
                                            + " osos y volver al puente");
                                    rio=teclado.nextInt();
                                    switch (rio){
                                        case 1:
                                            System.out.println("Os tirais y "
                                                    + "moris todos porque el "
                                                    + "agua os llegaba hasta "
                                                    + "los tobillos");
                                            System.out.println("	"
                                + "\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       /\n" +
"                             ^-----^");
                                        break;
                                        case 2:
                                            System.out.println("Os enfrentais a"
                                                    + " los osos pero os "
                                                    + "despedazan y moris "
                                                    + "todos");
                                            System.out.println(" "
             + "   uuuuuuu\n" +
"             uu$$$$$$$$$$$uu\n" +
"          uu$$$$$$$$$$$$$$$$$uu\n" +
"         u$$$$$$$$$$$$$$$$$$$$$u\n" +
"        u$$$$$$$$$$$$$$$$$$$$$$$u\n" +
"       u$$$$$$$$$$$$$$$$$$$$$$$$$u\n" +
"       u$$$$$$$$$$$$$$$$$$$$$$$$$u\n" +
"       u$$$$$$\"   \"$$$\"   \"$$$$$$u\n" +
"       \"$$$$\"      u$u       $$$$\"\n" +
"        $$$u       u$u       u$$$\n" +
"        $$$u      u$$$u      u$$$\n" +
"         \"$$$$uu$$$   $$$uu$$$$\"\n" +
"          \"$$$$$$$\"   \"$$$$$$$\"\n" +
"            u$$$$$$$u$$$$$$$u\n" +
"             u$\"$\"$\"$\"$\"$\"$u\n" +
"  uuu        $$u$ $ $ $ $u$$       uuu\n" +
" u$$$$        $$$$$u$u$u$$$       u$$$$\n" +
"  $$$$$uu      \"$$$$$$$$$\"     uu$$$$$$\n" +
"u$$$$$$$$$$$uu    \"\"\"\"\"    uuuu$$$$$$$$$$\n" +
"$$$$\"\"\"$$$$$$$$$$uuu   uu$$$$$$$$$\"\"\"$$$\"\n" +
" \"\"\"      \"\"$$$$$$$$$$$uu \"\"$\"\"\"\n" +
"           uuuu \"\"$$$$$$$$$$uuu\n" +
"  u$$$uuu$$$$$$$$$uu \"\"$$$$$$$$$$$uuu$$$\n" +
"  $$$$$$$$$$\"\"\"\"           \"\"$$$$$$$$$$$\"\n" +
"   \"$$$$$\"                      \"\"$$$$\"\"\n" +
"     $$$\"                         $$$$\"");
                                        break;
                                    }
                                    
                                break;
                                
                                case 3:System.out.println("Tardas varias horas"
                                        + " más pero pasais el tramo sanos y a"
                                        + " salvo. Tambien te das cuenta de que"
                                        + " se os ha acabado el agua");
                                    System.out.println("Despues de un largo "
                                            + "camino encuentras una charca y "
                                            + "ves que todos tus hombres estan "
                                            + "sedientos. Viendo esto decides "
                                            + "que seria apropiado:");
                                    System.out.println("1)Beber agua para que "
                                            + "todo el mundo se hidrate");
                                    System.out.println("2)No beber agua porque"
                                            + " no te fias de que se agua sea "
                                            + "potable");
                                    agua=teclado.nextInt();
                                switch (agua){
                                    case 1:
                                        System.out.println("Bebeis agua y pocas"
                                                + " horas despues vais muriendo"
                                                + " ya que el agua estaba "
                                                + "infectaba por un cadaver en"
                                                + " descomposición");
                                        System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                                        break;
                                    case 2:
                                        System.out.println("No bebeis agua y "
                                                + "seguis vuestro camino pero el"
                                                + " sol es demasiado abrasador "
                                                + "y moris por deshidratación");
                                        System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                                        break;
                                }
                            
                            break;
                            }
                    }
                    
                    
                    
                    break;
                case 2:
                    System.out.println("Retrasas la operación y os rodean  y "
                            + "acabais siendo carne de cañon");
                    System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                break;
                case 3:
                    System.out.println("Llegan los soldados llamados para ayudar"
                            + " y salvan a los atrapados en la trampa");
                    System.out.println("Una vez estan todos a salvo tienes que "
                            + "decidir si:");
                    System.out.println("1)siguen vuestro camino pero horas "
                            + "atras");
                    System.out.println("2)Vuelven al campamento base");
                    tramp=teclado.nextInt();
                    
                    switch (tramp){
                        case 1:
                            System.out.println("Se pierden y acaban muriendo"
                                    + " por un precipicio");
                            System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                            break;
                        case 2:
                            System.out.println("Al caminar hacia el campamento"
                                    + " base unos bandalos los tirotean");
                            System.out.println(
                    "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Matas a los soldados atrapados y tus "
                            + "otros soldados se revelan y te matan por dejar "
                            + "atras a tus hombres");
                    System.out.println(" "
                         +   "-'~`---------------------------------/\\--\n" +
"||\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" \\\\\\\\\\\\  \\/~)\n" +
"||                                  \\\\\\\\\\\\  \\/_\n" +
" |~~~~~~~~-________________-_________________\\ ~--_\n" +
" !---------|_________       ------~~~~~(--   )--~~\n" +
"                     \\ /~~~~\\~~\\   )--- \\_ /(\n" +
"                      ||     |  | \\   ()   \\\\\n" +
"                      \\\\____/_ / ()\\        \\\\\n" +
"                       `~~~~~~~~~-. \\        \\\\\n" +
"                                   \\ \\  <($)> \\\\\n" +
"                                    \\ \\        \\\\\n" +
"                                     \\ \\        \\\\\n" +
"                                      \\ \\        \\\\\n" +
"                                       \\ \\  ()    \\|\n" +
"                                       _\\_\\__====~~~");
                    break;
                case 5:
                    System.out.println("Pasas de los soldados atrapados y tus "
                            + "otros soldados se dan cuenta por lo que se "
                            + "revelan y te matan por dejar "
                            + "atras a tus hombres");
                    System.out.println(
                     "               ...\n" +
                    "             ;::::;\n" +
                    "           ;::::; :;\n" +
                    "         ;:::::'   :;\n" +
                    "        ;:::::;     ;.\n" +
                    "       ,:::::'       ;           OOO\\\n" +
                    "       ::::::;       ;          OOOOO\\\n" +
                    "       ;:::::;       ;         OOOOOOOO\n" +
                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O\n" +
                    "  `:::::`::::::::;' /  / `:#\n" +
                    "   ::::::`:::::;'  /  /   `#");
                    break;
            }
            
          
        }
            
        
        
    }
    

