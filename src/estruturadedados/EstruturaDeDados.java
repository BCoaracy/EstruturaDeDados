package estruturadedados;

import java.util.*;

public class EstruturaDeDados {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Pilha pia = new Pilha();
        Pilha pia2 = new Pilha();
        Pilha metPilhas = new Pilha();
        int menu = -1;
        
        while(menu != 0){
            
            System.out.println("Informe o numero do exercicio: ");
            menu = sc.nextInt(); sc.nextLine();
            
            switch (menu){               
                
                case 1:
                    for (int i = 0;i<5;i++){
                        System.out.println("Valor?");
                        int valor = sc.nextInt();
                        pia.empilhar(valor);

                        System.out.println("Valor da segunda pilha:");
                        valor = sc.nextInt();
                        pia2.empilhar(valor);
                    }

                    if(metPilhas.pilhaIgual(pia, pia2)){
                        System.out.println("Pilhas Iguais!");
                    }
                    
                break;
                
                case 2:
                    System.out.println("Caguei... coloque a porra da expressão");

                    String coisa; 
                    coisa = sc.nextLine();
                    
                    pia = metPilhas.empilhadoramentoStrings(coisa);
                    System.out.println("Tamanho da pilha " + pia.tamanho());
                    pia.imprimirPilha();
                break;
                
                case 3:
                    
                    String placa;
                    Object aux;
                    String menu3 = null;
                    int manobras = 0;
                    Pilha pilhaCarros = new Pilha(10);
                    Pilha pilhaCarrosAux = new Pilha();
                    int saida = -1;
                    while(saida != 0){
                        System.out.println("Bem vindo ao Estacionamento Ruim");
                        System.out.println("Informe a placa do veículo desejado");
                        placa = sc.nextLine();
                        System.out.println("Informe entrada (E), saida (S)");
                        menu3 = sc.nextLine();
                        switch (menu3){

                            case "E":
                                if(pilhaCarros.full()){
                                    System.out.println("Não há vagas!");
                                }
                                    pilhaCarros.empilhar(placa);
                            break;
                            case "S":
                                boolean parar = false;
                                while(parar==false){
                                   aux = pilhaCarros.desempilhar();
                                   pilhaCarrosAux.empilhar(aux);
                                   manobras ++;
                                   if(aux.equals(placa)){
                                       parar=true;
                                   }
                                }
                                if(manobras>1){
                                    for(int i=0;i<manobras;i++){
                                        pilhaCarros.empilhar(pilhaCarrosAux.desempilhar());
                                    }
                                }
                                System.out.println("Numero de manobras: " + manobras);
                                pilhaCarros.imprimirPilha();
                            break;
                        }
                        
                        System.out.println("\nSe desejar sair digite 0;");
                        saida = sc.nextInt(); sc.nextLine();
                    }
                    
                break;
            }
//--------------------------------------------------------------------------------------------
            
        }
        Fila fila4 = new Fila(10);
        Fila fila5 = new Fila(10);
        Fila fila6 = new Fila(10);
        System.out.println("Informe os elementos n");
        int n = 0;
        while(!fila4.filaCheia()){
            n = sc.nextInt();
            fila4.inserirPrioridade(n);
        }
        System.out.println("Informe o valor que quer que seja feita a divisão");    
        int p = 0;
            p = sc.nextInt();
        for(int i = 0; i<fila4.tam;i++){
            if(fila4.prioridade[i]<=p){
                fila5.inserir(fila4.prioridade[i]);
            }else{
                fila6.inserir(fila4.prioridade[i]);
            }
        }
        System.out.println("Fila até a parada");
        for(int i =0; i<fila5.fim;i++){
            System.out.println(" " + fila5.fila[i]);
        }
        System.out.println("Outra Fila");
        for(int i =0; i<fila6.fim;i++){
            System.out.println(" " + fila6.fila[i]);
        }
    */
        
        //String elem;
        //adicionarElemento(filaE);
        FilaEncadeada filaE = new FilaEncadeada();
        
        
        filaE.adicionar("Bruno");
        filaE.adicionar("Andressa");
        filaE.adicionar("Brownie");
        
        while(filaE.temProximo()){
            System.out.println(filaE.getPosicaoAtual().getElemento());
        }
        
        System.out.println("Tamanho da fila -> " + filaE.size());
        
        filaE.remover();
        System.out.println("");
        while(filaE.temProximo()){
            System.out.println(filaE.getPosicaoAtual().getElemento());
        }
        
            
    }
    private static void adicionarElemento(FilaEncadeada filaE){
        No no1 = new No();
        No no2 = new No();
        No no3 = new No();
        no1.setElemento("Bruno");
        no2.setElemento("Andressa");
        no3.setElemento("Brownie");
        filaE.adicionar(no1);
        filaE.adicionar(no2);
        filaE.adicionar(no3);
    }
}
