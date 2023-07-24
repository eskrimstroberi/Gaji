package pholimorphisme;  
public class direktur extends pegawai {
    private static final int gajidir=100000;
    private static final int tunjangan=50000;
    private static final String posisi="Direktur";
    
    public int gaji(){
    return gajidir;
}
    public int tunjangan(){
        return tunjangan;
    }
    public String posisi(){
        return posisi;
    }
}
