public class Mahasiswa extends Elemen {
    private int sks;

    public Mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    void cetak () {
        System.out.println(getnama() + " adalah seorang mahasiswa dengan jam sibuk " + jamSibuk) ;
    }
}

