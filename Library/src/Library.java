import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Library untuk mengelola buku dan anggota perpustakaan.
 */
public class Library {
    private List<Book> books;
    private List<Member> members;

    /**
     * Konstruktor Library yang menginisialisasi daftar buku dan anggota.
     */
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    /**
     * Menambahkan buku baru ke perpustakaan.
     * @param book Buku yang akan ditambahkan.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Mendapatkan daftar buku di perpustakaan.
     * @return Daftar buku di perpustakaan.
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Menampilkan buku yang tersedia di perpustakaan.
     */
    public void displayAvailableBooks() {
        System.out.println("\nDaftar Buku Tersedia:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    /**
     * Menambahkan anggota baru ke perpustakaan.
     * @param member Anggota yang akan ditambahkan.
     */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * Menampilkan daftar anggota perpustakaan.
     */
    public void displayMembers() {
        System.out.println("\nDaftar Anggota:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    /**
     * Meminjam buku dari perpustakaan.
     * @param book Buku yang ingin dipinjam.
     * @param member Anggota yang meminjam buku.
     */
    public void borrowBook(Book book, Member member) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Buku '" + book.getTitle() + "' berhasil dipinjam oleh " + member.getName());
        } else {
            System.out.println("Buku sedang tidak tersedia.");
        }
    }

    /**
     * Mengembalikan buku ke perpustakaan.
     * @param book Buku yang ingin dikembalikan.
     */
    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Buku '" + book.getTitle() + "' berhasil dikembalikan.");
        } else {
            System.out.println("Buku ini tidak dalam status dipinjam.");
        }
    }
}
