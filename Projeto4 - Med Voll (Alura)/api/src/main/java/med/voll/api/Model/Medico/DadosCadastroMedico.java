package med.voll.api.Model.Medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.Model.Especialidade;

public class DadosCadastroMedico {

    @NotBlank  //NotNull(Não pode ser null) e NotBlank(Não pode ser vazio e nem null)
    private String nome;
    @NotBlank @Email
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank @Pattern(regexp = "\\d{4,6}") //@Patern impõe um padrão de digitos, nesse caso de 4 a 6 dígitos.
    private String crm;
    @NotNull //Para Enums e Classes é utilizado somente a anotação @NotNull
    private Especialidade especialidade;
    @NotNull @Valid //O @Valid serve para que as validações que há na classe DadosEndereço sejam validadas tambem.
    private DadosEndereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }
}
