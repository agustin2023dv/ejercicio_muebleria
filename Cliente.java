import java.util.ArrayList;

public class Cliente extends Persona{


    private ArrayList<Item>articulosComprados;

    public Cliente(String nombre, int dni) {
        super(nombre, dni);
        setArticulosComprados(new ArrayList<Item>());
    }

    public ArrayList<Item> getArticulosComprados() {
        return articulosComprados;
    }

    public void setArticulosComprados(ArrayList<Item> articulosComprados) {
        this.articulosComprados = articulosComprados;
    }

    public void reservarArticulo(Item articulo){
            articulo.setEstaReservado(true);
    }

    public void comprarArticulo(Item articulo){
        if(articulo.isEstaReservado())return;
        articulosComprados.add(articulo);
    }

}
