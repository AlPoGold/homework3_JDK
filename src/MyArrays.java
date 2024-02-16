public class MyArrays<T> {

    public static boolean compareArrays(Object[] arr1, Object[] arr2 ){
        if(arr1.length==arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if(!arr1[i].equals(arr2[i])) return false;
            }
            return true;
        }
        return false;
    }
}
