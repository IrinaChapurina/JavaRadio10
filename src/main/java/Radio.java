public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        maxStation = 9;
        maxVolume = 100;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            currentStation = maxStation;
        }

        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }

        this.currentVolume = currentVolume;
    }

    //
    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    // плюс и минус
    public void plus() {
        if (currentVolume != maxVolume) {
            currentVolume++;
            return;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void minus() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        //

    }
}









