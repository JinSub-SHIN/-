package march;

public class CountPandY {

	public static void main(String[] args) {


		//https://programmers.co.kr/learn/courses/30/lessons/12916
		/**
		 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False��
		 * return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ����
		 * �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
		 *
		 * ���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.
		 *
		 * ���ѻ��� ���ڿ� s�� ���� : 50 ������ �ڿ��� ���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
		 */

		String str = "pPoooyY";
		String rename = str+"A";
		String capitalstr = rename.toUpperCase();

		String[] arrayp = capitalstr.split("P");
		String[] arrayy = capitalstr.split("Y");
		
		if (arrayp.length == arrayy.length) {
			System.out.println("�ι迭�Ǳ��̴°����ϴ�");
			for (int i = 0; i < arrayp.length; i++) {
				System.out.println("ArrayP��" + i + "��°�濡����ִ¼��� : " + arrayp[i]);
				System.out.println("ArrayY��" + i + "��°�濡����ִ¼��� : " + arrayy[i]);
			}

		} else {
			System.out.println("�ι迭�Ǳ��̴´ٸ��ϴ�");
			for (int i = 0; i < arrayp.length; i++) {
				System.out.println("ArrayP��" + i + "��°�濡����ִ¼��� : " + arrayp[i]);
			}
			for (int y = 0; y < arrayy.length; y++) {
				System.out.println("ArrayY��" + y + "��°�濡����ִ¼��� : " + arrayy[y]);
			}
		}

	}

}
