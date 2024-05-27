package app.communicator.actions;

import java.util.ArrayList;
import java.util.List;

import org.mentawai.core.ApplicationManager;
import org.mentawai.core.BaseAction;
import org.mentawai.core.Configurable;

import app.communicator.beans.EmployeeEntity;
import app.communicator.dao.CommunicatorDAO;

public class CommunicatorAction extends BaseAction implements Configurable {

	private CommunicatorDAO communicatorDAO;
	
	@Override
	public void configure( ApplicationManager appManager ){
		appManager.ioc( "communicatorDAO", app.communicator.dao.CommunicatorDAO.class );
		appManager.action( "/communicatorAction/Communicator", this.getClass() )
		.on( "HOME_APP", "/WEB-INF/app/communicator/appHome.jsp" );
	}
	
	public String startApp() throws Exception {		
		communicatorDAO.clearAllEmployees();
		
		List<EmployeeEntity> listAllEmployees = this.getAllEmployees();
		
		for( EmployeeEntity employee: listAllEmployees ){
			  communicatorDAO.insertEmployees( employee );
		}
		
		List<EmployeeEntity> listElegibleEmployees = communicatorDAO.listEmployees( 1 );
		
		this.output.setValue( "listElegibleEmployees", listElegibleEmployees );
		
		return "HOME_APP";
	}
		
	protected List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> listAllEmployees = new ArrayList<EmployeeEntity>();
		
		EmployeeEntity employee1 = new EmployeeEntity();
		employee1.setNmEmployee( "EMPLOYEE ONE" );
		employee1.setNmSector( "EXPEDI��O" );
		employee1.setStatus( 1 );
		employee1.setAvailableCall( 1 );
				
		EmployeeEntity employee2 = new EmployeeEntity();
		employee2.setNmEmployee( "EMPLOYEE TWO" );
		employee2.setNmSector( "JURIDICO" );
		employee2.setStatus( 0 );
		employee2.setAvailableCall( 2 );
				
		EmployeeEntity employee3 = new EmployeeEntity();
		employee3.setNmEmployee( "EMPLOYEE THREE" );
		employee3.setNmSector( "SAC" );
		employee3.setStatus( 1 );
		employee3.setAvailableCall( 3 );
		
		EmployeeEntity employee4 = new EmployeeEntity();
		employee4.setNmEmployee( "EMPLOYEE FOUR" );
		employee4.setNmSector( "RECEP��O" );
		employee4.setStatus( 1 );
		employee4.setAvailableCall( 2 );
		
		listAllEmployees.add( employee1 );
		listAllEmployees.add( employee2 );
		listAllEmployees.add( employee3 );
		listAllEmployees.add( employee4 );
		
		return listAllEmployees;
	}
}