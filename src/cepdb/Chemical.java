package cepdb;

public class Chemical {
    String name;
    String symbol;
    int atomNum;
    int massNumOfCommonIsotope;
    int valence;
    int neutronCount;
    int electronCountUnstable;
    int electronCountStableOctet;
    
    public Chemical(String name, String symbol, int atomNum, int massNumOfCommonIsotope, int valence, int neutronCount) {
        this.name = name;
        this.symbol = symbol;
        this.atomNum = atomNum;
        this.massNumOfCommonIsotope = massNumOfCommonIsotope;
        this.valence = valence;
        this.neutronCount = neutronCount;
        this.electronCountUnstable = atomNum;
        this.electronCountStableOctet = atomNum - valence;
    }
}
