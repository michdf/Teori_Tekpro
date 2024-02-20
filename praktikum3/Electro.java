package tekpro.praktikum3;
/*
 * Author : Micho Dhani Firmansyah - 231524013
 */
public class Electro extends Karakter{
    public Electro(String nama, String weapon){
        super(nama,weapon);
    }
    
    //Implementasi Method Abstract
    @Override
    public void ShowInfoKarakter(String burst, String skill){
        System.out.println("===============Info Karakter===============");
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Weapon : "+ getWeapon());
        System.out.println("Skill : "+ skill);
        System.out.println("Burst : " + burst);
    }
}
