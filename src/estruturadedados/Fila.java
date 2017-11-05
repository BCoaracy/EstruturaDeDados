/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

import sun.misc.Queue;

public class Fila{
        int inicio, fim, qtdElementos, tam, valorInt;
    
    public Object[] fila;
    public int[] prioridade;
            
    public Fila(int tamanho){
        this.tam=tamanho;
        this.inicio = 0;
        this.fim = 0;
        this.qtdElementos = 0;
        this.fila = new Object [this.tam];
        this.prioridade = new int[this.tam];
    }
    
    
    
    public boolean filaCheia(){
        if(this.qtdElementos==this.tam)
            return true;
        else
            return false;
    }
    
    public boolean filaVazia(){
        if(this.qtdElementos==0)
            return true;
        else
            return false;
    }
    
    public void inserir(Object obj){
        if(!filaCheia()){
            this.fila[fim]=obj;
            this.qtdElementos++;
            this.fim++;
            if(this.fim==tam){
                this.fim = 0;
            }    
            
        }else
           System.out.println("Fila cheia");
    }
    
    public void inserirPrioridade(int valor){
        if(!filaCheia()){
            this.prioridade[fim]=valor;
            this.qtdElementos++;
            this.fim++;
            if(this.fim==tam){
                this.fim = 0;
            }    
            
        }else
           System.out.println("Fila cheia");
    }
    
    public Object remover(){
        Object temp = null;
        if(!filaVazia()){
            temp = this.fila[inicio];
            this.fila[inicio] = null;
            this.inicio++;
            this.qtdElementos--;
            if(this.inicio==this.tam){
                this.inicio=0;
            }
        }else{
            System.out.println("Fila Vazia!");
        }
        return temp;
    }
}
