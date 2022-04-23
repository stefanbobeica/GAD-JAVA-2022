package Project01.House;

public class House {
    private int rooms;
    private int bathrooms;
    private int kitchens;
    //In order to be a house a building has to have atleast one room, kitchen and bathroom so these parameters are not optional
    private boolean hasPool;
    private boolean hasGarden;
    private float gardenSize;

    public int getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getKitchens() {
        return kitchens;
    }

    public boolean HasGarden() {
        return hasGarden;
    }

    public boolean HasPool() {
        return hasPool;
    }


    private House(HouseBuilder builder){
        this.bathrooms = builder.bathrooms;
        this.rooms = builder.rooms;
        this.kitchens = builder.kitchens;
        this.hasGarden = builder.hasGarden;
        this.hasPool = builder.hasPool;
        this.gardenSize = builder.gardenSize;
    }

    public float getGardenSize() {
        return gardenSize;
    }

    public static class HouseBuilder{
        private int rooms;
        private int bathrooms;
        private int kitchens;
        private boolean hasPool;
        private boolean hasGarden;
        private float gardenSize;
        public HouseBuilder(int rooms, int bathrooms, int kitchens){
            this.rooms = rooms;
            this.bathrooms = bathrooms;
            this.kitchens = kitchens;
        }


        public HouseBuilder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setGardenSize(float gardenSize){
            this.gardenSize = gardenSize;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}
