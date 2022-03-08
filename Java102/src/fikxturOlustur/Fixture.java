package fikxturOlustur;

public class Fixture {

   private String home;

   private String away;

    public Fixture() {
    }

    public Fixture(String home, String away) {
        this.home = home;
        this.away = away;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }
}
