package ���01;

public class TellMain {

	public static void main(String[] args) {
		Tell tell = new Tell();
		tell.Call();
		tell.ButtonClick();

		// �θ� �ִ� ����� ���� ��� �޾ұ⶧����
		// �ۼ������� �ʾƵ� ����� ��밡���ϴ�
		Folder folder = new Folder();
		folder.Call();
		folder.Camera();
		folder.ButtonClick();
	}

}
