#include<bits/stdc++.h>
using namespace std;

void linearSearch(int num, vector<int> arr){
    for(int i=0;i<arr.size() ;i++){
        if(arr[i]==num){
            cout<<"Found";
            return;
        }   
    }
    cout<<"Not Found";
}

int main(){
    vector<int> arr = {1,2,4,6,7,8,3};
    int num;
    cout<<"Enter the Number to be searched";
    cin>>num;
    linearSearch(num,arr);
}
