package fruitbasket.designmodel.decorator;

public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println(
				"�𾴵�У����\n"
				+"......\n"
				+"���� 62      ��ѧ 65     ���� 98     ��Ȼ 63");
	}

	@Override
	public void sign(String name) {
		System.out.println("�ҳ�ǩ����"+name);
	}

}
