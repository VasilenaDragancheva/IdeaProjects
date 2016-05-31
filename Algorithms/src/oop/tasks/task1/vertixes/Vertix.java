package oop.tasks.task1.vertixes;

/**
 * Created by User-01 on 30.5.2016 г..
 */
public abstract class Vertix {
    private Integer x;
    private Integer y;
    private Integer z;

    protected Vertix(
            Integer x, Integer
            y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
