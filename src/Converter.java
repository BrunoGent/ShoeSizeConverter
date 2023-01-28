public class Converter {
    int UKSize;
    int EUSize;

    public Converter(int UKSize, int EUSize){
        this.UKSize = UKSize;
        this.EUSize = EUSize;
    }

    //getters
    public int getUKSize() {
        return EUSize-33;
    }

    public int getEUSize() {
        return UKSize+33;
    }

    //setters
    public void setUKSize(int UKSize) {
        this.UKSize = UKSize;
    }

    public void setEUSize(int EUSize) {
        this.EUSize = EUSize;
    }
}
