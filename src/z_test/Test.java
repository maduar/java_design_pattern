package z_test;

import com.sun.istack.internal.NotNull;

public class Test {

  @NotNull
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {

    return name;
  }

  @SuppressWarnings("deprecation")
  public void work(){
    People people = new Child();
    people.work();
  }

  @Todo()
  public void incompleteMethod1() {

  }

  

  public static String newStr(String str) {

    return null;

//    if (str == null) {
//      return "it is null";
//    }
//    return str.toUpperCase();
  }

    public static boolean compareStr(String from, String to) {
      return from.equals(to);
    }
    
  public static void main(String[] args) {

      String mailType = "MAIL012";

      FirstHandler firstHandler = new FirstHandler();
      SecondHandler secondHandler = new SecondHandler();
      ThirdHandler thirdHandler = new ThirdHandler();
      FourHandler fourHandler = new FourHandler();
      OtherHandler otherHandler = new OtherHandler();

      firstHandler.setSuccessor(secondHandler);
      secondHandler.setSuccessor(thirdHandler);
      thirdHandler.setSuccessor(fourHandler);
      fourHandler.setSuccessor(otherHandler);

      firstHandler.handlerRequest(mailType);
  }
}


//    if (compareStr(mailType, SysMsgCodeType.MAIL001.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL002.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL003.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL004.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL018.getCode())) {
//
//        System.out.println(111);
//
//    } else if (compareStr(mailType, SysMsgCodeType.MAIL005.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL006.getCode()) ) {
//
//        System.out.println(222);
//    } else if (compareStr(mailType, SysMsgCodeType.MAIL007.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL008.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL009.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL010.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL011.getCode()) ) {
//
//        System.out.println(333);
//    } else if (compareStr(mailType, SysMsgCodeType.MAIL012.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL013.getCode()) ||
//        compareStr(mailType, SysMsgCodeType.MAIL014.getCode()) ) {
//
//        System.out.println(444);
//
//    } else {
//        System.out.println(555);
//    }