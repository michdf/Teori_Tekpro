package tekpro.rentaldvd;

// Author : Micho Dhani Firmansyah - 231524013

public class DVDMusik extends DVD{
    private String produser;
    private String topHits;
    
    public DVDMusik(String nama, String publisher, int stok, String judul, String produser, String topHits, String kategori){
        super(nama,judul, publisher, stok,kategori);
        this.produser = produser;
        this.topHits = topHits;
    }

    public String getProduser() {
        return produser;
    }

    public String getTopHits() {
        return topHits;
    }
    
    @Override
    public String getInfo() {
        return "Judul: " + getJudul() + "\nPenyanyi: " + getNama() + "\nProduser: " + getProduser() + "\nTop Hits: " + getTopHits() + "\nKategori: " + getKategori() + "\nPublisher: " + getPublisher() + "\nStok: " + getStok();
    }
}
