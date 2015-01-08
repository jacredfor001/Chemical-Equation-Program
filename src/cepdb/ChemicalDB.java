package cepdb;

public class ChemicalDB {
    //(Name, Symbol, Atom Num, Mass Num, Valence, Neutron Num)
    //Mass number is of the most common isotopes. Electron number is 
    Chemical[] chemicalDB = new Chemical[]{
        new Chemical("Hydrogen", "H", 1, 1, 1, 0),
        new Chemical("Helium", "He", 2, 4, 0, 2),
        new Chemical("Lithium", "Li", 3, 7, 1, 4),
        new Chemical("Beryllium", "Be", 4, 9, 2, 5),
        new Chemical("Boron", "B", 5, 11, 3, 6),
        new Chemical("Carbon", "C", 6, 12, 0, 6)
    };
}