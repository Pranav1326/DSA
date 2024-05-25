// Deletion in an Array.
class Array3{
    public static void main(String args[]){
        int num[] = {10, 20, 30, 40, 50};
        // Element Insertion
        int arraySize = num.length;
        int eleToDelete = num[2];
        int temp = 2;
        while(temp < arraySize-1){
            num[temp] = num[temp+1];
            temp = temp + 1;
        }
        // Traversal / Printing Elements
        for(int i=0; i<arraySize-1; i++){
            System.out.print(num[i] + " ");
        }
    }
}