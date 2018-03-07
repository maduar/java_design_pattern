package factory;

public class ShapeFactory  {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        // 判断shapeType名称是否存在于枚举类中
        String clazzStr = ShapeEnum.hasShapeEnum(shapeType);
        if ("".equals(clazzStr)) {
            return null;
        }

        // 当前包名
        String packagePath = getPackagePath(this.getClass());
        // 类所在路径
        String classPath = packagePath + "." + clazzStr;

        try {
            Class t = Class.forName(classPath);
            return (Shape)t.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static String getPackagePath(Class z) {
        return z.getPackage().getName().toString();
    }
}
