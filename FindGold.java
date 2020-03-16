package march;

class Solution {
	public String[] solution(int n, int[] arrayint1, int[] arrayint2) {

		String[] array = new String[n];
		String[] array2 = new String[n];
		String[] finalarray = new String[n];
		String str2 = "";

		String[] split1 = null;
		String[] split2 = null;
		String finalstr = "";

		for (int i = 0; i < arrayint1.length; i++) {
			int ab = arrayint1[i];
			String str = Integer.toBinaryString(ab);
			if (str.length() != n) {
				int abcd = n - str.length();
				for (int num = 1; num <= abcd; num++) {
					str2 += "0";
				}
				String realstr = str2 + str;
				array[i] = realstr;
				str2 = "";

			} else {
				array[i] = str;
			}
		}

		for (int i = 0; i < arrayint2.length; i++) {
			int ab = arrayint2[i];
			String str = Integer.toBinaryString(ab);
			if (str.length() != n) {
				int abcd = n - str.length();
				for (int num = 1; num <= abcd; num++) {
					str2 += "0";
				}
				String realstr = str2 + str;
				array2[i] = realstr;
				str2 = "";
			} else {
				array2[i] = str;
			}
		}

		for (int i = 0; i < array.length; i++) {
			String arraystr1 = array[i];
			String arraystr2 = array2[i];

			split1 = arraystr1.split("");
			split2 = arraystr2.split("");

			for (int t = 0; t < split1.length; t++) {
				String splitstr = split1[t];
				String splitstr2 = split2[t];
				if (splitstr.equals("1") || splitstr2.equals("1")) {
					finalstr += "#";
				} else {
					finalstr += " ";
				}
			}
			System.out.println(i + "번쨰" + finalstr);
			finalarray[i] = finalstr;
			finalstr = "";
			// 초기화

		}

		for (int t = 0; t < finalarray.length; t++) {
			System.out.print(finalarray[t] + " , ");
		}

		return finalarray;
	}
}
