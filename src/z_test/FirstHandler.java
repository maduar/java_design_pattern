package z_test;

public class FirstHandler extends Handler {

    @Override
    public String handlerRequest(String mailType) {

        if (Test.compareStr(mailType, SysMsgCodeType.MAIL001.getCode()) ||
            Test.compareStr(mailType, SysMsgCodeType.MAIL002.getCode()) ||
            Test.compareStr(mailType, SysMsgCodeType.MAIL003.getCode()) ||
            Test.compareStr(mailType, SysMsgCodeType.MAIL004.getCode()) ||
            Test.compareStr(mailType, SysMsgCodeType.MAIL018.getCode())) {

            System.out.println(1111);
        } else {
            if (null != getSuccessor()) {
                return getSuccessor().handlerRequest(mailType);
            }
        }
        return null;
    }
}
