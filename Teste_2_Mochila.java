import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MyClass {
    
    public static void main(String args[]) {
      //leitor de dados que vem do "Stdin Inputs"
      Scanner leitorConsole = new Scanner(System.in);
      
      //Lista de objetos que a serem analisados para armazenamento na mochila
      //*****AQUI ESTAMOS USANDO A ESTRUTURA DE DADOS -> LISTA *****
      List listaObjetos = new ArrayList();
      
      //Definicao do peso maximo da mochila (em Kg)
      int pesoMaximoMochila = 15;
      double pesoAtual = 0;
      
      //Representacao de cada objeto que foi indicado no console como parametro.
      //Foi definido aqui que o primeiro numero da linha eh o peso e o segundo numero eh o valor do objeto -> 10,5 (numeros estao separados por ",")
      Objeto objeto = null;
      
      //Vetor de String com 2 POSICOES que armazena cada linha de entrada digitada no console
      //*****AQUI ESTAMOS USANDO A ESTRUTURA DE DADOS -> ARRAY OU VETOR *****
      String[] linhaConsole = new String[2];
  
      try {
            //Loop/Repeticao para percorrer todos os objetos que foram digitados no console
            while (leitorConsole.hasNext()){
                //captura dos valores digitados que estao separados por ","
                linhaConsole = leitorConsole.nextLine().split(",");
                //criacao de cada objeto com seu peso e valor removendo eventuais espacos em branco (-> metodo trim)
                objeto = new Objeto(new Integer(linhaConsole[0].trim()).intValue(), new Double(linhaConsole[1].trim()).doubleValue());
                //Inclusao do objeto recem criado numa lista de objetos que sera usada para desenvolver a solucao
                
                
                //Validando o espaco dentro da mochila
                System.out.println("//////// Consultando status da mcochila! ////////");
                if(pesoMaximoMochila >= pesoAtual ){
                    System.out.println("Ainda podem ser adcionados objetos dentro da mochila!\n");
                    
                    listaObjetos.add(objeto);
                    pesoAtual = pesoAtual + objeto.getPesoSom();
                    
                    System.out.println("//////// PESO //////// \n" + objeto.getPeso());
                    System.out.println("//////// QUANTIDADE //////// \n" + objeto.getQuantidade());
                    System.out.println("//////// PESO PARCIAL //////// \n" + objeto.getPesoSom());
                    System.out.println("//////// PESO TOTAL //////// \n" + pesoAtual + "\n");
                    
                    if(pesoAtual == pesoMaximoMochila){
                        System.out.println("\n//////// Voce acabou de atingir o limite de peso! //////// \n");
                    }
                    
                }else{
                    System.out.println("O limite da mochila ja foi atingido!\n");
                }
            }
            
            
        
            System.out.println("\nQuantidade de objetos que sendo analisados: " + listaObjetos.size());
            System.out.println("Valor total de peso dentro da mochila: " + pesoAtual);
            System.out.println("Peso maximo suportado pela mochila: " + pesoMaximoMochila + " kg");
            if(pesoMaximoMochila < pesoAtual){
                System.out.println("O valor foi excedido em " + (pesoAtual - pesoMaximoMochila) + "Kg");
            }
            
            
            /*for( int i; i < listaObjetos.size(); i++){
                System.out.println(listaObjetos);
            }*/
                    
                    
            /*A PARTIR DAQUI E O RECHEIO COM A LOGICA PARA DEFINIR QUAIS OBJETOS
            DEVEM SER COLOCADOS DENTRO DA MOCHILA PARA MAXIMIZAR O VALOR
            POREM CONSIDERANDO O PESO LIMITE QUE A MOCHILA SUPORTA!*/
            
            //DICAS
            //Ja temos a lista de objetos pronta -> listaObjetos
            //E podemos acessar o peso e valor de cada objeto dessa forma -> objeto.getPeso(), objeto.getQuantidade()()
            
            
            
       } catch (Exception e){
            System.out.println(e);
       } finally {
           leitorConsole.close();
       }
    }
}