package PR_6;

class Square extends Shape implements BuildMaterial {
    public void draw() {
        System.out.println("Квадрат");
    }

    @Override
    public void build() {
        System.out.println("Строим Квадрат");
    }

}
