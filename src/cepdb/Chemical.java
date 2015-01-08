package cepdb;

public class Chemical {
    String name;
    String symbol;
    int atomNum;
    int massNum;
    int valence;
    int neutronCount;
    int electronCount;
    
    public Chemical(String name, String symbol, int atomNum, int massNum, int valence, int neutronCount, int electronCount) {
        this.name = name;
        this.symbol = symbol;
        this.atomNum = atomNum;
        this.massNum = massNum;
        this.valence = valence;
        this.neutronCount = neutronCount;
        this.electronCount = electronCount;
    }
}
