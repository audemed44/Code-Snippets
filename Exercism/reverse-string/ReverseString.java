class ReverseString {

    String reverse(String inputString) {
        StringBuilder input1 = new StringBuilder();
        input1.append(inputString);
        input1=input1.reverse();
        return input1.toString();
    }
  
}