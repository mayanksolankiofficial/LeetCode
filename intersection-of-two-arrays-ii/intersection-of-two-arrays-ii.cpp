class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        
        map<int, int>mp;
        vector<int>answer ;  
        
        for(int i=0 ; i<nums1.size() ; i++) 
            mp[nums1[i]]++;
            
        for(int i=0 ; i<nums2.size() ; i++) 
        {
            auto it = mp.find(nums2[i]);
            if( it!= mp.end() && it->second >0)
            {
                answer.push_back(nums2[i]);
                it->second-- ;
            }   
        }
        return answer;
    }
};


/**
Intuition: map not set as we need to return all occurences 
**/