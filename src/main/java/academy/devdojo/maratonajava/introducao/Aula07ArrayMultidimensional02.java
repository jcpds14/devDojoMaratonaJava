package academy.devdojo.maratonajava.introducao;

public interface Aula07ArrayMultidimensional02 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[][] arrInt = new int[3][];

        arrInt[0] = new int[2];
        arrInt[1] = array1;
        arrInt[2] = new int[]{6,5,4,3,2,1};

        int[][] arrayInt2 = {{0,0}, {1,2,3},{6,5,4,3,2,1}};

        for(int[] arrBase : arrayInt2){
            for(int num: arrBase){
                System.out.print(num + " ");
            }
            System.out.println("\n----");
        }
    }
}