public class misaligned {
	static String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
    static String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
    
    static int printColorMap(String majorColors[],String minorColors[]) { 
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.println(formatColorMap(i,j, majorColors, minorColors));
            }
        }
        return i*j;
    }
    
    static String formatColorMap (int i, int j, String majorColors[],String minorColors[]) {	
		return  (i * 5 )+ j+1+"|"+ majorColors[i]+"|"+minorColors[j];	
    }
    
    public static void main(String[] args) { 
        int result = printColorMap(majorColors, minorColors);
       assert(result == 25);
        System.out.println("All is well (maybe!)");
    }
}
