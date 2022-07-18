class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        char[] numSteps;
        numSteps = path.toCharArray();

        int pos = 0;
        int prevPos;
        int numValley = 0;

        for (int i=0; i <= numSteps.length - 1; i++) {
            switch (numSteps[i]) {
                case 'U' -> {
                    prevPos = pos;
                    pos++;
                    if (prevPos < 0 && pos == 0) {
                        numValley++;
                    }
                }
                case 'D' -> {
                    prevPos = pos;
                    pos--;
                    if (prevPos < 0 && pos == 0) {
                        numValley++;
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + numSteps[i]);
            }
        }

        System.out.println(numValley);
        return numValley;
    }

}

