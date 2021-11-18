#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>
#include <algorithm>

//Sequence Alignment Using DP

using namespace std;

vector<vector<int>> SequenceAlignment(string& s1, string& s2, int match, int mismatch, int gap) {
    int len1 = s1.size(), len2 = s2.size();

    vector<vector<int>> dp(len1 + 1, vector<int>(len2 + 1));
    // init
    for (int i = 0; i != len1 + 1; ++i) {
        dp[i][0] = i * gap;
    }
    for (int i = 0; i != len2 + 1; ++i) {
        dp[0][i] = i * gap;
    }

    for (int i = 1; i != len1 + 1; ++i) {
        for (int j = 1; j != len2 + 1; ++j) {
            int tmp = (s1[i - 1] == s2[j - 1]) ? match : mismatch; // +1 and -1
            int update = max(dp[i - 1][j - 1] + tmp, dp[i - 1][j] + gap);
            dp[i][j] = max(update, dp[i][j - 1] + gap);
        }
    }

    for (auto i : dp) {
        for (auto j : i) {
            cout << j << " ";
        }
        cout << endl;
    }
    cout << endl;
    return dp;
}


int main() {
    string s1 = "COELACANTH";
    string s2 = "PELICAN";

    vector<vector<int>> cost = SequenceAlignment(s1, s2, 1, -1, -1);
    cout << "The global alignment is: " << cost[s1.size()][s2.size()] << endl;

    return 0;
}
