/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author rasyid
 */
@Entity
public class SoalPilihanJawaban extends Additional implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100, nullable = false)
    private String pilihan;
    @Column(length = 1000, nullable = false)
    private String pilihanjawaban;
    @Column(length = 1000, nullable = false)
    private boolean kuncijawaban;
    @ManyToOne
    private Soal soal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoalPilihanJawaban)) {
            return false;
        }
        SoalPilihanJawaban other = (SoalPilihanJawaban) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SoalPilihanJawaban[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }


    /**
     * @return the pilihanjawaban
     */
    public String getPilihanjawaban() {
        return pilihanjawaban;
    }

    /**
     * @param pilihanjawaban the pilihanjawaban to set
     */
    public void setPilihanjawaban(String pilihanjawaban) {
        this.pilihanjawaban = pilihanjawaban;
    }

    /**
     * @return the kuncijawaban
     */
    public boolean isKuncijawaban() {
        return kuncijawaban;
    }

    /**
     * @param kuncijawaban the kuncijawaban to set
     */
    public void setKuncijawaban(boolean kuncijawaban) {
        this.kuncijawaban = kuncijawaban;
    }

    /**
     * @return the soal
     */
    public Soal getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(Soal soal) {
        this.soal = soal;
    }

    /**
     * @return the pilihan
     */
    public String getPilihan() {
        return pilihan;
    }

    /**
     * @param pilihan the pilihan to set
     */
    public void setPilihan(String pilihan) {
        this.pilihan = pilihan;
    }
    
}
