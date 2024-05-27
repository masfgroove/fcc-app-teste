package initialpage.dao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import initialpage.beans.AplicationBean;

/**
 * 
 * @author jssantos
 *
 */
public class InitialPageDAO {
		
	private Session hibernateH2;
	
	/**
	 * Método responsável por limpar os aplicativos na tabela <b>APLICATIVO</b>.</br>
	 * 
	 * @throws Exception
	 */
	public void clearAllApplications() throws Exception {
		try {
			hibernateH2.getTransaction().begin();
						
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM APLICATIVO");
			
			Query query = hibernateH2.createSQLQuery( sql.toString() )
											.addEntity( AplicationBean.class );
			List<AplicationBean> listApplications = query.list();
			
			if( !CollectionUtils.isEmpty(listApplications) ){
				for( AplicationBean app: listApplications ){
					 hibernateH2.delete( app );
					 hibernateH2.flush();
				}
			}		
		} catch( Exception e ){
				 if( hibernateH2.getTransaction() != null ){
					 hibernateH2.getTransaction().rollback();
	             }				 
	             e.printStackTrace();
	             
		} finally {
			hibernateH2.getTransaction().commit();
		}
	}
	
	/**
	 * Método responsável por criar os aplicativos na tabela <b>APLICATIVO</b>.</br>
	 * 
	 * @throws Exception
	 */
	public void insertApplications( final AplicationBean app ) throws Exception {	
		hibernateH2.getTransaction().begin();

		hibernateH2.saveOrUpdate( app );	
		hibernateH2.flush();
		
		hibernateH2.getTransaction().commit();
	}
	
	/**
	 * Método responsável por listar os aplicativos elegíveis na tabela <b>APLICATIVO</b>.</br>
	 * 
	 * @throws Exception
	 */
	public List<AplicationBean> listApplications() throws Exception{
		try {
			hibernateH2.getTransaction().begin();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM APLICATIVOS");
			
			Query query = hibernateH2.createSQLQuery( sql.toString() )
											.addEntity( AplicationBean.class );
			List<AplicationBean> listApplications = query.list();
			return listApplications;
			
		} catch( Exception e ){
				 if( hibernateH2.getTransaction() != null ){
					 hibernateH2.getTransaction().rollback();
	             }				 
	             e.printStackTrace();
		} finally {
			hibernateH2.getTransaction().commit();
		}

		return null;		
	}
}
