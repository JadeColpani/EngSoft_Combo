public class Combo {
    private Burger burger = new Burger();
    private Bebida bebida = new Bebida();
    private Sobremesa sobremesa = new Sobremesa();

    public void CriarCombo(int tipo)
    {
        burger.setDescricao("Hamburguer bem passado ");
        bebida.setDescricao("Coca-Cola de ");
        sobremesa.setDescricao("Sundae tamanho ");

        if(tipo == 1)
        {
            burger.setGramas(200);
            bebida.setMl(700);
            sobremesa.setTamanho("Médio");
            burger.setPreco(40.00);
        }
        if(tipo == 2)
        {
            burger.setGramas(150);
            bebida.setMl(500);
            sobremesa.setTamanho("Pequeno");
            burger.setPreco(21.00);
        }
    }

    @Override
    public String toString() {
        return "Combo{" +
                "burger= " + burger.getDescricao()+burger.getGramas() +" g"+
                ", bebida= " + bebida.getDescricao()+bebida.getmL() +" mL"+
                ", sobremesa= " + sobremesa.getDescricao()+sobremesa.getTamanho() +
                "} R$ " +burger.getPreco();
    }


}
