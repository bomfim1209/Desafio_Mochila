public class Objeto {
    int quantidade = 0;
    double peso = 0.0, pesoSom = 0;
    //double pesoAnt = 0, pesoAtual = 0;
    
    
    public Objeto(int quantidade, double peso){
        this.peso = peso;
        this.quantidade = quantidade;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    
    public double getPesoSom(){
        pesoSom = peso * quantidade;
        return this.pesoSom;
    }
    
    
    /*public double getPesoTotal(){
        pesoAtual = pesoAtual + getPesoSom();
        return pesoAtual;
    }*/
    
    
}