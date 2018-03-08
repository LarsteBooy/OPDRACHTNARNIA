package nl.Lars;

import java.util.Random;

public enum Material {
    GLASS, WOODEN, IRON, STONE;

    public static Material randomMaterial(){
        return Material.values()[new Random().nextInt(Material.values().length)];
    }

    public static int materialStrenght(Material material){

        int strenght = 0;

        switch (material){
            case GLASS:
                strenght = 10;
                break;
            case WOODEN:
                strenght = 20;
                break;
            case IRON:
                strenght = 50;
                break;
            case STONE:
                strenght = 35;
                break;
        }
        return strenght;
    }
}