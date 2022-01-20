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
            int update = min(dp[i - 1][j - 1] + tmp, dp[i - 1][j] + gap);
            dp[i][j] = min(update, dp[i][j - 1] + gap);
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
    string s1 = "GVPAG";
    string s2 = "GDAERG";

    vector<vector<int>> cost = SequenceAlignment(s1, s2, 0, 2, 1);
    cout << "The global alignment is: " << cost[s1.size()][s2.size()] << endl;

    return 0;
}
