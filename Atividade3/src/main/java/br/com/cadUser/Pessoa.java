package br.com.cadUser;

import java.util.ArrayList;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class Pessoa {
    private String nome;
    private ArrayList<String> nomes = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        if (!nomes.isEmpty()) {
            return nomes.get(nomes.size() - 1);
        }
        return "";
    }

    public void adicionarNome() {
        nomes.add(nome);
    }
}
