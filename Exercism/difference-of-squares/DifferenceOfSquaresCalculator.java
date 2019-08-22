class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
         
        int squareOfSum = (input * (input+1))/2;
        squareOfSum = squareOfSum*squareOfSum;
        return squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        
        int sumOfSquares = (input * (input+1) * (2*input + 1))/6;
        return sumOfSquares;
        
    }

    int computeDifferenceOfSquares(int input) {

        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
        
    }

}
