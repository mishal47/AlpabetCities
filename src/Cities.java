public class Cities {
    String nameCity;
    char firstCH;
    char lastCH;

    public Cities(String nameCity, char firstCH, char lastCH) {
        this.nameCity = nameCity;
        this.firstCH = firstCH;
        this.lastCH = lastCH;
    }

    @Override
    public String toString() {
        return "City = '" + nameCity + '\'' +
                ", f = " + firstCH +
                ", l = " + lastCH +
                '}';
    }
}
