package model;

// 1. Ubah jadi abstract class (Hubungan "ADALAH" untuk BukuCetak & EBook)
public abstract class Buku {
    private final String idBuku;
    protected String judul;
    protected String penulis;
    protected int tahunTerbit;
    protected int halaman;

    public Buku(String idBuku, String judul, String penulis, int tahunTerbit) {
        this.idBuku = idBuku;
        setJudul(judul);
        setPenulis(penulis);
        setTahunTerbit(tahunTerbit);
    }

    public String getIdBuku() { return idBuku; }
    public String getJudul() { return judul; }

    public void setJudul(String judul) {
        if (judul != null && !judul.trim().isEmpty()) {
            this.judul = judul;
        } else {
            System.out.println("Judul tidak boleh kosong!");
        }
    }

    public String getPenulis() { return penulis; }

    public void setPenulis(String penulis) {
        if (penulis != null && !penulis.trim().isEmpty()) {
            this.penulis = penulis;
        } else {
            System.out.println("Penulis tidak boleh kosong!");
        }
    }

    public int getTahunTerbit() { return tahunTerbit; }

    public void setTahunTerbit(int tahunTerbit) {
        if (tahunTerbit >= 1900 && tahunTerbit <= 2026) {
            this.tahunTerbit = tahunTerbit;
        } else {
            System.out.println("Tahun terbit harus berada di antara 1900 dan 2026!");
        }
    }

    public void tampilkanInfoHalaman() {
        System.out.println("sedang membaca pada halaman:" + halaman);
    }
    
    public void tampilkanInfo() {
        System.out.println("-------------------------------");
        System.out.println("ID Buku      : " + this.idBuku);
        System.out.println("Judul        : " + this.judul);
        System.out.println("Penulis      : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("-------------------------------");
    }

    // 2. ABSTRACT METHOD: Kontrak wajib bahwa setiap "Buku" harus bisa hitung denda
    public abstract double hitungDenda(int hariTerlambat);

    public final void cetakStatusAset() {
        System.out.println("status aset: terdaftar sebagai koleksi perpustakaan");
    }
}
