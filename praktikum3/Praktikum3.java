package tekpro.praktikum3;
import java.util.Scanner;

/**
 * @author Micho Dhani Firmansyah - 231524013
 */

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        
        //Deklarasi karakter yang dimasukkan
        Karakter[] Karakters = {
            new Anemo("Venti","Bow"),
            new Cryo("Tsaritsa","Catalyst"),
            new Dendro("Nahida","Catalyst"),
            new Electro("Raiden Ei","Polearm"),
            new Geo("Zhongli", "Polearm"),
            new Hydro("Furina","Sword"),
            new Pyro("Murata","GreatSword")
        };
        
        // Memilih Karakter yang akan dipilih
        System.out.println("==========Karakter==========");
        System.out.println(" 1. Venti \n 2. Tsaritsa \n 3. Nahida \n 4. Raiden Ei \n 5. Zhongli \n 6. Furina \n 7. Murata \n");
        
        System.out.println("Pilih Karakter (selain 1 sampai 7 untuk keluar program) = ");
        pilih = in.nextInt();
        switch (pilih) {
            case 1 -> {
                Karakters[0].ShowInfoKarakter("Wind's Grand Ode","Skyward Sonnet");
            }
            case 2 -> {
                Karakters[1].ShowInfoKarakter("Unreleased","Unreleased");
            }
            case 3 -> {
                Karakters[2].ShowInfoKarakter("Illusory Heart","All Schemes to Know");
            }
            case 4 -> {
                Karakters[3].ShowInfoKarakter("Secret Art: Musou Shinsetsu","Transcendence: Baleful Omen");
            }
            case 5 -> {
                Karakters[4].ShowInfoKarakter("Planet Befall","Dominus Lapidis");
            }
            case 6 -> {
                Karakters[5].ShowInfoKarakter("Let the People Rejoice","Salon Solitaire");
            }
            case 7 -> {
                Karakters[6].ShowInfoKarakter("Unreleased","Unreleased");
            }
            default -> {
                System.out.println("Byeeeee!");
            }
        }
    }
}
