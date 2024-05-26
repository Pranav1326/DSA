// Bubble sort

int n = arr.length;
boolean swapped;
for(int i=0; i<n-1; i++){
    swapped = false;
    for(int j=0; j<i-1; j++){
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
    if(!swapped){
        break;
    }
}

// Insertion sort

int n = arr.length;
for(int i=1; i<n-1; i++){
    int key = arr[i];
    int j = i - 1;
    while(j>=0 && arr[j]>key){
        arr[j+1] = arr[j];
        j = j - 1;
    }
    arr[j+1] = key;
}

// Selection sort

int n = arr.length;
for(int i=0; i<n-1; i++){
    int minIndex = i;
    for(int j=i+1; j<n; j++){
        if(arr[j]<arr[minIndex]){
            minIndex = j
        }
    }
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = tmep;
}

// merge sort

void mergesort(int[] arr, int left, int right){
    if(left < right){
        int mid = left + (right-left)/2;
        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }
}

int merge(int[] arr, int left, int mid, int right){
    int n1 = mid-left-1;
    int n2 = right-mid;
    int leftArr[] = new int[n1];
    int rightArr[] = new int[n2];
    for(int i=0; i<n1; ++i){
        leftArr[i] = arr[left+i];
    }
    for(int j=0; i<nw; ++j){
        rightArr[j] = arr[mid+1+j];
    }
    int i=0,j=0;
    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k] = leftArray[i];
            i++;
        } else {
            arr[k] = rightArray[j];
            j++;
        }
        k++;
    }
    while (i < n1) {
        arr[k] = leftArray[i];
        i++;
        k++;
    }
    while (j < n2) {
        arr[k] = rightArray[j];
        j++;
        k++;
    }
}