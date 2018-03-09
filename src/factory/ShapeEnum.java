package factory;

public enum ShapeEnum {
    CIRCLE("Circle"), RECTANGLE("Rectangle"), SQUARE("Square"), RECTANGLE2("Rectangle2"), TESTRECTANGLE("TestRectangle");

    private String classname;

    private ShapeEnum(String classname) {
        this.classname = classname;
    }
    public static String hasShapeEnum(String str) {
        for(ShapeEnum se: ShapeEnum.values()) {
            if(se.toString().equals(str)) {
                return se.getClassname();
            }
        }
        return "";
    }

    public String getClassname() {
        return classname;
    }
}
