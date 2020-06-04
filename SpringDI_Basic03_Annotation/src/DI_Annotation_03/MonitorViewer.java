package DI_Annotation_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
		
	
	private Recorder recorder;

	public MonitorViewer() {
		System.out.println("basic Contructor");
	}
	
	public Recorder getRecorder() {
		return recorder;
	}

	
	//@Autowired(required = true) //기본설정 (무조건 injection)
	//@Autowired
	//@Qualifier("a")
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공 : " + recorder);
	}
	

	
	
}
