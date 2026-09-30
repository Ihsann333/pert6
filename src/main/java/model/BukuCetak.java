package model;

// BukuCetak "ADALAH" Buku
public class BukuCetak extends Buku {
    private int jumlahHalaman;
    private String lokasiRak;
    private final double dendaCetak = 5000;
    
    public BukuCetak(String idBuku, String judul, String penulis, int tahunTerbit, int jumlahHalaman, String lokasiRak) {
        super(idBuku, judul, penulis, tahunTerbit);
        setJumlahHalaman(jumlahHalaman);
        setLokasiRak(lokasiRak);
    }

    public int getJumlahHalaman() { return jumlahHalaman; }

    public void setJumlahHalaman(int jumlahHalaman) {
        if (jumlahHalaman > 0) {
            this.jumlahHalaman = jumlahHalaman;
        } else {
            System.out.println(">> ERROR: Jumlah halaman harus lebih dari 0!");
            this.jumlahHalaman = 1;
        }
    }

    public String getLokasiRak() { return lokasiRak; }

    public void setLokasiRak(String lokasiRak) {
        if (lokasiRak != null && !lokasiRak.trim().isEmpty()) {
            this.lokasiRak = lokasiRak;
        } else {
            System.out.println(">> ERROR: Lokasi rak tidak boleh kosong!");
        }
    }

    // Mengisi logika abstract method hitungDenda dari Buku
    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * dendaCetak;
    }
}
