public class pr1helper {
    double length, width, height;

    public pr1helper(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double volume() {
        return length * width * height;
    }
}