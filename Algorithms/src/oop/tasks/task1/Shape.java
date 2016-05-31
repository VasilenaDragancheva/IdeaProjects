package oop.tasks.task1;

import oop.tasks.task1.vertixes.Vertix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User-01 on 30.5.2016 г..
 */
public abstract class Shape {
    protected List<Vertix> vertices;


    protected Shape(Vertix... vertices) {
        this.vertices = new ArrayList<>();
        for (Vertix vertice : vertices) {
            this.vertices.add(vertice);
        }
    }

    public List<Vertix> getVertices() {
        return this.vertices;
    }
}
