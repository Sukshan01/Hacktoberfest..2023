class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int maxWaterArea = 0;

        int lp = 0;
        int rp = n-1;

        while(lp < rp){

            //cal current water area

            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;

            int currWaterArea = ht * width;

           maxWaterArea = Math.max(maxWaterArea, currWaterArea);
        


        //update pointers

        if(height[lp] < height[rp]){
            lp++;
        }

        else{
            rp--;
        }

        }

        return maxWaterArea;


        
    }
}
