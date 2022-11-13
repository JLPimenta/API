package med.voll.API.model.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.API.model.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
