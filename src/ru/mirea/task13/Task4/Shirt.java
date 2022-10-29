package ru.mirea.task13.Task4;

public class Shirt {

    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    public static Shirt[] convertToShirt(String[] stringShirts){
        Shirt[] shirts = new Shirt[stringShirts.length];
        for (int i = 0; i < stringShirts.length; i++){
            shirts[i] = new Shirt();
            shirts[i].setInfo(stringShirts[i]);
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "info: " + info;
    }
}
