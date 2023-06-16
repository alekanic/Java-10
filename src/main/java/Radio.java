import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Radio {


    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.currentRadioStation = currentRadioStation;
        this.maxStation = 9;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void next() {
        if (currentRadioStation == maxStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume == 100) {
            currentVolume = newCurrentVolume;
        }
    }


    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume == 0) {
            currentVolume = newCurrentVolume;
        }
    }



}