package ���01;

public class Folder extends Tell {
	// ��ӹ��� ����(�ڽ�) Ŭ����
	// ����Ŭ������ extends ����Ŭ������
	// ����Ŭ������ �ִ� �����Ϳ� ����� ���� ��������.

	// Ȯ��-> �ʿ��� ��ɸ� �߰��� ����
	public void Camera() {
		System.out.println("������ ���.");
	}

	// �������̵�-> ������
	@Override // ������̼� : �������̵��ƴٰ� ǥ���� �����ּ�
	public void ButtonClick() {
		// ����� �����޶� �������
		// �ٸ� �̸��� ���ƾ���.
		System.out.println("�� �� �� ��ư�� Ŭ���մϴ�.");
	}

}
