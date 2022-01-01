import com.mmr.App;

import java.util.Arrays;
import java.util.Scanner;


class mmr {

    public static int[] mmr(int[] array) {
        int result = 1000;
        int[] ideal = new int[0];
        int closestResult = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int m = 0; m < 3; m++) {
                        result = 100 - array[i] - array[j] - array[k] - array[m];
                        if (result == 0) {
                            ideal = new int[]{array[i], array[j], array[k], array[m]};
                            return ideal;
                        } else {
                            if (result < closestResult && result > 0) {
                                ideal = new int[]{array[i], array[j], array[k], array[m]};
                                closestResult = result;
                            }
                        }
                    }

                }
            }
        }
        return ideal;
    }
        public static int[] mmru ( int[] array) {
            int result = 1000;
            int[] ideal = new int[0];
            int closestResult = 100;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                            result = 100 - array[i] - array[j] - array[k];
                            if (result == 0) {
                                ideal = new int[]{array[i], array[j], array[k]};
                                return ideal;
                            } else {
                                if (result < closestResult && result > 0) {
                                    ideal = new int[]{array[i], array[j], array[k]};
                                    closestResult = result;
                                }
                            }

                    }
                }
            }
            return ideal;
        }
    public static int[] mmrh12(int[] array) {
        int result = 1000;
        int[] ideal = new int[0];
        int closestResult = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                for (int o = 0; o < 3; o++) {
                                    for (int p = 0; p < 3; p++) {
                                        for (int q = 0; q < 3; q++) {
                                            for (int r = 0; r < 3; r++) {
                                                for (int s = 0; s < 3; s++) {
                                                    for (int t = 0; t < 3; t++) {
                                                        result = 100 - array[i] - array[j] - array[k] - array[l] - array[m] - array[n] - array[o] - array[p] - array[q] - array[r] - array[s] - array[t];
                                                        if (result == 0) {
                                                            ideal = new int[]{array[i], array[j], array[k], array[l], array[m], array[n], array[o], array[p], array[q], array[r], array[s], array[t]};
                                                            return ideal;
                                                        } else {
                                                            if (result < closestResult && result > 0) {
                                                                ideal = new int[]{array[i], array[j], array[k], array[l], array[m], array[n], array[o], array[p], array[q], array[r], array[s], array[t]};
                                                                closestResult = result;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return ideal;
    }
    public static int[] mmrh10 ( int[] array) {
        int result = 1000;
        int[] ideal = new int[0];
        int closestResult = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                for (int o = 0; o < 3; o++) {
                                    for (int p = 0; p < 3; p++) {
                                        for (int q = 0; q < 3; q++) {
                                            for (int r = 0; r < 3; r++) {
                                                        result = 100 - array[i] - array[j] - array[k] - array[l] - array[m] - array[n] - array[o] - array[p] - array[q] - array[r];
                                                        if (result == 0) {
                                                            ideal = new int[]{array[i], array[j], array[k], array[l], array[m], array[n], array[o], array[p], array[q], array[r]};
                                                            return ideal;
                                                        }
                                                        else {
                                                            if (result < closestResult && result > 0) {
                                                                ideal = new int[]{array[i], array[j], array[k], array[l], array[m], array[n], array[o], array[p], array[q], array[r]};
                                                                closestResult = result;
                                                            }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return ideal;
    }
    public static int[] mmrh8 ( int[] array) {
        int result = 1000;
        int[] ideal = new int[0];
        int closestResult = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                for (int o = 0; o < 3; o++) {
                                    for (int p = 0; p < 3; p++) {
                                                result = 100 - array[i] - array[j] - array[k] - array[l] - array[m] - array[n] - array[o] - array[p];
                                                if (result == 0) {
                                                    ideal = new int[]{array[i], array[j], array[k], array[l], array[m], array[n], array[o], array[p]};
                                                    return ideal;
                                                }
                                                else {
                                                    if (result < closestResult && result > 0) {
                                                        ideal = new int[]{array[i], array[j], array[k], array[l], array[m], array[n], array[o], array[p]};
                                                        closestResult = result;
                                                    }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return ideal;
    }


        public static void main (String[]args)
        {
            int[] arr = new int[3];
            Scanner input = new Scanner(System.in);
            int laps;
            while(true) {
                System.out.println("Driver?");
                String driver = input.nextLine();
                System.out.println("Soft or Hard? (s,h)");
                String sh = input.nextLine();
                System.out.println("Enter Tire Wear Data");
                System.out.println("T1:");
                arr[0] = input.nextInt();
                System.out.println("T2:");
                arr[1] = input.nextInt();
                System.out.println("T3:");
                arr[2] = input.nextInt();
                String g = input.nextLine();
                if (sh.equals("s")) {
                    System.out.println("Undercut? (t,f)");
                    String uc = input.nextLine();
                    if (uc.equals("t")) {
                        System.out.println(driver);
                        System.out.println(Arrays.toString(mmr(arr)));
                    }
                    else if (uc.equals("f")) {
                        System.out.println(driver);
                        System.out.println(Arrays.toString(mmru(arr)));
                    }
                    else {
                        g = input.nextLine();
                        continue;
                    }
                }
                else if (sh.equals("h")){
                    System.out.println("Laps 8,10,12:");
                    laps = input.nextInt();
                    if (laps == 8) {
                        System.out.println(driver);
                        System.out.println(Arrays.toString(mmrh8(arr)));
                    }
                    else if (laps == 10) {
                        System.out.println(driver);
                        System.out.println(Arrays.toString(mmrh10(arr)));
                    }
                    else if (laps == 12) {
                        System.out.println(driver);
                        System.out.println(Arrays.toString(mmrh12(arr)));
                    }
                    else {
                        g = input.nextLine();
                        continue;
                    }
                }
                else {
                    g = input.nextLine();
                    continue;
                }
                g = input.nextLine();
            }
        }

    }