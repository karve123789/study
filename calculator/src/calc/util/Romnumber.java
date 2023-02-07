package calc.util;

public enum Romnumber {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);
    private int rom;
    Romnumber(int rom) {
        this.rom = rom;
    }
    public  int getRom() {
        return rom;
    }

    }

