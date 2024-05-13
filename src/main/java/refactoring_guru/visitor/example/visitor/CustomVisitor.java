package refactoring_guru.visitor.example.visitor;

import refactoring_guru.visitor.example.shapes.Circle;
import refactoring_guru.visitor.example.shapes.CompoundShape;
import refactoring_guru.visitor.example.shapes.Dot;
import refactoring_guru.visitor.example.shapes.Rectangle;

public class CustomVisitor implements Visitor{
    @Override
    public String visitDot(Dot dot) {
        return "";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return "";
    }
}
