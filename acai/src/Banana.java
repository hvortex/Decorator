public class Banana extends BaseDecorator {
    private Tamanho tamanho;

    public Banana(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo() {
        double adicional = 0;
        switch (tamanho) {
            case PEQUENO:
                adicional = 0.75;
                break;
            case MEDIO:
                adicional = 1.25;
                break;
            case GRANDE:
                adicional = 1.75;
                break;
        }
        return wrappee.custo() + adicional;
    }
}