var sortArrayByParity = function(nums) {
    var left = 0;
    var right = 0;
    while (left < nums.length){
        if (nums[left] % 2 == 0) {
            // we reach an even number, therfore we will swap the values
            // we can uuse [nums[left], nums[right]]=[nums[right], nums[left]]
            let temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right++;
        }
        left++;
    }
    console.log(nums);
    return nums;
};


let nums = [3,1,2,4];
sortArrayByParity(nums);