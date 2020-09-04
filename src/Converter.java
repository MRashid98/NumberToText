
public class Converter {

	private String ans = "";

	public void printAnswer(int n) {

		breakDownNumber(n);
		System.out.println(ans);

	}

	private void breakDownNumber(int n) {

		int unit = n / 10;

		int thirdVal = (n % 1000) / 100;
		int secondVal = (n % 100) / 10;

		int len = Integer.toString(n).length();

		switch (len) {
		case 1:
			ones(n);
			break;
		case 2:
			if (n / 10 == 1) {
				teens(n % 10);
			} else {
				tens(unit);
				ones(n - (unit * 10));
			}
			break;
		case 3:

			hundreds(n / 100);
			if (secondVal == 1) {
				teens(n % 10);
			} else {
				tens(secondVal);
				ones(n - (unit * 10));
			}
			break;
		case 4:
			thousands(n / 1000);
			hundreds(thirdVal);
			if (((n % 100)/10) == 1) {
				teens(n % 10);
			} else {
				tens(secondVal);
				ones(n - (unit * 10));
			}
			break;
		}
	}

	private void ones(int n) {

		switch (n) {
		case 1:
			ans += "one";
			break;
		case 2:
			ans += "two";
			break;
		case 3:
			ans += "three";
			break;
		case 4:
			ans += "four";
			break;
		case 5:
			ans += "five";
			break;
		case 6:
			ans += "six";
			break;
		case 7:
			ans += "seven";
			break;
		case 8:
			ans += "eight";
			break;
		case 9:
			ans += "nine";
			break;
		}

	}

	private void teens(int n) {
		switch (n) {
		case 10:
			ans += "ten";
			break;
		case 11:
			ans += "eleven";
			break;
		case 12:
			ans += "twelve";
			break;
		case 13:
			ans += "thirteen";
			break;
		case 15:
			ans += "fifteen";
			break;
		default:
			ones(n);
			ans += "teen";
		}
	}

	private void tens(int n) {

		switch (n) {

		case 2:
			ans += "twenty";
			break;
		case 3:
			ans += "thirty";
			break;
		case 4:
			ans += "fourty";
			break;
		case 5:
			ans += "fifty";
			break;
		case 6:
			ans += "sixty";
			break;
		case 7:
			ans += "seventy";
			break;
		case 8:
			ans += "eighty";
			break;
		case 9:
			ans += "ninety";
			break;
		}
		ans += " ";
	}

	private void hundreds(int n) {

		ones(n);
		ans += " hundred and ";

	}

	private void thousands(int n) {
		ones(n);
		ans += " thousand ";
	}
}
