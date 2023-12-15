package model;

public class Mahasiswa {
    private String nim;
    private String prodi; 
    private String nama;  
    private String idProdi;  

    public String getIdProdi() {
        return idProdi;
    }


    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }


    public String getNim() {
        return nim;
    }
    

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String idProdi) {
        this.nim = nim;
        this.nama = nama;
        this.idProdi = idProdi;
    }
}
