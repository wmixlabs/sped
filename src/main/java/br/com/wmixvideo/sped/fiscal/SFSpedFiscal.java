package br.com.wmixvideo.sped.fiscal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFBloco;

public class SFSpedFiscal {

    private final SFBloco bloco0, blocoA, blocoC, blocoD, blocoE, blocoG, blocoH, blocoK, bloco1, bloco9;

    public SFSpedFiscal() {
        this.bloco0 = new SFBloco();
        this.blocoA = new SFBloco();
        this.blocoC = new SFBloco();
        this.blocoD = new SFBloco();
        this.blocoE = new SFBloco();
        this.blocoG = new SFBloco();
        this.blocoH = new SFBloco();
        this.blocoK = new SFBloco();
        this.bloco1 = new SFBloco();
        this.bloco9 = new SFBloco();
    }

    public List<String> gerarSpedFiscal() {
        final List<SFLinha> linhas = new ArrayList<>();
        this.getBlocos().forEach(b -> linhas.addAll(b.getLinhas()));
        return linhas.stream().map(SFLinha::toString).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this.gerarSpedFiscal()).concat(System.lineSeparator());
    }

    public List<SFBloco> getBlocos() {
        return Arrays.asList(this.bloco0, this.blocoA, this.blocoC, this.blocoD, this.blocoE, this.blocoG, this.blocoH, this.blocoK, this.bloco1, this.bloco9);
    }

    public SFBloco getBloco0() {
        return this.bloco0;
    }

    public SFBloco getBlocoA() {
        return this.blocoA;
    }

    public SFBloco getBlocoC() {
        return this.blocoC;
    }

    public SFBloco getBlocoD() {
        return this.blocoD;
    }

    public SFBloco getBlocoE() {
        return this.blocoE;
    }

    public SFBloco getBlocoG() {
        return this.blocoG;
    }

    public SFBloco getBlocoH() {
        return this.blocoH;
    }

    public SFBloco getBlocoK() {
        return this.blocoK;
    }

    public SFBloco getBloco1() {
        return this.bloco1;
    }

    public SFBloco getBloco9() {
        return this.bloco9;
    }
}
