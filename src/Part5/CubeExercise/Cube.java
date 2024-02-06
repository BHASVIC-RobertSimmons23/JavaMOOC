package Part5.CubeExercise;

public class Cube {
    int edgeLength;

    public Cube(int givenLength) {
        edgeLength = givenLength;
    }

    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
}
