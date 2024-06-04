package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Mes {
	List<String> mesos;

	public Mes() {
		mesos = new ArrayList<>();	
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Decembre");
	}

	public List<String> getMesos() {
		return mesos;
	}	
}
