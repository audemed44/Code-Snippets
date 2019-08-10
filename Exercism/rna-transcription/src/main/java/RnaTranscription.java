class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
        char[] dnaComplement = dnaStrand.toCharArray();
        for(int i=0; i < dnaComplement.length ; i++)
        {
                switch(dnaComplement[i]) {
                    case 'G':
                        dnaComplement[i] = 'C';
                        break;
                    case 'C':
                        dnaComplement[i] = 'G';
                        break;
                    case 'T':
                        dnaComplement[i] = 'A';
                        break;
                    case 'A':
                        dnaComplement[i] = 'U';
                        break;
                }

        }
        String rnaStrand = new String(dnaComplement);
        return rnaStrand;

}
}
