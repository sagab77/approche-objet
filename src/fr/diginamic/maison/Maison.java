package fr.diginamic.maison;

public  class Maison {


    Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece piece) {
        if (piece != null) {

            int size = this.pieces.length;
            Piece[] newPieces = new Piece[size + 1];
            newPieces[size] = piece;

            for (int i = 0; i < size; i++) {

                newPieces[i] = this.pieces[i];

            }

            this.pieces = newPieces;

        } else {
            System.out.println("Objet null!");
        }
    }

    public double surfaceTotale() {
        double res = 0;
        for (Piece piece : this.pieces) {
            res += piece.superficie;
        }

        return res;


    }

    public double etageSurface(int numero_etage) {

        double res = 0;
        for (Piece piece : this.pieces) {
            if (piece.numero_etage == numero_etage) {
                res += piece.superficie;
            }
        }
        return res;

    }

    public int chambreSurface(Class<? extends Piece> chambreType) {

        double res = 0;

        for (Piece piece : this.pieces) {

            if (chambreType.isInstance(piece)) {

                res += piece.superficie;

            }

        }
        return (int) res;

    }

    public int nombreChambre(Class<? extends Piece> chambreType) {
        int res = 0;

        for (Piece piece : this.pieces) {

            if (chambreType.isInstance(piece)) {
                res++;
            }


        }

        return res;
    }
}
