package app;

import model.Buku;
import model.BukuCetak;
import model.EBook;

public class Main {

    public static void main(String[] args) {
        // 1. KONTRAK ABSTRACT CLASS ("ADALAH")
        // Buku b = new Buku(...); // ERROR: Tidak bisa di-instansiasi langsung karena abstract!

        BukuCetak bukuCetak = new BukuCetak("BC001", "Pemrograman Java", "James Gosling", 2023, 350, "Rak A-1");
        EBook eBook = new EBook("EB001", "Dasar PBO", "Alan Walker", 2021, 13.5, "PDF");

        System.out.println("=== 1. DEMO ABSTRACT CLASS (Hitung Denda) ===");
        bukuCetak.tampilkanInfo();
        System.out.println("Denda Terlambat 3 Hari (Buku Cetak): Rp " + bukuCetak.hitungDenda(3));

        System.out.println();

        eBook.tampilkanInfo();
        System.out.println("Denda Terlambat 3 Hari (EBook): Rp " + eBook.hitungDenda(3));

        // 2. KONTRAK INTERFACE ("KEMAMPUAN")
        System.out.println("\n=== 2. DEMO INTERFACE (Fitur Unduh Khusus EBook) ===");
        eBook.unduh(); // BukuCetak tidak punya method ini karena tidak implements DapatDiunduh
    }
}
