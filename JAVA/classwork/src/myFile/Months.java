package myFile;

public enum Months {
    JANUARY(1),
    FEBRUARY(1),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int value;

    Months(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        for (Months month : Months.values()) {
            System.out.println(month.name()+month.getValue());
        }
    }
}