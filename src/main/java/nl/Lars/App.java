package nl.Lars;

public class App 
{
    public static void main( String[] args ) {



            Wardrobe A = new Wardrobe(Material.randomMaterial());
            { //MAAK HIER KAST AAN MET BEPAALD MATERIAAL
                System.out.println("While hide and seeking Lucy comes across a " + A.getMaterial() + " wardrobe");
                System.out.println(Material.materialStrenght(A.getMaterial()));
            }

            Lucy person = new Lucy();
            { //MAAK HIER EEN PERSOON AAN
                System.out.println(person.strenghtLucy);
            }


                System.out.println("Lucy kicks the wardrobe for no good reason");


            if (person.strenghtLucy > Material.materialStrenght(A.getMaterial())) {
                A.isDestroyed = true;
                System.out.println("Kut, de kast gaat kapot");
                System.out.println(A.isDestroyed);
            } else {
                // Kom de heks tegen
            }
        }


}
