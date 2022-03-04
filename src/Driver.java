import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Piece> pieces = new ArrayList<>();

        Piece pawn = new Pawn(1, true, true, new Queen(9, true));
        Piece knight = new Knight(2, true);
        Piece bishop = new Bishop(3, true);
        Piece rook = new Rook(5, true);
        Piece queen = new Queen(9, true);
        Piece king = new King(1000,true);

        pieces.add(pawn);
        pieces.add(knight);
        pieces.add(bishop);
        pieces.add(rook);
        pieces.add(queen);
        pieces.add(king);

        for (Piece piece : pieces) {
            piece.move();
        }

        Pawn p1 = new Pawn(1, true, true, new Queen(9, true));
        Pawn p2 = new Pawn(1, true,false,null);
        Pawn p3 = new Pawn(1,false,false, null);
        Pawn p4 = new Pawn(1,false, true, new Queen(9,false));
        Pawn p5 = new Pawn(1, true, true, new Knight(2, true));

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}
