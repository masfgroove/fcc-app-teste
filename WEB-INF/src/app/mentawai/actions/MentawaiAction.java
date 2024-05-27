package app.mentawai.actions;

import java.util.StringJoiner;

import org.mentawai.core.ApplicationManager;
import org.mentawai.core.BaseAction;
import org.mentawai.core.Configurable;

public class MentawaiAction extends BaseAction implements Configurable {
	
	@Override
	public void configure(ApplicationManager appManager) {
		appManager.action( "/mentawaiAction/Mentawai", this.getClass() )
		.on( "HOME_APP", "/WEB-INF/app/mentawai/appHome.jsp" );
	}
	
	public String startApp() throws Exception {
		
		StringJoiner mtwTaglib = new StringJoiner( "" );
		mtwTaglib.add("<table>");
		mtwTaglib.add(" <tbody>");
		mtwTaglib.add("  <tr>");
		mtwTaglib.add("   <td>");
		mtwTaglib.add("    <ul>");
		mtwTaglib.add("     <li>mtw:isEmpty</li>");
		mtwTaglib.add("     <li>mtw:if</li>");
		mtwTaglib.add("     <li>mtw:list</li>");
		mtwTaglib.add("     <li>mtw:loop</li>");
		mtwTaglib.add("     <li>mtw:out</li>");
		mtwTaglib.add("     <li>mtw:input</li>");
		mtwTaglib.add("     <li>mtw:inputMaskConfig</li>");
		mtwTaglib.add("     <li>mtw:inputDateConfig</li>");
		mtwTaglib.add("     <li>mtw:select</li>");
		mtwTaglib.add("     <li>mtw:bean</li>");
		mtwTaglib.add("     <li>mtw:error</li>");
		mtwTaglib.add("     <li>mtw:hasError</li>");
		mtwTaglib.add("     <li>mtw:outError</li>");
		mtwTaglib.add("     <li>mtw:noCache</li>");
		mtwTaglib.add("     <li>mtw:ajaxConfig</li>");
		mtwTaglib.add("     <li>mtw:isNull</li>");
		mtwTaglib.add("    </ul>");
		mtwTaglib.add("   </td>");
		mtwTaglib.add("  </tr>");
		mtwTaglib.add(" </tbody>");
		mtwTaglib.add("</table>");
				
		this.output.setValue( "mtwTaglib", mtwTaglib );
		
		return "HOME_APP";
	}
}