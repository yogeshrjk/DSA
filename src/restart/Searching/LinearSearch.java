package restart.Searching;

/*
Linear Search:
Linear search is also called as sequential search algorithm. It is the simplest searching algorithm.
In Linear search, we simply traverse the list completely and match each element of the list with the item whose location is to be found.
If the match is found, then the location of the item is returned; otherwise, the algorithm returns NULL or -1.
Algorithm:
Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, return -1.

The time complexity of the above algorithm is:
Best Case: O(1)
Average Case: O(n)
Worst Case: O(n)

 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 89, 67, 44};
        int key1 = 12;
        int ans1 = linearSearch(arr, key1);
        System.out.println(ans1); //2
        int key2 = 40;
        int ans2 = linearSearch(arr, key2);
        System.out.println(ans2); //-1
    }

    static int linearSearch(int[] arr, int key){
        //run a for-loop from 0 till the length of the array
        for (int i = 0; i < arr.length; i++){
            //check for element at every index
            if (arr[i] == key){
                return i;
            }
        }
        //this statement will execute if the key is not found in the array
        return -1;
    }


}
