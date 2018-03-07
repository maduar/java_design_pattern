package handler;

public class GeneralManager extends Handler{

    @Override
   public String handleRequest(String user, Double fee) {

        String result = "";

        if (fee >= FeeEnum.MIDDLE.getFee()) {
            if(UserEnum.ZHANGSAN.toString().equals(user)) {
                result = "成功：GeneralManager同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            } else {
                result = "失败：GeneralManager不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }
        } else {

            // 超过500，传递给更高级别的人
            if(getSuccessor() != null) {
                return getSuccessor().handleRequest(user, fee);
            }
        }

        return result;
   }
}
