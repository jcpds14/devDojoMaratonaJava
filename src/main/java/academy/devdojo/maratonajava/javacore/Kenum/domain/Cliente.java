package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private final TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return String.format("--------------------\n Cliente { \nNome do Cliente = '%s' \nTipo do Cliente = %s " +
                        "\nNúmero do tipo = %d \nTipo de Pagamento = %s \n}",
                nome,
                tipoCliente.getNomeRelatorio(),
                tipoCliente.getValor(),
                tipoPagamento
        );
    }

}