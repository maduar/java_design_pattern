package src.factory;

public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase(ShapeEnum.CIRCLE.toString())){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase(ShapeEnum.RECTANGLE.toString())){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase(ShapeEnum.SQUARE.toString())){
            return new Square();
        }
        return null;
    }
}
