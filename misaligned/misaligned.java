public class misaligned {
	
    static int printColorMap(String[] majorColors,String[] minorColors) { 
        int i = 0, j = 0;
        for(i = 0; i < majorColors.length; i++) {
            for(j = 0; j <minorColors.length ; j++) {
                System.out.println(formatColorMap(i,j, majorColors, minorColors));
            }
        }
        return majorColors.length * minorColors.length ;
    }
    
    static String formatColorMap (int i, int j, String[] majorColors,String[] minorColors) {	
		return  (i * minorColors.length )+ j+1+"|"+ majorColors[i]+"|"+minorColors[j];	
    }
    
    public static void main(String[] args) { 
    	String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        String checkResult = "13|Black|Green";
        int result = printColorMap(majorColors, minorColors);
        assert(result == 25);
        assert(checkResult.equals(formatColorMap(2,3,majorColors,minorColors)));
        System.out.println("All is well (maybe!)");
    }
}
