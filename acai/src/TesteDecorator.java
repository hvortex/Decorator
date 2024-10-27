public class TesteDecorator {
    public static void main(String[] args) {
        // Açaí Simples - Pequeno
        Adicional acaiSimples = new Acai(Tamanho.PEQUENO);
        System.out.println(acaiSimples.getDescricao() + " custa R$ " + acaiSimples.custo());

        // Açaí com Morango - Médio
        Adicional acaiMorango = new Morango(new Acai(Tamanho.MEDIO), Tamanho.MEDIO);
        System.out.println(acaiMorango.getDescricao() + " custa R$ " + acaiMorango.custo());

        // Açaí com Morango, Leite Condensado e Banana - Grande
        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE);
        System.out.println(acaiCompleto.getDescricao() + " custa R$ " + acaiCompleto.custo());
    }
}