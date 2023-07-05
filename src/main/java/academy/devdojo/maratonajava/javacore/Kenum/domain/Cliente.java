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
        return String.format(
                """
                --------------------
                
                Cliente {
                        Nome do Cliente = '%s'
                        Tipo do Cliente = %s
                        Número do tipo = %d
                        Tipo de Pagamento = %s
                }
                """,
                nome,
                tipoCliente.getNomeRelatorio(),
                tipoCliente.getValor(),
                tipoPagamento
        );
    }

}