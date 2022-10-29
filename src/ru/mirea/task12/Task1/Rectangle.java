package ru.mirea.task12.Task1;

import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle(int x0, int y0) {
        super(x0, y0);
    }

    @Override
    public void paintFigure(Graphics gr) {
        r=(int)(Math.random()*255);
        g=(int)(Math.random()*255);
        b=(int)(Math.random()*255);
        gr.setColor(new Color(r,g,b));
        int width=50+(int)(Math.random()*150);
        int length=50+(int)(Math.random()*150);
        gr.drawRect(x, y,width,length);
    }
}
