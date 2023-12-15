package model;


public class Prodi {
        private String idprodi;
        private String namaprodi;
    
        public Prodi(String idprodi, String namaProdi) {
            this.idprodi = idprodi;
            this.namaprodi = namaProdi;
        }

    public String getIdprodi() {
        return idprodi;
    }

    public void setIdprodi(String idprodi) {
        this.idprodi = idprodi;
    }

    public String getNamaprodi() {
        return namaprodi;
    }

    public void setNamaprodi(String namaprodi) {
        this.namaprodi = namaprodi;
    }

    public void crud(String idprodi){
        if (idprodi == getIdprodi()){
            
        }
    }

}

