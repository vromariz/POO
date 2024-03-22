public class Lutador {

    String nome;
    Double energia;
    Double força;

    public Lutador(String nome, Double energia, double força) {
        this.nome = nome;
        this.energia = energia;
        this.força = força;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public double getForça() {
        return força;
    }

    public void setForça(Double força) {
        this.força = força;
    }

    public void reduzirEnergia (Double quantidade){
        energia -= quantidade;

        if (energia < 0){
            energia = (double) 0;
        }

    }

    public void aplicarGolpe (Lutador inimigo){
        inimigo.reduzirEnergia(força);
        System.out.println(nome + "golpeou " + inimigo.nome);
        System.out.println(inimigo.energia + "teve sua energia reduzida para " + inimigo.energia);
    }
}