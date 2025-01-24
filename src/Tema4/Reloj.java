package Tema4;

public class Reloj {

    private int hour;
    private int minutes;
    private int seconds;
    private int format;

    public Reloj() {

        this.hour = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.format = 24;

    }

    public Reloj(int hour, int minutes, int seconds) {

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public int getHour() {

        return hour;

    }

    public void setHour(int hour) {

        if (this.hour > 24 || this.hour < 0) {

            this.hour = 0;

        }

        this.hour = hour;

    }

    public int getMinutes() {

        return minutes;

    }

    public void setMinutes(int minutes) {

        if (this.minutes < 0 || this.minutes > 59){

            this.minutes = 0;

        }

        this.minutes = minutes;

    }

    public int getSeconds() {

        return seconds;

    }


    public void setSeconds(int seconds) {

        if (this.seconds < 0 || this.seconds > 59){

            this.seconds = 0;

        }

        this.seconds = seconds;

    }

    public int getFormat() {

        return format;

    }

    public void setFormat(int format) {

        if (this.format != 24){

            this.format = 12;

        }

        this.format = format;

    }

    public String toString(){

        String time;

        if (this.hour > 12 && this.format == 12) this.hour -= 12;

        return time = this.hour + ":" + this.minutes + ":" + this.seconds;

    }

    public String showTime(){

        String time;

        if (this.hour > 12 && this.format == 12) this.hour -= 12;

        return time = this.hour + ":" + this.minutes + ":" + this.seconds;

    }

}
