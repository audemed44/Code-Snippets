class Acronym {

    String acronym;

    Acronym(String phrase) {
        StringBuilder temp = new StringBuilder();
        temp.append((phrase.charAt(0)));
        for(int i = 1; i<phrase.length(); i++)
        {
            if((phrase.charAt(i-1)==' ' || phrase.charAt(i-1) == '-' || phrase.charAt(i-1) == '_') && (Character.isLetter(phrase.charAt(i))))
                temp.append((phrase.charAt(i)));
        }
        acronym = temp.toString().toUpperCase();
    }

    String get() {
        return acronym;
    }

}
