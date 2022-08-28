package paket;

public class TestingField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(textEditor ("Hell elan vaslödjan aso.dla.sk.lnd. asijdasd aklsjd. iaklsdjahn aslkdj"));
		System.out.println ("");

		System.out.println(textEditor ("Hell elan vaslödjan aso.dla.sk.lnd. asijdasd aklsjd. iaklsdjahn aslkdj"));

		System.out.println(textEditor ("Hell elan vaslödjan aso.dla.sk.lnd. asijdasd aklsjd. iaklsdjahn aslkdj"));

		System.out.println(textEditor ("Hell elan vaslödjan aso.dla.sk.lnd. asijdasd aklsjd. iaklsdjahn aslkdj"));

		
	}
	
	static String textEditor(String mening) {
		while(mening.length() > 0 && mening.indexOf(".") != -1) {

			mening = mening.substring(0, mening.indexOf('.'))
	    +" \n"  +mening.substring(mening.indexOf('.')
              +1, mening.length());
					}
		
		return mening;
		
	}


	
	
}


