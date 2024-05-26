package PR_6;

class Triangle extends Shape implements BuildMaterial {
    public void draw() {
        System.out.println("Треугольник");
    }

    @Override
    public void build() {
        System.out.println("Строим Треугольник");
    }
}
