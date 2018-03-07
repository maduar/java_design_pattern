package factory;

public class ShapeFactory  {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        boolean sign = false;
        for(ShapeEnum se: ShapeEnum.values()) {
            if(se.toString().equals(shapeType)) {
                sign = true;
            }
        }

        if (!sign) {
            return null;
        }

        String clazStr = this.getFirstWordUpper(shapeType);
        String name = ShapeFactory.class.getPackage().getName().toString() + "." + clazStr;

        try {
            Class t = Class.forName(name);
            return (Shape)t.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getFirstWordUpper(String str) {
        String result = "";

        if("".equals(str) || str == null) {
            return result;
        }

        String lowerStr = str.toUpperCase();
        char t = lowerStr.charAt(0);
        result = t + lowerStr.substring(1).toLowerCase();

        return result;
    }
}
