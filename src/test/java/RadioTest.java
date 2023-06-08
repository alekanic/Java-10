import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetRadioStation() {
        Radio setNewRadioStation = new Radio(50);

        setNewRadioStation.setCurrentRadioStation(45);

        int expected = 45;
        int actual = setNewRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetRadioStationMoreThanMax() {
        Radio setNewRadioStation = new Radio(50);

        setNewRadioStation.setCurrentRadioStation(51);

        int expected = 0;
        int actual = setNewRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetRadioStationLessThanZero() {
        Radio setNewRadioStation = new Radio(50);

        setNewRadioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = setNewRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void channelsFromZeroToEightIncrease() {
        Radio nextRadioStation = new Radio();
        nextRadioStation.setCurrentRadioStation(8);

        nextRadioStation.next();

        int expected = 9;
        int actual = nextRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void channelNineIncrease() {
        Radio nextRadioStation = new Radio();
        nextRadioStation.setCurrentRadioStation(9);

        nextRadioStation.next();

        int expected = 0;
        int actual = nextRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void channelsFromOneToNineDecrease() {
        Radio prevRadioStation = new Radio();
        prevRadioStation.setCurrentRadioStation(1);

        prevRadioStation.prev();

        int expected = 0;
        int actual = prevRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void channelZeroDecrease() {
        Radio prevRadioStation = new Radio();
        prevRadioStation.setCurrentRadioStation(0);

        prevRadioStation.prev();

        int expected = 9;
        int actual = prevRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolumeBeforeHundred() {
        Radio increaseVolume = new Radio();

        increaseVolume.increaseVolume(99);

        int expected = 100;
        int actual = increaseVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolumeIfHundred() {
        Radio increaseVolume = new Radio();

        increaseVolume.increaseVolume(100);

        int expected = 100;
        int actual = increaseVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void decreaseVolumeFromOneToHundred() {
        Radio decreaseVolume = new Radio();

        decreaseVolume.decreaseVolume(100);

        int expected = 99;
        int actual = decreaseVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void decreaseVolumeIfZero() {
        Radio decreaseVolume = new Radio();

        decreaseVolume.decreaseVolume(0);

        int expected = 0;
        int actual = decreaseVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void setVolumeFromZeroToHundred() {
        Radio setVolume = new Radio();

        setVolume.setCurrentVolume(80);

        int expected = 80;
        int actual = setVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeLessThanZero() {
        Radio setVolume = new Radio();

        setVolume.setCurrentVolume(-2);

        int expected = 0;
        int actual = setVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeMoreThanHundred() {
        Radio setVolume = new Radio();

        setVolume.setCurrentVolume(102);

        int expected = 0;
        int actual = setVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

