package estDat.estDatLin;


public class ListaSE<T> implements Lista<T>{
    T ini;
    ListaSE<T> sig;
    public ListaSE(){
        ini = null; 
        sig = null;
    } 
    public boolean esVacia(){
        return ini == null;
    }
    public void insertar(T dato){
        if(esVacia()){
            ini = dato;
            sig = new ListaSE<T>();
        }else{
            sig.insertar(dato);
        }
    }
    public T eliminar(int pos){
        return null;
    }
    public T acceder(int pos){
        return null;  
    }
    public int longitud(){
        int longitud;
        if(esVacia()){
            longitud = 0;
        }else{
            longitud = 1 + sig.longitud();
        }
        return longitud;
    }
    
    
}
