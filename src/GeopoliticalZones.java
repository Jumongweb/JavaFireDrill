public enum GeopoliticalZones {
    NORTH_CENTRAL(new String[]{"Benue", "F.C.T", "kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST(new String[]{"Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "River"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    final String[] state;
    GeopoliticalZones(String[] state) {
        this.state = state;
    }

    public String[] getState(){
        return state;
    }
    public GeopoliticalZones getZone(String state){
        for (GeopoliticalZones zone : GeopoliticalZones.values()){
            for (String states : zone.state){
                if (state.equalsIgnoreCase(states)){
                    return zone;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        GeopoliticalZones geopoliticalZones = NORTH_CENTRAL;
        System.out.println(geopoliticalZones.getZone("oyo"));
    }


}