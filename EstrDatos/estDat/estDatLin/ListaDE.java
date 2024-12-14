  package estDat.estDatLin;

public class ListaDE<T> implements Lista<T>{
    NodoDE<T> ini;
    public boolean esVacia(){
        return ini == null;
    }
    public void insertar(T dato){
        if(esVacia()){
            ini = dato;
        }else{
                
        }
    }
    public T eliminar(int pos){
        return null;
    }
    public T acceder(int pos){
        return null;  
    }
}
