
public class TshirtTester {
	public static void tshirtSizeTest() {
		assert(tshirts.size(37) == "S");
        assert(tshirts.size(38) == "M");
        assert(tshirts.size(40) == "M");
        assert(tshirts.size(42) == "L");
        assert(tshirts.size(43) == "L");
		
	}
}
