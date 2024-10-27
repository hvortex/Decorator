public class Morango extends BaseDecorator {
    private Tamanho tamanho;

    public Morango(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Morango";
    }

    @Override
    public double custo() {
        double adicional = 0;
        switch (tamanho) {
            case PEQUENO:
                adicional = 1.00;
                break;
            case MEDIO:
                adicional = 1.50;
                break;
            case GRANDE:
                adicional = 2.00;
                break;
        }
        return wrappee.custo() + adicional;
    }
}