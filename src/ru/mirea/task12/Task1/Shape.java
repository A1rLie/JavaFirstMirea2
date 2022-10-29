package ru.mirea.task12.Task1;

import java.awt.*;

public abstract class Shape {
    protected int r,g,b, x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void paintFigure(Graphics gr);
}
