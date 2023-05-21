import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    // Проверяем, что можно установить номер радиостанции, если он в промежутке от 0 до 9
    public void shouldSetRadioStation() {
        Radio setNewRadioStation = new Radio();

        setNewRadioStation.setCurrentRadioStation(8);

        int expected = 8;
        int actual = setNewRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что каналы от 0 до 8 увеличиваются на 1
    public void channelsFromZeroToEightIncrease() {
        Radio nextRadioStation = new Radio();
        nextRadioStation.setCurrentRadioStation(8);

        nextRadioStation.next();

        int expected = 9;
        int actual = nextRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что 9 канал при увеличении становится 0
    public void channelNineIncrease() {
        Radio nextRadioStation = new Radio();
        nextRadioStation.setCurrentRadioStation(9);

        nextRadioStation.next();

        int expected = 0;
        int actual = nextRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что каналы от 1 до 9 уменьшаются на 1
    public void channelsFromOneToNineDecrease() {
        Radio prevRadioStation = new Radio();
        prevRadioStation.setCurrentRadioStation(1);

        prevRadioStation.prev();

        int expected = 0;
        int actual = prevRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что 0 канал при уменьшении становится 9
    public void channelZeroDecrease() {
        Radio prevRadioStation = new Radio();
        prevRadioStation.setCurrentRadioStation(0);

        prevRadioStation.prev();

        int expected = 9;
        int actual = prevRadioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что звук с 0 до 99 увеличивается на 1
    public void increaseVolumeBeforeHundred() {
        Radio increaseVolume = new Radio();

        increaseVolume.increaseVolume(99);

        int expected = 100;
        int actual = increaseVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    // Проверяем, что звук с 1 до 100 уменьшается на 1
    public void decreaseVolumeFromOneToHundred() {
        Radio decreaseVolume = new Radio();

        decreaseVolume.decreaseVolume(100);

        int expected = 99;
        int actual = decreaseVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    // Проверяем, что можно выставить звук от 0 до 100
    public void setVolumeFromZeroToHundred() {
        Radio setVolume = new Radio();

        setVolume.setCurrentVolume(80);

        int expected = 80;
        int actual = setVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

