public class Task8 {

    public String numToTime(int number){
        int MINUTES_IN_HOUR = 60;
        int hour;
        int minute = number;


        hour = number / MINUTES_IN_HOUR;
        minute -= hour * MINUTES_IN_HOUR;

        String hour_noun = hour != 1? "Hours":"Hour";
        String minute_noun = minute != 1?"Minutes": "Minute";

        return hour+" "+hour_noun+", "+minute+" "+minute_noun;
    }
}
