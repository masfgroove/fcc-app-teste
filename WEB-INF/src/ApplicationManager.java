
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.mentawai.ajax.AjaxConsequence;
import org.mentawai.core.Context;
import org.mentawai.filter.DIFilter;
import org.mentawai.filter.HibernateFilter;
import org.mentawai.filter.InjectionFilter;
import org.mentawai.filter.IoCFilter;
import org.mentawai.filter.ValidatorFilter;
import org.mentawai.formatter.DateFormatter;
import org.mentawai.formatter.FormatterManager;
import org.mentawai.list.ListManager;
import org.mentawai.list.SimpleListData;
import org.mentawai.transaction.JdbcTransaction;
/**
 * 
 * @author jssantos
 *
 */
public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	private static final String ERROR_VALIDACAO = "ERROR_VALIDACAO";	

	public void init( Context application ){	
		setDebugMode( true );
		
		configureEncoding();		
		configureActions();

		ioc( "transaction", JdbcTransaction.class );
	}
	
	public void loadLists()	{
		SimpleListData nivel = new SimpleListData("nivel");
		nivel.add("0", "Selecione");
		nivel.add("1", "Junior");
		nivel.add("2", "Pleno");
		nivel.add("3", "Senior");		
		ListManager.addList(nivel);
		
		SimpleListData uf = new SimpleListData("uf");
		uf.add("0", "Selecione");
		uf.add("AC", "AC");
		uf.add("AL", "AL");
		uf.add("AM", "AM");
		uf.add("AP", "AP");
		uf.add("BA", "BA");
		uf.add("CE", "CE");
		uf.add("DF", "DF");
		uf.add("ES", "ES");
		uf.add("GO", "GO");
		uf.add("MA", "MA");
		uf.add("MG", "MG");
		uf.add("MS", "MS");
		uf.add("MT", "MT");
		uf.add("PA", "PA");
		uf.add("PB", "PB");
		uf.add("PE", "PE");
		uf.add("PI", "PI");
		uf.add("PR", "PR");
		uf.add("RJ", "RJ");
		uf.add("RN", "RN");
		uf.add("RO", "RO");
		uf.add("RR", "RR");
		uf.add("RS", "RS");
		uf.add("SC", "SC");
		uf.add("SE", "SE");
		uf.add("SP", "SP");
		uf.add("TO", "TO");
		ListManager.addList(uf);
		
		SimpleListData mes = new SimpleListData("mes");
		mes.add("0", "Selecione");
		mes.add("01", "Janeiro");
		mes.add("02", "Fevereiro");
		mes.add("03", "Março");
		mes.add("04", "Abril");
		mes.add("05", "Maio");
		mes.add("06", "Junho");
		mes.add("07", "Julho");
		mes.add("08", "Agosto");
		mes.add("09", "Setembro");
		mes.add("10", "Outubro");
		mes.add("11", "Novembro");
		mes.add("12", "Dezembro");
		ListManager.addList(mes);
	}
	
	public void loadActions()	{
		filter( new ValidatorFilter(ERROR_VALIDACAO) );
		// IoC (Autowiring)
		filter( new IoCFilter() );
		
		Configuration cfg = new Configuration();
		cfg.configure( "hibernate/hibernate_h2.xml" );		
     
        @SuppressWarnings("deprecation")
		SessionFactory s = cfg.buildSessionFactory();		
        
		HibernateFilter h = new HibernateFilter( s );
		h.setKey( "hibernateH2" );
		filter( h );
		filter( new DIFilter() );
		di( "hibernateH2", Session.class, "hibernateH2" );
		filterLast( new InjectionFilter() );		
	}
	
	/* (non-Javadoc)
	 * @see org.mentawai.core.ApplicationManager#loadFormatters()
	 */
	@Override
	public void loadFormatters() {
		super.loadFormatters();		
		FormatterManager.addFormatter( "dateFormatter", new DateFormatter("dd/MM/yyyy") );
		FormatterManager.addFormatter( "datetimeFormatter", new DateFormatter("dd/MM/yyyy HH:mm") );
		FormatterManager.addFormatter( "timeFormatter", new DateFormatter("HH:mm") );		
	}
	
	private void configureActions() {
		configureActions( "initialpage.actions" );
		configureActions( "app.communicator.actions" );
		configureActions( "app.mentawai.actions" );
	}
	
	private void configureEncoding() {
		/**
		 * Variavel padrao para setar o charset no Ajax do Mentawai
		 */
		AjaxConsequence.DEFAULT_CHARSET = "ISO-8859-1";
		setReqCharEncoding("ISO-8859-1");
	}
}