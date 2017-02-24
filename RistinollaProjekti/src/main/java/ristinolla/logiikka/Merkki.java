package ristinolla.logiikka;

public enum Merkki {

    RISTI, NOLLA;

    @Override
    public String toString() {
        switch (this) {
            case RISTI:
                return "X";
            case NOLLA:
                return "O";
            default:
                throw new IllegalArgumentException();
        }
    }

}
