import java.util.ArrayList;

public class Race {

    private ArrayList<IDrive> racers;

    public Race() {
        this.racers = new ArrayList<>();
    }

    public int racerCount(){
        return this.racers.size();
    }

    public void addRacer(IDrive racer){
        this.racers.add(racer);
    }

}
