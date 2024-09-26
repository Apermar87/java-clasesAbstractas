import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animales = new ArrayList<>();

        Perros p = new Perros();
        animales.add(p);

        Lobo l = new Lobo();
        animales.add(l);

        Leones le = new Leones();
        animales.add(le);

        Gatos g = new Gatos();
        animales.add(g);
        
        for (Animal animal : animales) {
            System.out.println(animal.getNombreCientifico());
            System.out.println(animal.getSonido());
            System.out.println(animal.getAlimentos());
            System.out.println(animal.getHabitat() + "\n");
        }
    }
}
