package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	
	private Recorder recorder; //Recorder ��ü�� �ּҰ��� �Ҵ� 

	//setter ���ؼ� Recorder ��ü�� �ּҸ� ����
	public Recorder getRecorder() {
		return recorder;
	}
	
	@Autowired //by type (IOC 컨테이너 안에 Recorder 타입을 갖는 객체가 있으면 자동주입)
	public void setRecorder(Recorder a) {
		this.recorder = a;
		System.out.println("주입완료!");
	}
	
	
}
