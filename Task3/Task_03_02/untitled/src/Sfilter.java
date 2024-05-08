@FunctionalInterface
public interface Sfilter {
    boolean test(String s);

    static String[] filter(String[] arr, Sfilter filt){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (filt.test(arr[i])){
                count++;
            }
        }
        String[] res = new String[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (filt.test(arr[i])){
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
}
