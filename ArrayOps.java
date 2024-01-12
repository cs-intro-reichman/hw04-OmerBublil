public class ArrayOps {
    public static void main(String[] args) {
        int [] a = {1, -2, 3};
        int [] b = {1, 2, 1, 1, 2};
        System.out.println (isSorted(a));
    }
    
    public static int findMissingInt (int [] array) {
        int arrayLength = array.length;
        int arraySum = 0;
        int exeptedArraySum = 0;
        for (int i = 0 ; i <= arrayLength ; i++){
            exeptedArraySum = exeptedArraySum + i;
        }
        for (int j = 0 ; j < arrayLength ; j++){
            arraySum = arraySum + array[j];
        }
        int missintInt = exeptedArraySum - arraySum; 
        return missintInt;
    }

    public static int secondMaxValue(int [] array) {
        int firstMax = Math.max (array[0], array[1]);
        int secondMax = Math.min (array [0], array [1]);
        for (int i = 2; i < array.length; i++){
            if (array[i] > secondMax && array [i] < firstMax){
                secondMax = array [i];
            }
            if (array[i] >= firstMax){
                    secondMax = firstMax;
                    firstMax = array[i];
                }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean sameElements1 = sameElements(array1, array2);
        boolean sameElements2 = sameElements(array2,array1);
        if (sameElements1 && sameElements2){
            return true;
        }
        return false;
    }
    public  static boolean sameElements(int [] array1,int [] array2){
        int size1 = array1.length;
        int size2 = array2.length;
        boolean sameElements1 = false;

        for (int i = 0 ; i < size1; i++){
            sameElements1 = false;
            for (int j = 0; j < size2; j++){
                if(array1[i] == array2[j]){
                    sameElements1 = true;
                    break;
                }
            }

            if(!sameElements1){
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean minToMax = true;
        boolean maxToMin = true;
        for (int i = 1 ; i < array.length;){
            if (array[i] <= array[i - 1]){
                minToMax = true;
                i++;
            }
            else {
                minToMax = false;
                break;
            }
        }
        for (int j = array.length - 1 ; j > 0;){
            if (array[j] >= array[j-1]){
              maxToMin = true;
                j--;
            }
            else{
                maxToMin = false;
                break;
            }
        }
        if (maxToMin || minToMax){
            return true;
        }
        else {
        return false;
    }
    }

}
