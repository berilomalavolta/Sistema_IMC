package model;

/**
 *
 * @author Eduardo
 */
public class Usuario {

    int id;
    String nome;
    String sobrenome;
    String senha;
    String confirmaSenha;
    String email;
    String desc;
    String tipoUsuario;

    public Usuario() {
        id = 0;
        nome = "";
        sobrenome = "";
        senha = "";
        confirmaSenha = "";
        email = "";
        desc = "";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public String getEmail() {
        return email;
    }

    public String getDesc() {
        return desc;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
