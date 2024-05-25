// Insertion in an Array.
class Array2{
    public static void main(String args[]){
        int num[] = {10, 20, 30, 40, 50, 0, 0, 0};
        // Element Insertion
        int temp = num.length-1;
        int noToInsert = 25;
        int position = 2;
        while(temp > position){
            num[temp] = num[temp-1];
            temp = temp - 1;
        }
        num[position] = noToInsert;
        // Traversal / Printing Elements
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}