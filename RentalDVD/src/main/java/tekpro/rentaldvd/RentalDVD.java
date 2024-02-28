package tekpro.rentaldvd;

// Author : Micho Dhani Firmansyah - 231524013

public class RentalDVD {
    private DVD[] daftarDVD;
    private int jumlahDVD;
    
    public RentalDVD(){
        daftarDVD = new DVD[100];
        jumlahDVD = 0;
    }
    
    public void tambahDVD(DVD dvd){
        daftarDVD[jumlahDVD] = dvd;
        jumlahDVD++;
    }
    
    public void lihatDVD(){
        for (int i = 0; i < jumlahDVD; i++){
            System.out.println(daftarDVD[i].getInfo());
            System.out.println("--------------------------------------");
        }
    }
    
    public static void main(String[] args) {
        RentalDVD rentalDVD = new RentalDVD();

        DVDFilm film1 = new DVDFilm("Film 1", "Perusahaan Film 1", 10, "Pemeran 1, Pemeran 2", "Sutradara 1", "SU");
        DVDFilm film2 = new DVDFilm("Film 2", "Perusahaan Film 2", 5, "Pemeran 3", "Sutradara 2", "D");

        DVDMusik musik1 = new DVDMusik("Musik 1", "Perusahaan Musik 1", 15, "Penyanyi 1", "Produser 1", "Lagu 1, Lagu 2", "C");
        DVDMusik musik2 = new DVDMusik("Musik 2", "Perusahaan Musik 2", 20, "Penyanyi 2, Penyanyi 3", "Produser 2", "Lagu 3, Lagu 4", "J");

        rentalDVD.tambahDVD(film1);
        rentalDVD.tambahDVD(film2);
        rentalDVD.tambahDVD(musik1);
        rentalDVD.tambahDVD(musik2);
        
        System.out.println("--------------------------------------");
        rentalDVD.lihatDVD();
    }
}
