package Logic_1;

public interface Logic_1_Interface {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            if(cigars >= 40){
                return true;
            }
        }
        if(cigars >= 40 && cigars <= 60){
            return true;
        }
        return false;
    }
    
    //none of the following below are used currently
    public static int dateFashion(int you, int date) {
		if (you == 2 || date == 2) {
			return 0;
		}

		if ((you >= 8 && date >= 8) || (you >= 8 || date >= 8)) {
			return 2;
		}
		if ((you >= 8 && date <= 2) || (you <= 2 && date >= 8)) {
			return 0;
		}
		if ((you >= 5 && date <= 2) || (you <= 2 && date >= 5) || (you <= 2 && date <= 2)) {
			return 0;
		}

		return 1;
	}
    
    public static boolean squirrelPlay(int temp, boolean isSummer) {
    	  if(!isSummer){
    	    if(temp>=60 && temp<=90){
    	      return true;
    	    }else{
    	      return false;
    	    }
    	  }
    	   if(temp>=60 && temp<=100){
    	      return true;
    	    }else{
    	      return false;
    	    }
    	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (!isBirthday) {
			if (speed < 61) {
				return 0;
			} else if (speed >= 61 && speed <= 80) {
				return 1;
			} else {
				return 2;
			}
		}
		if (speed < 66) {
			return 0;
		} else if (speed >= 66 && speed <= 85) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public static int sortaSum(int a, int b) {
		  int sum = a+b;
		  if (sum>=10 && sum <=19){
		    return 20;
		  }else{
		    return sum;
		  }
		}
	
	public static String alarmClock(int day, boolean vacation) {
		if (!vacation) {
			if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
				return "7:00";
			} else {
				return "10:00";
			}
		}
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			return "10:00";
		} else {
			return "off";
		}

	}

	public static boolean love6(int a, int b) {
		return ((a == 6 || b == 6) || (a + b == 6) || (Math.abs(a - b) == 6));
	}

	public static boolean in1To10(int n, boolean outsideMode) {
		if (!outsideMode) {
			return ((n >= 1 && n <= 10));
		}
		return ((n <= 1 || n >= 10));
	}

	public static boolean specialEleven(int n) {
		return (n % 11 == 0 || n % 11 == 1);

	}

	public static boolean more20(int n) {

		return (n % 20 == 1 || n % 20 == 2);

	}
	
	public static boolean old35(int n) {
		if (n % 3 == 0) {
			if (n % 5 == 0) {
				return false;
			}
			return true;
		}
		if (n % 5 == 0) {
			if (n % 3 == 0) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static boolean nearTen(int num) {
		return (num % 10 == 2 || num % 10 == 1 || num % 10 == 0 || num % 10 == 8 || num % 10 == 9);
	}
	
	public static int teenSum(int a, int b) {
		  if((a>=13 && a<=19) || (b>=13 && b<=19)){
		    return 19;
		  }
		  return a+b;
		}

	public static String fizzString(String str) {
		  if(str.charAt(0)== 'f' && str.charAt(str.length()-1)=='b'){
		    return "FizzBuzz";
		  } else if (str.charAt(0)== 'f'){
		    return "Fizz";
		  } else if( str.charAt(str.length()-1)=='b'){
		    return "Buzz";
		  }
		  return str;
		}

	public static boolean twoAsOne(int a, int b, int c) {
		  if(a+b ==c || b+c ==a || a+c==b){
		    return true;
		  }
		  return false;
		}
}
