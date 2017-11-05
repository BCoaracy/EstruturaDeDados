
package estruturadedados;

public class No {
    private No proximo;
    private Object elemento;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
    public No getProximo(){
        return proximo;
    }
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
}
