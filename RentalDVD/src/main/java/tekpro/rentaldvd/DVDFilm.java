package tekpro.rentaldvd;

// Author : Micho Dhani Firmansyah - 231524013

public class DVDFilm extends DVD{
    private String sutradara;
    
    public DVDFilm(String nama, String publisher, int stok, String judul, String sutradara, String kategori){
        super(nama,judul,publisher,stok,kategori);
        this.sutradara = sutradara;
    }

    public String getSutradara() {
        return sutradara;
    }
    
    @Override
    public String getInfo(){
        return "Judul : " + getJudul() + "\nPemeran: " + getNama() + "\nSutradara: " + getSutradara() + "\nKategori: " + getKategori() + "\nPublisher: " + getPublisher() + "\nStok: " + getStok();
    }
}
