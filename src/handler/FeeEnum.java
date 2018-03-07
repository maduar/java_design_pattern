package handler;

public enum  FeeEnum {
    NOMAL(500,1), MIDDLE(1000, 2);

    private double fee;
    private int index;

    private FeeEnum(double fee, int index) {
        this.fee = fee;
        this.index = index;
    }

    public static double getFee(int index) {
        for(FeeEnum f: FeeEnum.values()) {
            if(f.getIndex() == index) {
                return f.fee;
            }
        }

        return 0;
    }

    public double getFee() {
        return fee;
    }

    public int getIndex() {
        return index;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
