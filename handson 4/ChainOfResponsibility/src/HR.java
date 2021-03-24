
public class HR implements ILeaveRequestHandler{

	ILeaveRequestHandler nextHandler=null;
	
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int leaveDays = leaveRequest.getLeaveDays();
		
		if(leaveDays>7)
		{
			System.out.println("Meet HR to get Leave Request approved");
		}
		else
			System.out.println("Leave was approved by HR for "+leaveRequest.getEmployeeName());
		
	}

}
