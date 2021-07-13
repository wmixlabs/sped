package br.com.wmixvideo.sped.fiscal.enums;

public enum SFDocumentoModelo {

    NOTA_FISCAL("01"),
    NOTA_FISCAL_AVULSA("1B"),
    NOTA_FISCAL_DE_VENDA_A_CONSUMIDOR("02"),
    CUPOM_FISCAL("2D"),
    CUPOM_FISCAL_BILHETE_DE_PASSAGEM("2E"),
    NOTA_FISCAL_DE_PRODUTOR("04"),
    NOTA_FISCAL_CONTA_DE_ENERGIA_ELETRICA("06"),
    NOTA_FISCAL_DE_SERVICO_DE_TRANSPORTE("07"),
    CONHECIMENTO_DE_TRANSPORTE_RODOVIARIO_DE_CARGAS("08"),
    CONHECIMENTO_DE_TRANSPORTE_DE_CARGAS_AVULSO("8B"),
    CONHECIMENTO_DE_TRANSPORTE_AQUAVIARIO_DE_CARGAS("09"),
    CONHECIMENTO_AEREO("10"),
    CONHECIMENTO_DE_TRANSPORTE_FERROVIARIO_DE_CARGAS("11"),
    BILHETE_DE_PASSAGEM_RODOVIARIO("13"),
    BILHETE_DE_PASSAGEM_AQUAVIARIO("14"),
    BILHETE_DE_PASSAGEM_E_NOTA_DE_BAGAGEM("15"),
    BILHETE_DE_PASSAGEM_FERROVIARIO("16"),
    RESUMO_DE_MOVIMENTO_DIARIO("18"),
    NOTA_FISCAL_DE_SERVICO_DE_COMUNICACAO("21"),
    NOTA_FISCAL_DE_SERVICO_DE_TELECOMUNICACAO("22"),
    CONHECIMENTO_DE_TRANSPORTE_MULTIMODAL_DE_CARGAS("26"),
    NOTA_FISCAL_DE_TRANSPORTE_FERROVIARIO_DE_CARGA("27"),
    NOTA_FISCAL_CONTA_DE_FORNECIMENTO_DE_GAS_CANALIZADO("28"),
    NOTA_FISCAL_CONTA_DE_FORNECIMENTO_DE_AGUA_CANALIZADA("29"),
    NOTA_FISCAL_ELETRONICA_N_F_E("55"),
    CONHECIMENTO_DE_TRANSPORTE_ELETRONICO("57"),
    CUPOM_FISCAL_ELETRONICO_C_F_E_S_A_T("59"),
    CUPOM_FISCAL_ELETRONICO_C_F_E_E_C_F("60"),
    NOTA_FISCAL_ELETRONICA_PARA_CONSUMIDOR_FINAL_N_F_C_E("65");

    private final String codigo;

    SFDocumentoModelo(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return this.codigo;
    }

    public static SFDocumentoModelo valueOfCodigo(final String codigo) {
        for (final SFDocumentoModelo uf : SFDocumentoModelo.values()) {
            if (uf.getCodigo().equalsIgnoreCase(codigo)) {
                return uf;
            }
        }
        throw new IllegalArgumentException(String.format("O codigo %s n\u00e3o foi encontrado.", codigo));
    }
}
