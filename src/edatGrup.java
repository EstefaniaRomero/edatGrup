import java.util.Scanner;

public class edatGrup {

    /* Els alumnes de l’escola s'han dividit en dos grups A i B segons l’edat.
       El grup A està format pels menors de 15 anys i el grup B per la resta.
       Escriure un programa que pregunti a l'usuari la seva edat, i mostri per pantalla el grup que li correspon.
        */
    private static final int AGE=15;
    public static void main(String[] args) {

        int age = askAge();
        int group = resultGroup(age);
    }

    private static int resultGroup(int age) {
            if (age <= AGE){

                System.out.println("Pertanys al grup A");

            }else System.out.println("Pertanys al grup B");

            return age;
    }

    private static int askAge() {

        System.out.println("Introdueix la teva edat: ");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        return option;

    }

}
