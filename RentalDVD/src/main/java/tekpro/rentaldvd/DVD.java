package tekpro.rentaldvd;

// Author : Micho Dhani Firmansyah - 231524013

public abstract class DVD{
    private String judul;
    private String nama;
    private String publisher;
    private int stok;
    private String kategori;
    
    public DVD(String judul,String nama,String publisher, int stok, String kategori){
        this.judul = judul;
        this.nama = nama;
        this.publisher = publisher;
        this.stok = stok;
        this.kategori = kategori;
    }
    
    public abstract String getInfo();

    public String getJudul() {
        return judul;
    }

    public String getNama() {
        return nama;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }  
}
