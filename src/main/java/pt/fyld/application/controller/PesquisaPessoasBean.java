package pt.fyld.application.controller;

import pt.fyld.application.service.PessoaService;
import pt.fyld.application.model.PessoaDTO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class PesquisaPessoasBean{

    private PessoaService pessoaService = new PessoaService();

    public PessoaDTO getPessoa(){
        return pessoaService.getPessoa();
    }

    public List<PessoaDTO> getPessoas(){
        return pessoaService.getPessoas();
    }

}
