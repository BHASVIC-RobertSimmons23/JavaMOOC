package Misc.Shapes;

import java.util.ArrayList;

public class NPointPolygon {
    Vec2[] points;
    public NPointPolygon(Vec2... points) {
        this.points = points;
    }

    public double getArea() {
        double sum = 0;
        for(int i = 0; i < points.length; i++) {
            if(i == points.length - 1) sum += points[i].x * points[0].y;
            else sum += points[i].x * points[i + 1].y;
        }
        for(int i = 0; i < points.length; i++) {
            if(i == points.length - 1) sum -= points[i].y * points[0].x;
            else sum -= points[i].y * points[i + 1].x;
        }
        return sum * 0.5;
    }

}
