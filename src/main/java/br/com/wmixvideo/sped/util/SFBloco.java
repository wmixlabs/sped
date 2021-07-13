package br.com.wmixvideo.sped.util;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;

import java.util.ArrayList;
import java.util.List;

public class SFBloco {

    private final List<SFLinha> linhas;

    public SFBloco() {
        this.linhas = new ArrayList<>();
    }

    public SFBloco addLinha(SFLinha linha) {
        this.linhas.add(linha);
        return this;
    }

    public SFBloco addLinhas(List<SFLinha> linhas) {
        for (SFLinha linha : linhas) {
            addLinha(linha);
        }
        return this;
    }

    public int getNumeroLinhas() {
        return this.getLinhas().size();
    }

    public List<SFLinha> getLinhas() {
        return this.linhas;
    }
}
