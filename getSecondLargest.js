function getSecondLargest(nums) 
{
    let lar=Math.max(...nums);
    let sec=0;
    for(let num of nums)
        {
            if(num>sec && num<lar)
                {
                    sec=num;
                }
        }
    return sec;
}
