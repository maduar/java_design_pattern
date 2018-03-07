package factory;

public enum ShapeEnum {
//    CIRCLE("CIRCLE"), RECTANGLE("RECTANGLE"), SQUARE("SQUARE");
    CIRCLE("Circle"), RECTANGLE("Rectangle"), SQUARE("Square"), RECTANGLE2("Rectangle2"), TESTRECTANGLE("TestRectangle");

    private String classname;

    private ShapeEnum(String classname) {
        this.classname = classname;
    }
    public static String hasShapeEnum(String str) {
        String result = "";
        for(ShapeEnum se: ShapeEnum.values()) {
            if(se.toString().equals(str)) {
                result = se.getClassname();
            }
        }
        return result;
    }

    public String getClassname() {
        return classname;
    }


}
