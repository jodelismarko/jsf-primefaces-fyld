package pt.fyld.service;

import pt.fyld.model.Pessoa;
import pt.fyld.repository.PessoaRepository;

import java.util.List;

public class PessoaService{
    private PessoaRepository pessoaRepository = new PessoaRepository();

    public Pessoa getPessoa() {
        return pessoaRepository.getPessoa();
    }

    public List<Pessoa> getPessoas(){
        return pessoaRepository.getPessoas();
    }
}
