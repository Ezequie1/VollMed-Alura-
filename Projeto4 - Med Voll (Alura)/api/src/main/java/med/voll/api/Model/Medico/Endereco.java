package med.voll.api.Model.Medico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.getLogradouro();
        this.bairro = endereco.getBairro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.cidade = endereco.getCidade();
        this.uf = endereco.getUf();
    }

    public void atualizaEndereco(DadosEndereco dados) {
        if (dados.getLogradouro() != null){
            this.logradouro = dados.getLogradouro();
        }
        if (dados.getBairro() != null){
            this.bairro = dados.getBairro();
        }
        if (dados.getCep() != null){
            this.cep = dados.getCep();
        }
        if (dados.getNumero() != null){
            this.numero = dados.getNumero();
        }
        if (dados.getCidade() != null){
            this.cidade = dados.getCidade();
        }
        if (dados.getUf() != null){
            this.uf = dados.getUf();
        }
        if (dados.getComplemento() != null){
            this.complemento = dados.getComplemento();
        }
    }
}
