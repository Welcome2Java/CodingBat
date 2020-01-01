
public class WarmUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarmUp1Impl test = new WarmUp1Impl();
		System.out.println("SleepIn");
		System.out.println(test.sleepIn(true, false));
		System.out.println(test.sleepIn(true, true));
		System.out.println(test.sleepIn(false, false));
		
		System.out.println();
		System.out.println("MonkeyTrouble");
		System.out.println(test.monkeyTrouble(true, false));
		System.out.println(test.monkeyTrouble(true, true));
		System.out.println(test.monkeyTrouble(false, false));
		
		System.out.println();
		System.out.println("SumInt");
		System.out.println(test.sumInt(6, 7));
		System.out.println(test.sumInt(-6, 7));
		System.out.println(test.sumInt(3, 3));
		
		System.out.println();
		System.out.println("diff21");
		System.out.println(test.diff21(19));
		System.out.println(test.diff21(10));
		System.out.println(test.diff21(21));
		
		System.out.println();
		System.out.println("parrotTrouble");
		System.out.println(test.parrotTrouble(true, 6));
		System.out.println(test.parrotTrouble(true, 21));
		System.out.println(test.parrotTrouble(false, 6));
		
		System.out.println();
		System.out.println("makes10");
		System.out.println(test.makes10(9, 10));
		System.out.println(test.makes10(9, 9));
		System.out.println(test.makes10(1, 9));
		
		System.out.println();
		System.out.println("nearHundred");
		System.out.println(test.nearHundred(93));
		System.out.println(test.nearHundred(90));
		System.out.println(test.nearHundred(89));
		
		System.out.println();
		System.out.println("posNeg");
		System.out.println(test.posNeg(-4, -5, false));
		System.out.println(test.posNeg(-1, 1, false));
		System.out.println(test.posNeg(-4, -5, true));
		
		System.out.println();
		System.out.println("notString");
		System.out.println(test.notString("candy"));
		System.out.println(test.notString("x"));
		System.out.println(test.notString("not bad"));
		
		System.out.println();
		System.out.println("frontBack");
		System.out.println(test.frontBack("code"));
		System.out.println(test.frontBack("a"));
		System.out.println(test.frontBack("ab"));
		
		System.out.println();
		System.out.println("front3");
		System.out.println(test.front3("Java"));
		System.out.println(test.front3("Chocoalte"));
		System.out.println(test.front3("abc"));
		
		System.out.println();
		System.out.println("backAround");
		System.out.println(test.backAround("cat"));
		System.out.println(test.backAround("Hello"));
		System.out.println(test.backAround("a"));
		
		System.out.println();
		System.out.println("0r35");
		System.out.println(test.or35(3));
		System.out.println(test.or35(10));
		System.out.println(test.or35(8));
		
		System.out.println();
		System.out.println("front22");
		System.out.println(test.front22("kitten"));
		System.out.println(test.front22("ha"));
		System.out.println(test.front22("abc"));
		
		
	}

}
