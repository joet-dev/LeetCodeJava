
class hardProblem {

    public static int xcoord(int x) {

        return x; 
    }
    public static double[] checkCoord(double coord) {
        double x = (coord - Math.floor(coord))*4; 
        double y = Math.floor(coord); 
        double[] arr = {x, y};
        System.out.println(x + " " + y);
        return arr; 
    }

    public static boolean check(int[] input) {
        if(input.length == 1) return true;        

        double max = input[input.length-1]; 
        double min = input[0];       

        double minVal = min/4.0000;
        double maxVal = max/4.0000; 

        double[] minCoord = checkCoord(minVal);
        double[] maxCoord = checkCoord(maxVal); 

        for (int i=1; i<input.length-1; i++) {
            double[] inputCoord = checkCoord((double) input[i]/4);  
            if (inputCoord[0] < minCoord[0] || inputCoord[0] > maxCoord[0]) return false; 
            if (inputCoord[1] < minCoord[1] || inputCoord[1] > maxCoord[1]) return false;    
        }

        double val = (maxCoord[0]*minCoord[0])*(maxCoord[1]*minCoord[1]);
        if (val == 0) return true; 
        if (input.length == val) return true; 
        else return false;    
    }

    public static void main(String[] args) {
        int[] input = {5, 2}; 
        System.out.println(check(input)); 
    }
}