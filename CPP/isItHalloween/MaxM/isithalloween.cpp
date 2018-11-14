#include <iostream>
using namespace std;

int main() 
{
    string month;
    short day;
    cin >> month >> day;

    //Condition HELLOWEEN
    if(month == "OCT" && day == 31 ){
        cout << "yup\n";
        return 0;
    }
        
    // CONDITION DEC 25
    if(day == 25 && month == "DEC" ){
        cout << "yup\n";
        return 0;
    }

    // ANY OTHER DAY
    cout << "nope\n";
    return 0;
}
