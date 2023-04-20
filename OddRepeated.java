public class OddRepeated {

    static boolean isFound(int[] arr,int num){
        for (int i =0;i< arr.length;i++){
            if (arr[i]==num){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 6, 77, 7, 7, 7, 44, 44, 44, 45, 45, 45, 9, 8, 8};
        int[] doubl = new int[numbers.length];
        int strindex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    if (isFound(doubl, numbers[i])) {
                        doubl[strindex++] = numbers[i];
                    }
                }
            }
        }

        for (int z : doubl) {
            if (z != 0) {
                System.out.println(z);
            }
        }
    }
}
