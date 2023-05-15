import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    // Проверяем, что можно установить номер радиостанции, если он в промежутке от 0 до 9
    public void shouldSetRadioStation() {
        Radio setNewRadioStation = new Radio();

        setNewRadioStation.setCurrentRadioStation(9);

        int expected = 9;
        int actual = setNewRadioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что нельзя установить отрицательный номер радиостанции
    public void shouldNotSetNegativeValueRadioStation() {
        Radio setNewRadioStation = new Radio();

        setNewRadioStation.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = setNewRadioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что нельзя установить номер радиостанции, который больше 9
    public void shouldNotSetValueRadioStationMoreThatNine() {
        Radio setNewRadioStation = new Radio();

        setNewRadioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = setNewRadioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что каналы от 0 до 8 увеличиваются на 1
    public void channelsFromZeroToEightIncrease() {
        Radio nextRadioStation = new Radio();

        nextRadioStation.next(0);

        int expected = 1;
        int actual = nextRadioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что 9 канал при увеличении становится 0
    public void channelNineIncrease() {
        Radio nextRadioStation = new Radio();

        nextRadioStation.next(9);

        int expected = 0;
        int actual = nextRadioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что каналы от 1 до 9 уменьшаются на 1
    public void channelsFromOneToNineDecrease() {
        Radio nextRadioStation = new Radio();

        nextRadioStation.prev(1);

        int expected = 0;
        int actual = nextRadioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что 0 канал при уменьшении становится 9
    public void channelZeroDecrease() {
        Radio nextRadioStation = new Radio();

        nextRadioStation.prev(0);

        int expected = 9;
        int actual = nextRadioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что звук с 0 до 99 увеличивается на 1
    public void increaseVolumeBeforeHundred() {
        Radio increaseVolume = new Radio();

        increaseVolume.increaseVolume(99);

        int expected = 100;
        int actual = increaseVolume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что звук не увеличивается больше 100
    public void increaseVolumeAfterHundred() {
        Radio increaseVolume = new Radio();

        increaseVolume.increaseVolume(100);

        int expected = 100;
        int actual = increaseVolume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что звук с 1 до 100 уменьшается на 1
    public void decreaseVolumeFromOneToHundred() {
        Radio decreaseVolume = new Radio();

        decreaseVolume.decreaseVolume(100);

        int expected = 99;
        int actual = decreaseVolume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что звук равный 0 не уменьшается
    public void decreaseVolumeZero() {
        Radio decreaseVolume = new Radio();

        decreaseVolume.decreaseVolume(0);

        int expected = 0;
        int actual = decreaseVolume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что можно выставить звук от 0 до 100
    public void setVolumeFromZeroToHundred() {
        Radio setVolume = new Radio();

        setVolume.setCurrentVolume(80);

        int expected = 80;
        int actual = setVolume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что нелья выставить отрицательное значение звука
    public void setVolumeBelowZero() {
        Radio setVolume = new Radio();

        setVolume.setCurrentVolume(-80);

        int expected = 0;
        int actual = setVolume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    // Проверяем, что нелья выставить значение звука больше 100
    public void setVolumeAfterHundred() {
        Radio setVolume = new Radio();

        setVolume.setCurrentVolume(120);

        int expected = 0;
        int actual = setVolume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}
