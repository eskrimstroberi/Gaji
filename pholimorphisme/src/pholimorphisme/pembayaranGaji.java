package pholimorphisme;
 public class pembayaranGaji {
    
    public String posisi (pegawai pos){
        String position=pos.posisi();
        if (pos instanceof direktur)
            position=((direktur)pos).posisi();
        if (pos instanceof staf)
            position=((staf)pos).posisi();
        if (pos instanceof owner)
            position=((owner)pos).posisi();
        return position;
    }

    public int hitungGaji(pegawai peg){
        int uang=peg.gaji();
        if (peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        
        if (peg instanceof staf)
            uang+=((staf)peg).bonusstaf();
        
        if (peg instanceof owner)
            uang+=((owner)peg).uangMakan();
        
        return uang;

    }
    public static void main(String[] args) {
        pegawai nama=new pegawai();
        pembayaranGaji pg = new pembayaranGaji();
       
       
        //STAF
        staf ali = new staf();
        nama.pegawai("ali");
        System.out.println("posisi\t\t="+pg.posisi(ali));
        System.out.println("gaji staf\t="+pg.hitungGaji(ali));
        System.out.println("================================");
        
        //DIREKTUR
        direktur Tony = new direktur();
        nama.pegawai("Tony");
        System.out.println("posisi\t\t="+pg.posisi(Tony));
        System.out.println("gaji direktur\t="+pg.hitungGaji(Tony));
        System.out.println("================================");
        
        //OWNER
        owner Nata = new owner();
        nama.pegawai("Nata");
        System.out.println("posisi\t\t="+pg.posisi(Nata));
        System.out.println("gaji owner\t="+pg.hitungGaji(Nata));
        System.out.println("================================");

    }
    
}   

