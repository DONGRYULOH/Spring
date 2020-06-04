package DI_Annotation_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;

public class MonitorViewer {
		
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	@Qualifier("yy")
	@Autowired // 기본설정 true
	//@Resource(name = "zz") //같은 타입이 여러개 있더라고 name 값을 찾는다
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공 : " + recorder);
	}
	
	
	
	
}
