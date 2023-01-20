package pt.fyld.application.mapper;

import pt.fyld.application.model.PessoaDTO;
import pt.fyld.domain.entity.Pessoa;
import pt.fyld.domain.repository.PessoaRepository;

public class PessoaMapper {

    public PessoaDTO toPessoaDTO(Pessoa pessoa){
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setNome(pessoa.getNome());
        pessoaDTO.setMatricula(pessoa.getMatricula());
        return pessoaDTO;
    }
}
