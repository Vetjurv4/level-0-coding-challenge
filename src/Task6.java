public class Task6 {

    public double maximum(int a, int b, int c){
        int max = a;

        if(b > max)
            max = b;

        if(c > max)
            max = c;

        return max;
    }

    //Bonus
    public double maxi(int... numbers){
        double max = 0;
        for(int x : numbers){
            if(x > max)
                max = x;
        }
        return max;
    }

    //bonus 2
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
}
