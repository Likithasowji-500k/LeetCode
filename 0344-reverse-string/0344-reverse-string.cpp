class Solution {
public:
    void reverseString(vector<char>& s) {
        int i=0;
        int j=s.size();
        int temp;
        j=j-1;
        while(i<j){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
};