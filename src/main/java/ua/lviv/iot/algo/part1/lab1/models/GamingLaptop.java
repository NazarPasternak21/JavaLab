    package ua.lviv.iot.algo.part1.lab1.models;

    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import lombok.ToString;

    @Getter
    @Setter
    @NoArgsConstructor
    @ToString(callSuper = true)
    public class GamingLaptop extends Laptop {

        private String graphicsProcessorName;

        private int numberOfFans;

        private static String headers = "numberOfFans, graphicsProcessorName\n";

        public GamingLaptop(final String model, final double screenSize, final int ram, final int storage,
                            final int batteryLife, final int batteryLevel, final String graphicsProcessorName,
                            final int numberOfFans) {
            super(model, screenSize, ram, storage, batteryLife, batteryLevel);
            this.graphicsProcessorName = graphicsProcessorName;
            this.numberOfFans = numberOfFans;
        }

        @Override
        public String getHeaders() {
            return super.getHeaders() + ", " + headers;
        }

        @Override
        public String toCSV() {
            return super.toCSV() + ", " + numberOfFans + ", " + graphicsProcessorName + "\n";
        }

        @Override
        public boolean replaceBattery(final int newCapacity) {
            this.setBatteryLife(newCapacity);
            this.setBatteryLevel(BATTERY_LEVEL_FULL);
            return true;
        }

        private static final int BATTERY_LEVEL_FULL = 100;
    }
