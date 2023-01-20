package pt.fyld.application.service;

import pt.fyld.application.mapper.PessoaMapper;
import pt.fyld.domain.entity.Pessoa;
import pt.fyld.domain.repository.PessoaRepository;
import pt.fyld.application.model.PessoaDTO;

import java.util.ArrayList;
import java.util.List;

public class PessoaService{
    private PessoaRepository pessoaRepository = new PessoaRepository();

    private PessoaMapper pessoaMapper = new PessoaMapper();

    public PessoaDTO getPessoa() {
        Pessoa pessoa = pessoaRepository.getPessoa();
        return pessoaMapper.toPessoaDTO(pessoa);
    }

    public List<PessoaDTO> getPessoas(){
        List<PessoaDTO> pessoaDTOList = new ArrayList<>();
        List<Pessoa> pessoaList = pessoaRepository.getPessoas();
        for (Pessoa pessoa : pessoaList) {
            pessoaDTOList.add(pessoaMapper.toPessoaDTO(pessoa));
        }
        return pessoaDTOList;
    }
}
