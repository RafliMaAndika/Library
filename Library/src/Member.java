/**
 * Kelas Member mewakili anggota perpustakaan.
 */
public class Member {
    private String name;
    private int memberId;

    /**
     * Konstruktor untuk membuat anggota baru.
     * @param name Nama anggota.
     * @param memberId ID anggota.
     */
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    /**
     * Mendapatkan nama anggota.
     * @return Nama anggota.
     */
    public String getName() {
        return name;
    }

    /**
     * Mengembalikan representasi string dari anggota.
     * @return Informasi anggota (nama dan ID).
     */
    @Override
    public String toString() {
        return "Anggota: " + name + " (ID: " + memberId + ")";
    }
}
