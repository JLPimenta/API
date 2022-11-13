package med.voll.API.model.paciente;

import jakarta.validation.Valid;
import med.voll.API.model.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
                Long id,
                String nome,
                String telefone,
                @Valid DadosEndereco endereco) {

}
