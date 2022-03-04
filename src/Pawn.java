public class Pawn extends Piece {
    private boolean promoted;
    private Piece newPiece;

    public Pawn(int value, boolean isWhite,boolean promoted, Piece newPiece) {
        super(value, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public boolean equals(Pawn pawn){
        if(!super.equals(pawn)) return false;
        else if(getPromoted() != pawn.getPromoted()) return false;
        else if(!getNewPiece().equals(pawn.getNewPiece())) return false;

        return true;
    }

    @Override
    public void move() {
        System.out.println("Forward " + getValue());
    }

    @Override
    public String toString() {
        return "Pawn{value='" + getValue() + "\'}";
    }

    public void promote(Piece newPiece) {
        //not promoted if newPiece is a king or pawn
        if(newPiece.getValue() == 1000 || newPiece.getValue() == 1) return;
        // not promoted if newPiece's color doesn't match with pawn's color
        if(getIsWhite() != newPiece.getIsWhite()) return;

        this.newPiece = newPiece;
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public boolean getPromoted() {
        return promoted;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

}
