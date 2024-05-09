#include<iostream>
using namespace std;
int main(){
	int num[] = {1, 2, 3, 4, 5, 6, 7};
	for(int i=0; i<(sizeof(num)/sizeof(num[0])); i++){
		cout << num[i] << " ";
	}
	return 0;
}
