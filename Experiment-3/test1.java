class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }
}

class test1 {
    public static void main(String[] args) {
        Box myBox = new Box(10.5, 20.0, 5.2);
        System.out.println("Box Dimensions: Width = 10.5, Height = 20.0, Depth = 5.2");
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}

