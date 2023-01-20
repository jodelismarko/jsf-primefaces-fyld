package pt.fyld.controller;

import pt.fyld.model.Pessoa;
import pt.fyld.service.PessoaService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class PesquisaPessoasBean{

    private PessoaService pessoaService = new PessoaService();

    public Pessoa getPessoa(){
        return pessoaService.getPessoa();
    }

    public List<Pessoa> getPessoas(){
        return pessoaService.getPessoas();
    }

}
