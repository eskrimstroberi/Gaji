package pholimorphisme;
   public class owner extends pegawai {
    private static int gajiowner=3000000;
    private static int uangMakan=10000000;
    private static final String posisi="Owner";
    
    public int gaji(){
        return gajiowner;
    }
    public int uangMakan(){
        return uangMakan;
    }
    public String posisi(){
        return posisi;
    }
} 

