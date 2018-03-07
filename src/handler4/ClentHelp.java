package handler4;

public class ClentHelp {
    public static AbstractClerk getClerkInstane() {
        AbstractClerk clerk = new Clerk();
        AbstractClerk leader = new Leader();
        AbstractClerk manager = new Manager();
        AbstractClerk boss = new Boss();

        clerk.setSuperior(leader);
        leader.setSuperior(manager);
        manager.setSuperior(boss);
        return clerk;

    }
}
