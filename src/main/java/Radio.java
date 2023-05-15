public class Radio {

    public int currentRadioStation;
    public int currentVolume;

    // Номер радиостанции

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next(int newCurrentRadioStation) {
        if (newCurrentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = newCurrentRadioStation + 1;
        }
    }

    public void prev(int newCurrentRadioStation) {
        if (newCurrentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = newCurrentRadioStation - 1;
        }
    }

    // Громкость звука

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

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

}
