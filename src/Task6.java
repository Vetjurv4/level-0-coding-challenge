public class Task6 {

    public double maximum(int... numbers){
        double max = 0;
        for(int x : numbers){
            if(x > max)
                max = x;
        }
        return max;
    }


}
