package tekpro.praktikum3;
/*
 * Author : Micho Dhani Firmansyah - 231524013
 */
public abstract class Karakter {
    // Deklarasi variabel
    private String nama;
    private String weapon;
    protected String skill;
    protected String burst;
    
    //Enkapsulasi variabel nama dan weapon
    public Karakter(String nama, String weapon){
        this.nama = nama;
        this.weapon = weapon;
    }
    public String getNama(){
        return nama;
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    //Method Abstract dengan parameter burst(tipe: String) dan skill(tipe : String)
    public abstract void ShowInfoKarakter(String burst,String skill);
}
   
    
    
    
    


    

    

