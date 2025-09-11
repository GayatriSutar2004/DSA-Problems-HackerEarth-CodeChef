class Result {

    public static int countingValleys(int steps, String path) {
        int altitude = 0;   // current level
        int valleys = 0;    // number of valleys

        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);

            if (step == 'U') {
                altitude++;
                if (altitude == 0) {  // just came up to sea level
                    valleys++;
                }
            } else if (step == 'D') {
                altitude--;
            }
        }

        return valleys;
    }
}
