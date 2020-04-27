public class FirstLesson {


    public static void main(String[] args) {

        int nums[] = {7, -5, 3, 2, 1, 0, 45};

        int list = nums.length;

        for (int i = 0; i < list; i++){
            for (int j = 0; j < list -i -1; j++){

                if ( nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;2
                }
            }
        }
        for (int numm : nums){
            System.out.println(numm);

        }



    }
}
