public abstract class Piece {
    protected int value;
    protected boolean isWhite;

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public abstract void move();

    public abstract String toString();

    public boolean equals(Piece piece) {
        return getValue() == piece.getValue() && getIsWhite() == piece.getIsWhite();
    }

    public int getValue() {
        return value;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIsWhite(boolean white) {
        isWhite = white;
    }
}
