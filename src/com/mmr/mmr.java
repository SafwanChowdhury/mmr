package com.mmr;


import java.util.Arrays;


public class mmr {
    public static String output;
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


        public static void main (String[]args) {
            int[] arr = new int[3];
            int laps;
            String sh = App.compound;
            arr[0] = App.It1;
            arr[1] = App.It2;
            arr[2] = App.It3;
            if (sh.equals("Soft")) {
                if (App.Undercut) {
                    output = Arrays.toString(mmr(arr));
                } else {
                    output = Arrays.toString(mmru(arr));
                }
            } else if (sh.equals("Hard")) {
                laps = App.laps1;
                if (laps == 0) {
                    output = Arrays.toString(mmrh8(arr));
                } else if (laps == 1) {
                    output = Arrays.toString(mmrh10(arr));
                } else if (laps == 2) {
                    output = Arrays.toString(mmrh12(arr));
                }
            }
        }

    }