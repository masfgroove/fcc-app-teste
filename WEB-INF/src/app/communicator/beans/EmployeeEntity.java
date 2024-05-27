package app.communicator.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author jssantos
 *
 */
@Entity
@Table(name="FUNCIONARIO")
public class EmployeeEntity implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	public EmployeeEntity() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_FUNCIONARIO")
	private Integer cdEmployee;	
	
	@Column(name="NM_FUNCIONARIO")
	private String nmEmployee;	
	
	@Column(name="NM_SETOR")
	private String nmSector;	
	
	@Column(name="STATUS")
	private Integer status;
	
	@Column(name="CHAMADA_DISPONIVEL")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableCall == null) ? 0 : availableCall.hashCode());
		result = prime * result + ((cdEmployee == null) ? 0 : cdEmployee.hashCode());
		result = prime * result + ((nmEmployee == null) ? 0 : nmEmployee.hashCode());
		result = prime * result + ((nmSector == null) ? 0 : nmSector.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		if (availableCall == null) {
			if (other.availableCall != null)
				return false;
		} else if (!availableCall.equals(other.availableCall))
			return false;
		if (cdEmployee == null) {
			if (other.cdEmployee != null)
				return false;
		} else if (!cdEmployee.equals(other.cdEmployee))
			return false;
		if (nmEmployee == null) {
			if (other.nmEmployee != null)
				return false;
		} else if (!nmEmployee.equals(other.nmEmployee))
			return false;
		if (nmSector == null) {
			if (other.nmSector != null)
				return false;
		} else if (!nmSector.equals(other.nmSector))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeBean [cdEmployee=" + cdEmployee + ", nmEmployee=" + nmEmployee + ", nmSector=" + nmSector
				+ ", status=" + status + ", availableCall=" + availableCall + "]";
	}	
}