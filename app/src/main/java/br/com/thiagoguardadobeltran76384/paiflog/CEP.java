package br.com.thiagoguardadobeltran76384.paiflog;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 15/09/2017.
 */

public class CEP {

    @SerializedName(value = "cep")
    private String cep;

    @SerializedName(value = "tipoDeLogradouro")
    private String tipoDeLogradouro;

    @SerializedName(value = "logradouro")
    private String logradouro;

    @SerializedName(value = "bairro")
    private String bairro;

    @SerializedName(value = "cidade")
    private String cidade;

    @SerializedName(value = "estado")
    private String estado;



    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoDeLogradouro() {
        return tipoDeLogradouro;
    }

    public void setTipoDeLogradouro(String tipoDeLogradouro) {
        this.tipoDeLogradouro = tipoDeLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
