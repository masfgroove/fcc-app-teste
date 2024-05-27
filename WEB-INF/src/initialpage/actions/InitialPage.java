package initialpage.actions;

import java.util.ArrayList;
import java.util.List;

import org.mentawai.core.ApplicationManager;
import org.mentawai.core.BaseAction;
import org.mentawai.core.Configurable;
import org.mentawai.core.Forward;

import initialpage.beans.AplicationBean;
import initialpage.dao.InitialPageDAO;

/**
 * 
 * @author jssantos
 *
 */
public class InitialPage extends BaseAction implements Configurable {

	protected static final String CONTEXT_PATH = "fcc-app-teste";
	private InitialPageDAO initialPageDAO;
	
	@Override
	public void configure(ApplicationManager appManager) {
		appManager.ioc( "initialPageDAO", initialpage.dao.InitialPageDAO.class );
		appManager.action( "/initialPage/InitialPage", this.getClass() )
		.on( "HOME_APP", "/WEB-INF/initialPage/appHome.jsp" )
		.on( ACCESSDENIED, new Forward("/WEB-INF/initialPage/appHome.jsp") );
	}

	public String login() throws Exception {		
		String candidato = this.input.getString("candidato");
		String nivel     = this.input.getString("nivel");
		
		this.session.setAttribute( "candidato",  candidato );
				
		initialPageDAO.clearAllApplications();
		
		List<AplicationBean> listAllApplications = this.getAllApplications();
		
		for( AplicationBean application: listAllApplications ){
			 initialPageDAO.insertApplications( application );
		}

		List<AplicationBean> listElegibleApplications = initialPageDAO.listApplications();
				
		this.output.setValue( "listElegibleApplications", listElegibleApplications );
				
		return "HOME_APP";		
	}
	
	protected List<AplicationBean> getAllApplications() {
		List<AplicationBean> listAllApplications = new ArrayList<AplicationBean>();
		
		AplicationBean app1 = new AplicationBean();
		app1.setNmAplicativo( "Calendário WEB" );
		app1.setDcAplicativo( "Calendário WEB." );
		app1.setLinkAction( "<a href=\"https://www.calendarr.com/brasil/calendario-2024/\" target='_blank' >" );
		app1.setNomeFim( "<br>Cardápio</a><br><br>&nbsp;</td>" );
		app1.setImagem( "CALENDARIO_CALENDARIO.png" );
		app1.setFlAtivo( 1 );
		app1.setFlFavorito( 0 );
				
		AplicationBean app2 = new AplicationBean();
		app2.setNmAplicativo( "Apache Tomcat" );
		app2.setDcAplicativo( "Documentação Apache Tomcat" );
		app2.setLinkAction( "<a class=\"tomcatDocumentation\" href=\"https://tomcat.apache.org/download-80.cgi\" >" );
		app2.setNomeFim( "<br>Apache Tomcat</a><br><br>&nbsp;</td>" );
		app2.setImagem( "tomcat.png" );
		app2.setFlAtivo( 1 );
		app2.setFlFavorito( 0 );
		
		AplicationBean app3 = new AplicationBean();
		app3.setNmAplicativo( "FCC Communicator" );
	    app3.setDcAplicativo( "App de comunicação entre os colaboradores da FCC." );
		app3.setLinkAction( String.format("<a class=\"modalAppCommunicator\" href=\"/%s/communicatorAction/Communicator.startApp.mtw\" >",CONTEXT_PATH) );
		app3.setNomeFim( "<br>FCC Communicator</a><br><br>&nbsp;</td>" );
		app3.setImagem( "emesene.png" );
		app3.setFlAtivo( 1 );
		app3.setFlFavorito( 0 );	
				
		AplicationBean app4 = new AplicationBean();
		app4.setNmAplicativo( "FCC" );
		app4.setDcAplicativo( "Site institucional da Fundação carlos Chagas." );
		app4.setLinkAction( "<a href=\"https://www.fcc.org.br/fcc/\" target='_blank' >" );
		app4.setNomeFim( "<br>FCC</a><br><br>&nbsp;</td>" );
		app4.setImagem( "fcc.jpg" );
		app4.setFlAtivo( 1 );
		app4.setFlFavorito( 0 );
		
		AplicationBean app5 = new AplicationBean();
		app5.setNmAplicativo( "Framework Mentawai" );
		app5.setDcAplicativo( "Documentação Mentawai." );
		app5.setLinkAction( String.format("<a class=\"mentawaiDocumentation\" href=\"/%s/mentawaiAction/Mentawai.startApp.mtw\" >",CONTEXT_PATH) );
		app5.setNomeFim( "<br>FCC</a><br><br>&nbsp;</td>" );
		app5.setImagem( "mentawai.png" );
		app5.setFlAtivo( 1 );
		app5.setFlFavorito( 0 );
		
		listAllApplications.add( app1 );
		listAllApplications.add( app2 );
		listAllApplications.add( app3 );
		listAllApplications.add( app4 );
		listAllApplications.add( app5 );
		
		return listAllApplications;
	}
}