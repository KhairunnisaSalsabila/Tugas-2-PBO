public class JamSibuk {
    public static void main(String[] args) throws Exception {
        Asdos a = new Asdos("Fairuzikun", 22, 7);
        Dosen b = new Dosen("Raja OP Damanik", 5);
        Asdos c = new Asdos("Angel-chan", 20, 4);
        Mahasiswa d = new Mahasiswa("Firman", 20);
        Mahasiswa e = new Mahasiswa("Nid to pass this sem", 23);
        Dosen f = new Dosen("Nivotko", 3);
        
        a.cetak();
        b.cetak();
        c.cetak();
        d.cetak();
        e.cetak();
        f.cetak();

        int totalJamSibuk = a.jamSibuk + b.jamSibuk + c.jamSibuk + d.jamSibuk + e.jamSibuk + f.jamSibuk;
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);

    }
}


