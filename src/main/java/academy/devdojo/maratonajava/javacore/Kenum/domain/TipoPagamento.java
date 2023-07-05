package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento{//É possível criar enums na mesma classe, mas não é recomendado
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);//Métodos abstratos não podem ter corpo
    }