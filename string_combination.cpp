#include <iostream>
using namespace std;
int main() {
    string a;
    cin>>a;
    for(int i=1;i<((1<<a.length())-1);i++){
        string k="";
        for(int j=0;j<a.length();j++){
            if(i & (1<<j))
            k+=a[j];
        }
        cout<<k<<endl;
    }
    return 0;
}
