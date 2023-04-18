    package ua.lviv.iot.algo.part1.lab1;

    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import lombok.ToString;

    @Getter
    @Setter
    @NoArgsConstructor
    @ToString(callSuper = true)
    public class GamingLaptop extends Laptop {

        private String graphicsProcessor;

        private int fansNumber;

        private static String Headers = " numberOfFans, graphicsProcessor \n";

        public GamingLaptop(final String model, final double screenSize, final int ram, final int storage,
                            final int batteryLife, final int batteryLevel, final String graphicsProcessor,
                            final int fansNumber) {
            super(model, screenSize, ram, storage, batteryLife, batteryLevel);
            this.graphicsProcessor = graphicsProcessor;
            this.fansNumber = fansNumber;
        }

        @Override
        public String getHeaders() {
            return super.getHeaders() + ", " + Headers;
        }

        @Override
        public String toCSV() {
            return  super.toCSV() + ", " + fansNumber + ", " + graphicsProcessor + "\n";
        }

        @Override
        public boolean replaceBattery(final int newCapacity) {
            this.setBatteryLife(newCapacity);
            this.setBatteryLevel(BATTERY_LEVEL_FULL);
            return true;
        }

        private static final int BATTERY_LEVEL_FULL = 100;
    }
