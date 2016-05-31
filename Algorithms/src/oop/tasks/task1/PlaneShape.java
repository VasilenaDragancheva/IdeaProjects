package oop.tasks.task1;

import oop.tasks.task1.contracts.AreaMeasurable;
import oop.tasks.task1.contracts.PerimeterMeasurable;
import oop.tasks.task1.vertixes.Vertix2D;

/**
 * Created by User-01 on 30.5.2016 г..
 */
public abstract class PlaneShape extends Shape
        implements PerimeterMeasurable, AreaMeasurable {
    protected PlaneShape(Vertix2D... vertex) {
        super(vertex);
    }

}
