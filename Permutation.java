class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(), nums);
        return list;
    }
    public void backTrack(List<List<Integer>> list, List<Integer> temp, int [] nums){
        
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
        }
        for(int i = 0; i< nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backTrack(list,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}