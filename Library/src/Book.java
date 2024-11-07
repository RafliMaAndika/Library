/**
 * Kelas Book mewakili buku di perpustakaan.
 */
public class Book {
    private String title;
    private String author;
    private boolean available;

    /**
     * Konstruktor untuk membuat buku baru.
     * @param title Judul buku.
     * @param author Nama penulis buku.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // Buku tersedia secara default
    }

    /**
     * Mendapatkan judul buku.
     * @return Judul buku.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Mengecek apakah buku tersedia untuk dipinjam.
     * @return true jika buku tersedia, false jika tidak.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Mengatur status ketersediaan buku.
     * @param available true jika buku tersedia, false jika tidak.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Mengembalikan representasi string dari buku.
     * @return Informasi buku (judul dan penulis).
     */
    @Override
    public String toString() {
        return "Buku: " + title + " oleh " + author;
    }
}
