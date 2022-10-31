#include <bits/stdc++.h>
using namespace std;

int truckTour(vector<vector<int> > pp)
{
    int fuel = 0, ans = -1, ss = 0;
    for (int i = 0; i + 1 != ss; i = (i + 1) % pp.size()) {
        fuel += pp[i][0];
        if (pp[i][1] > fuel) {
            ss = i + 1;
            fuel = 0;
        }
        else
            fuel -= pp[i][1];
    }
    return ss;
}

int main()
{
    int n;
    cin >> n;
    vector<vector<int> > pp(n);
    for (int i = 0; i < n; i++) {
        pp[i].resize(2);
        for (int j = 0; j < 2; j++)
            cin >> pp[i][j];
    }
    int result = truckTour(pp);
    cout << result << "\n";
    return 0;
}