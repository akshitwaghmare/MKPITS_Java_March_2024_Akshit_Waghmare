package searchtech;

public class Search {

    public int[] bubblesort(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        return num;
    }
    public int linearsearch(int num[],int number){
        int n = num.length;
        for (int i = 0; i < n; i++) {
            if (num[i] == number) {
                return i;
            }
        }
        return -1;
    }
    public int binarysearch(int num[],int number){
        int min = 0, max = num.length - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (num[mid] == number) {
                return mid;
            } else if (num[mid] < number) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
