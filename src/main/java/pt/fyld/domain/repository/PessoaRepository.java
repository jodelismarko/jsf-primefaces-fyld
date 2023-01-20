package pt.fyld.domain.repository;

import pt.fyld.domain.entity.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class PessoaRepository {

    private Pessoa pessoa = new Pessoa();

    private List<Pessoa> pessoas = new ArrayList<Pessoa>();


    Random gerador = new Random();

    List<String> itens = Arrays.asList("Teste", "Marko", "Felipe","Cladio","Ana","Daniela","Fernanda","Cristina","Teo","Pedro");


    public Pessoa getPessoa() {
        pessoa.setNome("jodelismarko");
        pessoa.setMatricula("200365");
        return pessoa;
    }

    public List<Pessoa> getPessoas() {
        if(pessoas.isEmpty()){
            for (int i = 0; i < 10; i++) {
                Pessoa novaPessoa = new Pessoa();
                novaPessoa.setNome(itens.get(gerador.nextInt(9)+ 0));
                novaPessoa.setMatricula(String.valueOf((gerador.nextInt(56498)+ 98763)));
                pessoas.add(novaPessoa);
            }
        }
        return pessoas;
    }
}
