import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu utama
        do {
            System.out.println("\n=== Sistem Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku yang Tersedia");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tambah Anggota");
            System.out.println("6. Tampilkan Anggota");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Menambah buku
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan nama penulis buku: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author);
                    library.addBook(newBook);
                    System.out.println("Buku '" + title + "' telah ditambahkan ke perpustakaan.");
                    break;
                case 2:
                    // Menampilkan buku yang tersedia
                    library.displayAvailableBooks();
                    break;
                case 3:
                    // Meminjam buku
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String borrowTitle = scanner.nextLine();
                    Book bookToBorrow = null;
                    for (Book book : library.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(borrowTitle) && book.isAvailable()) {
                            bookToBorrow = book;
                            break;
                        }
                    }
                    if (bookToBorrow != null) {
                        // Simulasi anggota untuk meminjam
                        System.out.print("Masukkan nama anggota: ");
                        String memberName = scanner.nextLine();
                        Member member = new Member(memberName, 1); // ID anggota dapat dibuat lebih dinamis
                        library.borrowBook(bookToBorrow, member);
                    } else {
                        System.out.println("Buku tidak ditemukan atau sudah dipinjam.");
                    }
                    break;
                case 4:
                    // Mengembalikan buku
                    System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                    String returnTitle = scanner.nextLine();
                    Book bookToReturn = null;
                    for (Book book : library.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(returnTitle) && !book.isAvailable()) {
                            bookToReturn = book;
                            break;
                        }
                    }
                    if (bookToReturn != null) {
                        library.returnBook(bookToReturn);
                    } else {
                        System.out.println("Buku tidak ditemukan atau tidak dalam status dipinjam.");
                    }
                    break;
                case 5:
                    // Menambah anggota
                    System.out.print("Masukkan nama anggota: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Masukkan ID anggota: ");
                    int memberId = scanner.nextInt();
                    Member newMember = new Member(memberName, memberId);
                    library.addMember(newMember);
                    System.out.println("Anggota baru dengan nama '" + memberName + "' telah ditambahkan.");
                    break;
                case 6:
                    // Menampilkan anggota
                    library.displayMembers();
                    break;
                case 7:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }
}
