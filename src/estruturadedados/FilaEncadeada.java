package estruturadedados;

public class FilaEncadeada {
    private No inicio;
    private No fim;
    private No posicaoAtual;
    
    public void adicionar (Object elemento){
        No no = new No();
        no.setElemento(elemento);
        if(inicio == null && fim == null){
            inicio = no;
            fim = no;
        }else{
            fim.setProximo(no);
            fim = no;
            fim.setProximo(inicio);
            
        }
    }
    public Object remover(){
        No no = new No();
        if(inicio != null && fim != null){
            no.setElemento(inicio.getElemento());
            
            return no;
        }
        else{
            System.out.println("Erro");
            return null;
        }
    }
    
    public boolean temProximo(){
        if(inicio == null){
            return false;
        } else if (posicaoAtual == null){
            posicaoAtual = inicio;
            return true;
        } else {
            boolean temProximo = posicaoAtual.getProximo() != inicio;
            posicaoAtual = posicaoAtual.getProximo();
            return temProximo;
        }
    }
    
    public int size(){
        int numeroNos=0;
        do{    
            numeroNos++;
        }while(this.temProximo());
            return numeroNos;
    }
    
    public No getPosicaoAtual(){
        return this.posicaoAtual;
    }
    
}
