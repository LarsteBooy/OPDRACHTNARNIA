package nl.Lars;

public class Wardrobe {

    private Material material;
    public boolean isDestroyed = false;

    public Material getMaterial(){
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Wardrobe(Material material) {
        this.material = material;
    }


}
