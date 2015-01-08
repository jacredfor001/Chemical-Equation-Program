package cepdb;

public class ChemicalDB {
    //(Name, Symbol, Atom Num, Mass Num, Valence, Neutron Num, Electron Num)
    //Mass number is of the most common isotopes. Electron number is 
    Chemical[] chemicalList = new Chemical[]{
        new Chemical("Hydrogen", "H", 1, 1, 1, 0, 1),
        new Chemical("Helium", "He", 2, 4, 0, 2, 2),
        new Chemical("Lithium", "Li", 3, 7, 1, 4, 3),
        new Chemical("Beryllium", "Be", 4, 9, 2, 5, 4)
    };
}