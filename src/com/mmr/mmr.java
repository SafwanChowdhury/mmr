package com.mmr;




public class mmr {

    public static int[] mmrnew(int[] array, int laps){
        // the length of the input array
        int base = 3;
        int result = 1000;
        int closestResult = 100;
        // must have same length as desired result length
        int[] indexArray = new int[laps];
        int[] tempArray = new int[laps];
        int[] idealArray = new int[laps];
        // there are base to the power of length possible combinations
        for (int counter = 0; counter < Math.pow(base, indexArray.length); counter++) {
            // retrieve digits as in linked answer
            int counterCopy = counter;
            int sum = 0;
            for (int i = 0; i < indexArray.length; i++) {
                indexArray[i] = counterCopy % base;
                counterCopy /= base;
                if (indexArray[i] == 0){
                    tempArray[i] = array[2];
                }
                else if (indexArray[i] == 1){
                    tempArray[i] = array[1];
                }
                else if (indexArray[i] == 2){
                    tempArray[i] = array[0];
                }
                sum += tempArray[i];
                result = 100 - sum;
            }
            if (result == 0){
                for (int i = 0; i < indexArray.length; i++){
                    idealArray[i] = tempArray[i];
                }
                return idealArray;
            }
            else{
                if (result < closestResult && result > 0) {
                    for (int i = 0; i < indexArray.length; i++){
                        idealArray[i] = tempArray[i];
                    }
                    closestResult = result;
                }
            }


        }
        return idealArray;
    }


}