package handler2;

public class ClientHelp {

    public static Leader getDirectorInstane() {
        Leader director = new Director("白雪");
        Leader manager = new Manger("商鞅");
        Leader generalManager = new GeneralManager("嬴驷");

        director.setNextLeader(manager);
        manager.setNextLeader(generalManager);
        return  director;
    }
}
