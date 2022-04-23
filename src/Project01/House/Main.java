package Project01.House;

public class Main {
    public static void main(String[] args) {
        House houseWithPool = new House.HouseBuilder(3,1,1)
                                       .setHasPool(true).build();
        System.out.print("houseWithPool has: "+houseWithPool.getRooms() + " rooms " + houseWithPool.getBathrooms() + " bathroom "
                                                                                        + houseWithPool.getKitchens() + " kitchen ");
        if(houseWithPool.HasPool())
            System.out.print(" and one pool");

        House houseWithGardenAndPool = new House.HouseBuilder(5, 2, 2)
                                                            .setHasGarden(true)
                                                            .setGardenSize(24.3f)
                                                            .setHasGarden(true).build();
        System.out.println("\n");
        System.out.print("houseWithGardenAndPool has: "+houseWithGardenAndPool.getRooms() + " rooms " + houseWithGardenAndPool.getBathrooms() + " bathrooms "
                + houseWithGardenAndPool.getKitchens() + " kitchens ");
        if(houseWithGardenAndPool.HasPool())
            System.out.print(" and one pool");
        if(houseWithGardenAndPool.HasGarden())
            System.out.println(" and one garden of size " + houseWithGardenAndPool.getGardenSize());

    }
}
