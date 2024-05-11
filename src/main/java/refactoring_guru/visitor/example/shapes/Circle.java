package refactoring_guru.visitor.example.shapes;

import refactoring_guru.visitor.example.visitor.Visitor;

public class Circle extends Dot   {
    private final int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {

        System.out.println();

        final int x =  radius;

        System.out.println();
        System.out.println("Example de commit --amend");
        return x;
    }
}
