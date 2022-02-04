public abstract class Shape {
    abstract String draw();
}
class Rectangle extends Shape{
    @Override
    String draw() {
        return "Drawing Rectangle";
    }
}
class Line extends Shape{
    @Override
    String draw() {
        return "Drawing line";
    }
}
class Cube extends Shape{
    @Override
    String draw() {
        return "Drawing cube";
    }
}
class Assignment{
    public static void main(String[] args){
        Rectangle rec=new Rectangle();
        Cube cu=new Cube();
        Line li=new Line();

        System.out.println(rec.draw());
        System.out.println(cu.draw());
        System.out.println(li.draw());
    }
}
