public class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    void cetak() { //upcasting
        System.out.println(getnama() + " adalah seorang asdos dengan jam sibuk " + jamSibuk);
    }
    
}

