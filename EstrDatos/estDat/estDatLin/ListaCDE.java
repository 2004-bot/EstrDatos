package estDat.estDatLin;

public class ListaCDE<T> implements Lista<T>{
    NodoDE<T> ini;
    public ListaCDE(){
        ini = null;
    }
    public boolean esVacia(){
        return ini == null;
    }
    public void insertar(T dato){
        NodoDE<T> p,ult;
        p = new NodoDE<T>(dato);
        if(esVacia()){
            ini = p;
            ini.setSuc(ini);
            ini.setAnt(ini);
        }else{
            ult = ini.getAnt();
            ult.setSuc(p);
            p.setAnt(ult);
            p.setSuc(ini);
            ini.setAnt(p);
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
            longitud = contar(ini);
        }
        return longitud;
    }
    private int contar(NodoDE<T> q){
        int contador;
        if(q.getSuc() == ini){
            contador = 1;
        }else{
            contador = 1 + contar(q.getSuc());
        }
        return contador;
    }
}
