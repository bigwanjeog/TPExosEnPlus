package TPExosEnPlus;

/**
 * Created by RENAUD on 29/08/2016.
 */

import java.text.DecimalFormat;
import java.util.Scanner;


public class TPExosEnPlus {

    final static String[] VOYELLE = {"a","e","i","o","u","y"};
    final static String[] ALPHABET = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    static DecimalFormat decimalPrintFormat = new DecimalFormat("#,##0.0###");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        lancerExercice();
        //exercice7();
    }

    /**
     * methode pour choisir quelle exercice lancer
     */
    private static void lancerExercice() {
        try {
            System.out.println("Entrez le numéro de l'exercice a faire (1 à 11) ou 0 pour sortir du programme :");
            String numeroExo = sc.nextLine();
            switch (numeroExo) {
                case "0":
                    System.out.println("Au revoir");
                    break;
                case "1":
                    exercice1();
                    break;
                case "2":
                    exercice2();
                    break;
                case "3":
                    exercice3();
                    break;
                case "4":
                    exercice4();
                    break;
                case "5":
                    exercice5();
                    break;
                case "6":
                    exercice6();
                    break;
                case "7":
                    exercice7();
                    break;
                case "8":
                    exercice8();
                    break;
                case "9":
                    exercice9();
                    break;
                case "10":
                    exercice10();
                    break;
                case "11":
                    exercice11();
                    break;
                default:
                    System.out.println("Votre nombre n'est pas compris entre 0 et 11");
                    lancerExercice();
            }//end switch
        } finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 1. Ecrire un programme qui échange la valeur de deux variables. Exemple,
     * si a = 2 et b = 5, le programme donnera a = 5 et b = 2. Idem pour 3, puis
     * généralisé à n
     */
    private static void exercice1() {
        try {
            int a;
            int b;
            int temp;
            System.out.println("Les deux numéros vont être inversés");
            System.out.println("Entrez le nombre a :");
            a =  Integer.parseInt(sc.nextLine());
            System.out.println("Entrez le nombre b :");
            b = Integer.parseInt(sc.nextLine());
            temp = a;
            a = b;
            b = temp;
            System.out.println("a = " + a + " b = " + b);
            lancerExercice();
        } finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 2. Ecrire un algorithme qui demande un nombre de départ, et qui calcule
     * la somme des entiers jusqu’`a ce nombre. Par exemple, si l’on entre 5, le
     * programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15 NB : on souhaite
     * afficher uniquement le résultat, pas la décomposition du calcul.
     */
    private static void exercice2() {
        try {
            System.out.println("Calcule de la somme des entiers du nombre");
            System.out.println("Entrez le nombre a calculer:");
            int nbIn = Integer.parseInt(sc.nextLine());
            int res = somme(nbIn);
            /*for (int i = 0; i <= nbIn; i++) {
                res += i;
            }*/
            System.out.println("Le calcule de la somme des entiers du nombre " + nbIn + " est égale a " + res);
            lancerExercice();
        } finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 3. Ecrire un algorithme qui demande un nombre de d´epart, et qui calcule
     * sa factorielle. NB : la factorielle de 8, not´ee 8 !, vaut 1 x 2 x 3 x 4
     * x 5 x 6 x 7 x 8
     */
    private static void exercice3() {
        try {
            System.out.println("Calcule la factorielle du nombre");
            System.out.println("Entrez le nombre a calculer:");
            int nbIn = Integer.parseInt(sc.nextLine());
            String res = decimalPrintFormat.format(factorielle(nbIn));
            /*for (int i = 1; i <= nbIn; i++) {
                res *= i;
            }*/
            System.out.println("Le calcule de la factorielle du nombre " + nbIn + " est égale a " + res);
            lancerExercice();
        } finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 4. Ecrivez un algorithme qui demande un mot à l’utilisateur et qui
     * affiche à l’écran le nombre de lettres de ce mot (c'est vraiment tout
     * bête).
     */
    private static void exercice4() {
        try {
            System.out.println("Compte le nombre de lettre du mot");
            System.out.println("Entrez le mot a compté :");
            String a = sc.nextLine();
            System.out.println("Votre mot est long de " + a.length() + " lettre(s)");
            lancerExercice();
        } finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 5. Ecrivez un algorithme qui demande une phrase à l’utilisateur et qui
     * affiche à l’écran le nombre de mots de cette phrase. On suppose que les
     * mots ne sont séparés que par des espaces (et c'est déjà un petit peu
     * moins bête).
     */
    private static void exercice5() {
        try {
            System.out.println("Compte le nombre de mot du texte");
            System.out.println("Entrez le texte a compté :");
            String[] res = sc.nextLine().split("\\s+");
            System.out.println("Votre texte est long de " + res.length + " mot(s)");
            lancerExercice();
        } finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 6. Ecrivez un algorithme qui demande une phrase à l’utilisateur et qui
     * affiche à l’écran le nombre de voyelles contenues dans cette phrase.On
     * pourra écrire deux solutions. La première déploie une condition composée
     * bien fastidieuse. La deuxième, en utilisant la fonction Trouve, allège
     * considérablement l'algorithme.
     */
    private static void exercice6() {
        try {
            System.out.println("Compte le nombre de VOYELLE du texte");
            System.out.println("Entrez le numéro de la méthode 1 ou 2 :");
            String numMethod = sc.nextLine();
            /**
             * Choix de la methode 1 ou 2
             */
            switch (numMethod) {
                case "1":
                    method1();
                    break;
                case "2":
                    method2();
                    break;
                default:
                    System.out.println("Mauvais numéro");
                    exercice6();
            }//end switch
        } finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * Methode 1 pour resoudre l'exercice 6
     * avec 2 foreach
     */
    private static void method1() {
        try {
            System.out.println("Entrez le texte a compté :");
            String[] res = sc.nextLine().toLowerCase().split("");
            int compteur = 0;
            for (String lettre : res) {
                for (String verif : VOYELLE) {
                    if (lettre.equals(verif)){
                        compteur++;
                    }//end if
                }//end foreach
            }//end foreach
            System.out.println(compteur);
            lancerExercice();
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * Methode 2 pour resoudre l'exercice 6
     * avec 1 while et 1 foreach
     */
    private static void method2() {
        try {
            System.out.println("Entrez le texte a compté :");
            String[] res = sc.nextLine().toLowerCase().split("");
            int compteur = 0;
            int i = 0;
            while ( i != res.length) {
                for (String verif : VOYELLE) {
                    if (res[i].equals(verif)){
                        compteur++;
                    }//end if
                }//end foreach
                i++;
            }//end while
            System.out.println(compteur);
            lancerExercice();
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 7. Ecrivez un algorithme qui demande une phrase à l’utilisateur. Celui-ci
     * entrera ensuite le rang d’un caractère à supprimer, et la nouvelle phrase
     * doit être affichée (on doit réellement supprimer le caractère dans la
     * variable qui stocke la phrase, et pas uniquement à l’écran).
     */
    private static void exercice7() {
        try {
            System.out.println("Supprime un caractère d'un texte");
            System.out.println("Entrez le texte :");
            String res = sc.nextLine();
            System.out.println("Entrez le numero du caractère a supprimer (mini 1):");
            int charDelete = Integer.parseInt(sc.nextLine());
            if (charDelete < 1){
                System.out.println("/!\\ Le nombre doit être au minimum a 1 /!\\");
                exercice7();
            }//end if
            else if (charDelete <= res.length() ) {
                System.out.println(supprimeChar(res, charDelete - 1));
                lancerExercice();
            }//end else if
            else {
                System.out.println("/!\\ Le nombre saisie est trop grand /!\\");
                exercice7();
            }//end else
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 8. Un des plus anciens systèmes de cryptographie (aisément déchiffrable)
     * consiste à décaler les lettres d’un message pour le rendre illisible.
     * Ainsi, les A deviennent des B, les B des C, etc. Ecrivez un algorithme
     * qui demande une phrase à l’utilisateur et qui la code selon ce principe.
     * Comme dans le cas précédent, le codage doit s’effectuer au niveau de la
     * variable stockant la phrase, et pas seulement à l’écran.
     */
    private static void exercice8() {
        try {
            System.out.println("Crypte un texte");
            System.out.println("Entrez le texte :");
            String crypter = sc.nextLine();
            System.out.println(cryptagePlus1(crypter));
            lancerExercice();
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 9. Une amélioration (relative) du principe précédent consiste à opérer
     * avec un décalage non de 1, mais d’un nombre quelconque de lettres. Ainsi,
     * par exemple, si l’on choisit un décalage de 12, les A deviennent des M,
     * les B des N, etc. Réalisez un algorithme sur le même principe que le
     * précédent, mais qui demande en plus quel est le décalage à utiliser.
     * Votre sens proverbial de l'élégance vous interdira bien sûr une série de
     * vingt-six "Si...Alors"
     */
    private static void exercice9() {
        try {
            lancerExercice();
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 10. Ecrivez un algorithme qui demande un nombre entier à l’utilisateur.
     * L’ordinateur affiche ensuite le message "Ce nombre est pair" ou "Ce
     * nombre est impair" selon le cas.
     */
    private static void exercice10() {
        try {
            lancerExercice();
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * 11. Triangle de Pascal
     */
    private static void exercice11() {
        try {
            lancerExercice();
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    /**
     * calcul de la somme d'un nombre donné
     * @param nombre
     * @return int
     */
    private static int somme(int nombre){
        int x;
        if (nombre == 1){
            x = 1;
            return x;
        }//end if
        else {
            x = nombre + somme(nombre - 1);
            return x;
        }//end else
    }

    /**
     * calcul de la factorielle d'un nombre donné
     * @param nombre
     * @return double
     */
    private static double factorielle(int nombre){
        double x;
        if (nombre == 1){
            x = 1;
            return x;
        }//end if
        else {
            x = nombre * factorielle(nombre - 1);
            return x;
        }//end else
    }


    /**
     * supprime un caractère du tableau de String
     * et le retransforme en String
     * @param tabIn
     * @param deleteChar
     * @return string
     */
    private static String supprimeChar(String tabIn, int deleteChar){
        String[] res = tabIn.split("");
        while (res.length > deleteChar) {
            if (res.length != deleteChar + 1){
                res[deleteChar] = res[deleteChar + 1];
                deleteChar++;
            }//end if
            else {
                res[deleteChar] = "";
                deleteChar++;
            }//end else
        }//end while
        StringBuilder builder = new StringBuilder();
        for (String s : res) {
            builder.append(s);
        }//end foreach
        return builder.toString();
    }

    /**
     * crypte en augmentant de 1 chaque lettre
     * @param crypter
     * @return string
     */
    private static String cryptagePlus1(String crypter) {
        String[]  res = crypter.toLowerCase().split("");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < ALPHABET.length; j++) {
                if (res[i].equals(ALPHABET[j])) {
                    if(! res[i].equals("z")){
                        res[i] = ALPHABET[j + 1];
                    }//end if
                    else {
                        res[i] = ALPHABET[0];
                    }//end else
                    break;
                }//end if
            }//end for
        }//end for
        StringBuilder builder = new StringBuilder();
        for (String s : res) {
            builder.append(s);
        }//end foreach
        return builder.toString();
    }
}
