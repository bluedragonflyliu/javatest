class PoolPuzzleOne {
	public static void main (String [] args) {
		int x = 0;
		while ( x < 4 ) {
			System.out.print("a");
			if ( x < 1){
				System.out.print(" ");
			}
			x = x-1;
			if (x > 0) {
				System.out.print("n");
				x = x+1;

			}
			if (x == 1) {
				System.out.print("noys");
			}
			if (x < 1) {
				System.out.print("noise");
			}
			System.out.print("");
			x = x+2;
		}
	}
}