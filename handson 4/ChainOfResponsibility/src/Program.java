
public class Program {

	public static void main(String[] args) {

		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setEmployeeName("Virat");
		leaveRequest.setLeaveDays(10);
		ILeaveRequestHandler supervisor = new Supervisor();
		supervisor.handleRequest(leaveRequest);
	}

}
