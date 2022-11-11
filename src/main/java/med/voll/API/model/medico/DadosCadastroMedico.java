package med.voll.API.model.medico;

import med.voll.API.model.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
        DadosEndereco endereco) {

}
