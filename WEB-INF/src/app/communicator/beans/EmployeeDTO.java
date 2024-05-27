package app.communicator.beans;

import java.io.Serializable;

public class EmployeeDTO implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private Integer cdEmployee;	
	private String nmEmployee;	
	private String nmSector;	
	private Integer status;
	private Integer availableCall;

	public Integer getCdEmployee() {
		return cdEmployee;
	}

	public void setCdEmployee(Integer cdEmployee) {
		this.cdEmployee = cdEmployee;
	}

	public String getNmEmployee() {
		return nmEmployee;
	}

	public void setNmEmployee(String nmEmployee) {
		this.nmEmployee = nmEmployee;
	}

	public String getNmSector() {
		return nmSector;
	}

	public void setNmSector(String nmSector) {
		this.nmSector = nmSector;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAvailableCall() {
		return availableCall;
	}

	public void setAvailableCall(Integer availableCall) {
		this.availableCall = availableCall;
	}
}