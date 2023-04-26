public class Transpoze {
    public static void main(String[] args) {
        int[][] matris = {
                {8,2,1},
                {6,8,7},
                {5,5,2},
                {8,4,3}
        };

        System.out.println("Matris : ");
        for(int[] row: matris){
            for(int column: row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozunu : ");
        int column = matris[0].length;
        for(int i=0; i < column; i++){
            for(int j=0; j < matris.length; j++){
                System.out.print(" " + matris[j][i] + " ");
            }
            System.out.println();
        }

    }
}
