public class Plant {

    private int id;
    private String plantName;
    private String species;
    private String location;
    private String plantingDate;

    public Plant(int id, String plantName, String species,
                 String location, String plantingDate) {
        this.id = id;
        this.plantName = plantName;
        this.species = species;
        this.location = location;
        this.plantingDate = plantingDate;
    }

    public int getId() {
        return id;
    }

    public String getPlantName() {
        return plantName;
    }

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }

    public String getPlantingDate() {
        return plantingDate;
    }
}
