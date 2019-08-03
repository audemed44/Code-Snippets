class Twofer {
    String twofer(String name) {
        String s = "One for you, one for me.";
        String s2 = "One for " + name + ", one for me.";
        if(name==null)
            return s;
        return s2;
    }
}
