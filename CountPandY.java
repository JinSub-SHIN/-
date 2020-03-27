package march;

public class CountPandY {

	public static void main(String[] args) {


		//https://programmers.co.kr/learn/courses/30/lessons/12916
		/**
		 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를
		 * return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할
		 * 때 대문자와 소문자는 구별하지 않습니다.
		 *
		 * 예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.
		 *
		 * 제한사항 문자열 s의 길이 : 50 이하의 자연수 문자열 s는 알파벳으로만 이루어져 있습니다.
		 */

		String str = "pPoooyY";
		String rename = str+"A";
		String capitalstr = rename.toUpperCase();

		String[] arrayp = capitalstr.split("P");
		String[] arrayy = capitalstr.split("Y");
		
		if (arrayp.length == arrayy.length) {
			System.out.println("두배열의길이는같습니다");
			for (int i = 0; i < arrayp.length; i++) {
				System.out.println("ArrayP의" + i + "번째방에들어있는숫자 : " + arrayp[i]);
				System.out.println("ArrayY의" + i + "번째방에들어있는숫자 : " + arrayy[i]);
			}

		} else {
			System.out.println("두배열의길이는다릅니다");
			for (int i = 0; i < arrayp.length; i++) {
				System.out.println("ArrayP의" + i + "번째방에들어있는숫자 : " + arrayp[i]);
			}
			for (int y = 0; y < arrayy.length; y++) {
				System.out.println("ArrayY의" + y + "번째방에들어있는숫자 : " + arrayy[y]);
			}
		}

	}

}
