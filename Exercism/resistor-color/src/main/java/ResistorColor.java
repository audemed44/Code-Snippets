class ResistorColor {
    private final String colorMapping[] = {"black", "brown","red","orange","yellow","green","blue","violet","grey","white" };
   
    int colorCode(String color) {
       
        return java.util.Arrays.asList(colorMapping).indexOf(color);
    }

    String[] colors() {
       
        return colorMapping;
    }
}
