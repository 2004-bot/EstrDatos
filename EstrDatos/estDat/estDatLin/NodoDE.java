package estDat.estDatLin;
public class NodoDE<T>{
    private NodoDE<T> ant;
    private T dato;
    private NodoDE<T> suc;
    public NodoDE(T dato){
        ant = suc = null;
        this.dato = dato;
    }
    public void setAnt(NodoDE<T> a){
        ant = a;
    }
    public void setSuc(NodoDE<T> s){
        suc = s;
    }
    public NodoDE<T> getAnt(){
        return ant;
    }
    public NodoDE<T> getSuc(){
        return suc;
    }
}
