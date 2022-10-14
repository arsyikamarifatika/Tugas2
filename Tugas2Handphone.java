
public class Tugas2Handphone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHandphone(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    public String getJenis_hp() {
        return jenis_hp;
    }

    public void setJenis_hp(String jenis_hp) {
        this.jenis_hp = jenis_hp;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    public void setTahun_pembuatan(int tahun_pembuatan) {
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public static void main(String[] args) {
        Tugas2Handphone hp = new Tugas2Handphone();
        hp.setDataHandphone("iPhone", 2022);
        System.out.println("Jenis Handphone : " + hp.getJenis_hp());
        System.out.println("Tahun pembuatan : " + hp.getTahun_pembuatan());
    }
}
