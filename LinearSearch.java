// Linear Search in an Array.
/*
 * # Algorithm
 * 1. Start
 * 2. Declare array and search element as key
 * 3. Traver the array until the element is found
 * 4. if the key is found, return the index position of the array element
 * 5. if the key is not found, return -1
 * 6. Stop
*/
/*
 * # Pseudocode
 * procedure linearSearch(list, value)
 *   for each item in the list
 *     if item == value
 *       return item location
 *     end if
 *   end for
 * end procedure
*/

class LinearSearch{
    public static void main(String args[]){
        int arr[] = {10, 40, 50, 20, 30};
        int elementToFind = 20;
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i] == elementToFind){
                System.out.println("Index of element " + elementToFind + " is " + i);
                break;
            }
        }
        if(i == arr.length){
            System.out.println("Element not found!");
        }
    }
}