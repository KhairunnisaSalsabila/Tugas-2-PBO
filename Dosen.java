public class Dosen extends Elemen {
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        jamSibuk = jumlahHariKerja * 8;
    }
    
    public int getJamSibuk() {
        return jamSibuk;
    }

    void cetak () {
        System.out.println(getnama() + " adalah seorang dosen dengan jam sibuk " + jamSibuk);
    }
}


