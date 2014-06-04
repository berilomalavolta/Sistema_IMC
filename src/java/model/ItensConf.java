/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Berilo
 */
public class ItensConf {
private int id;
private float valor;
private String classificacao;
private int validade;
private String estado;
private Date date;

private String tipo;

//hardware
private String sn;
private String patrimonio;
private String tipo_eqpto;
private String modelo;
private String descricao;
private String local_isnt;

//software
private String soft_licenca;
private String nome;
private String plataforma;
private String funcao;

//documentação
private String titulo;
private String versao;
private String doc_licenca;
private ArrayList responsaveis;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getTipo_eqpto() {
        return tipo_eqpto;
    }

    public void setTipo_eqpto(String tipo_eqpto) {
        this.tipo_eqpto = tipo_eqpto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal_isnt() {
        return local_isnt;
    }

    public void setLocal_isnt(String local_isnt) {
        this.local_isnt = local_isnt;
    }

    public String getSoft_licenca() {
        return soft_licenca;
    }

    public void setSoft_licenca(String soft_licenca) {
        this.soft_licenca = soft_licenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getDoc_licenca() {
        return doc_licenca;
    }

    public void setDoc_licenca(String doc_licenca) {
        this.doc_licenca = doc_licenca;
    }

    public ArrayList getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(ArrayList responsaveis) {
        this.responsaveis = responsaveis;
    }
    
    



}