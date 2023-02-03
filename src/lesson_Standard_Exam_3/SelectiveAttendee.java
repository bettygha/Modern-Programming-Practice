package lesson_Standard_Exam_3;

import java.util.ArrayList;
import java.util.List;

public class SelectiveAttendee extends Attendee {

	List<Session> sessions;

	public SelectiveAttendee(String nameString, String addressString) {
		super(nameString, addressString);
		this.sessions = new ArrayList<>();
	}

	@Override
	public double getRegistrationFee() {
		// TODO Auto-generated method stub
		double total = 0;
		for (Session session : sessions) {
			total += session.getFee();
		}
		return total;
	}

	public void addSession(Session session) {
		sessions.add(session);
	}

	public double smallestFee() {
		double smallest = Double.MAX_VALUE;
		for (Session session : sessions) {
			if (session.getFee() < smallest) {
				smallest = session.getFee();
			}

		}
		return smallest;

	}
}
