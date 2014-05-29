package model;

import java.sql.Date;

/**
 *
 * @author Eduardo
 */
public class Chamado {

    int id;
    String tipoChamado;
    String descChamado;
    Date dataChamado;
    Date dataResolucao;

    public int getId() {
        return id;
    }

    public String getTipoChamado() {
        return tipoChamado;
    }

    public String getDescChamado() {
        return descChamado;
    }

    public Date getDataChamado() {
        return dataChamado;
    }

    public Date getDataResolucao() {
        return dataResolucao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoChamado(String tipoChamado) {
        this.tipoChamado = tipoChamado;
    }

    public void setDescChamado(String descChamado) {
        this.descChamado = descChamado;
    }

    public void setDataChamado(Date dataChamado) {
        this.dataChamado = dataChamado;
    }

    public void setDataResolucao(Date dataResolucao) {
        this.dataResolucao = dataResolucao;
    }
    

}
