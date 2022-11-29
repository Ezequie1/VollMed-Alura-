package med.voll.api.Controller;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Model.Medico.DadosEndereco;

public class DadosAtualizacaoMedico {
    @NotNull
    private long id;
    private String nome;
    private String telefone;
    private DadosEndereco endereco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }
}
