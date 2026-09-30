package model;

// EBook "ADALAH" Buku DAN "PUNYA KEMAMPUAN" DapatDiunduh
public class EBook extends Buku implements DapatDiunduh {
    private double ukuranFileMB;
    private String formatFile;
    private final double dendaPerHari = 1000;

    public EBook(String idBuku, String judul, String penulis, int tahunTerbit, double ukuranFileMB, String formatFile) {
        super(idBuku, judul, penulis, tahunTerbit);
        setUkuranFileMB(ukuranFileMB);
        setFormatFile(formatFile);
    }

    public double getUkuranFileMB() { return ukuranFileMB; }

    public void setUkuranFileMB(double ukuranFileMB) {
        if (ukuranFileMB > 0) {
            this.ukuranFileMB = ukuranFileMB;
        } else {
            System.out.println(">> ERROR: Ukuran file harus lebih dari 0!");
            this.ukuranFileMB = 0.1;
        }
    }

    public String getFormatFile() { return formatFile; }

    public void setFormatFile(String formatFile) {
        if (formatFile != null && !formatFile.trim().isEmpty()) {
            this.formatFile = formatFile;
        } else {
            System.out.println(">> ERROR: Format file tidak boleh kosong!");
        }
    }

    // 1. Mengisi abstract method dari Buku
    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * dendaPerHari;
    }

    // 2. Mengisi method kemampuan dari Interface DapatDiunduh
    @Override
    public void unduh() {
        System.out.println("Mengunduh E-Book '" + getJudul() + "' (" + ukuranFileMB + " MB)... Selesai!");
    }
}
