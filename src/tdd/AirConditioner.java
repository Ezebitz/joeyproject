package src.tdd;

public class AirConditioner {
    public boolean isOn;
    public boolean isOff;
    public int temperature;

    public void turnOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        if (temperature == 16) {
            return isOn;
        } else {
            return false;
        }


//        public boolean turnOff ( boolean isOff ){
//            this.isOff = isOff;
//        }
//
//        public int getTemperature ( int temperature){
//            return temperature;
//        }
//
//        public boolean isOff () {
//            return true;
//        }
//
//        public void increaseTemperature (int temperature){
//            this.temperature = temperature;
//            this.temperature += 1;
//        }
//
//        // public int getTemperature() {
//        //     return temperature;
//        //  }
//
//        public void decreaseTemperature () {
//            this.temperature -= 1;
//
//        }
      //  ?
//
//
//        public int temperatureAt16 () {
//            if (temperature == 16) {
//                return temperature;
//            } else {
//                return 0;
//            }
//        }
    }
}

