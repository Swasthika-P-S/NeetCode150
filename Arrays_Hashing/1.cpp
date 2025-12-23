class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<pair<int,int>> index;
        for(int i=0;i<nums.size();i++)
        {
            index.push_back({nums[i],i});
        }
        sort(index.begin(),index.end());
        int left = 0;
        int right = nums.size()-1;
         int sum = 0;
        while(left < right)
        {
           sum = index[left].first + index[right].first;
           if(sum > target) right--;
           else if(sum < target) left++;
           else 
           {
                if(index[left].second > index[right].second) swap(index[left].second,index[right].second);
                return {index[left].second,index[right].second};
           }
        }
        return {};
    }
};
