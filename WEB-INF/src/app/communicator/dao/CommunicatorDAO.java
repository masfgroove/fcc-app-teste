package app.communicator.dao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import app.communicator.beans.EmployeeEntity;

/**
 * 
 * @author jssantos
 *
 */
public class CommunicatorDAO {
	
	private Session hibernateH2;
	
	/**
	 * M�todo respons�vel por limpar os funcion�rio na tabela <b>FUNCIONARIO</b>.</br>
	 * 
	 * @throws Exception
	 */
	public void clearAllEmployees() throws Exception {
		try {
			hibernateH2.getTransaction().begin();
						
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM FUNCIONARIOS");
			
			Query query = hibernateH2.createSQLQuery( sql.toString() )
											.addEntity( EmployeeEntity.class );
			List<EmployeeEntity> listEmployees = query.list();
			
			if( !CollectionUtils.isEmpty(listEmployees) ){
				for( EmployeeEntity employee: listEmployees ){
					 hibernateH2.delete( employee );
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
	 * M�todo respons�vel por criar os funcion�rios na tabela <b>FUNCIONARIO</b>.</br>
	 * 
	 * @throws Exception
	 */
	public void insertEmployees( final EmployeeEntity employee ) throws Exception {	
		hibernateH2.getTransaction().begin();
		
		hibernateH2.saveOrUpdate( employee );	
		hibernateH2.flush();
		
		hibernateH2.getTransaction().commit();
	}
	
	/**
	 * M�todo respons�vel por listar os funcion�rios eleg�veis na tabela <b>FUNCIONARIO</b>.</br>
	 * 
	 * @throws Exception
	 */
	public List<EmployeeEntity> listEmployees( final Integer Status ) throws Exception{
		try {
			hibernateH2.getTransaction().begin();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM FUNCIONARIO WHERE STATU=:status");
			
			Query query = hibernateH2.createSQLQuery( sql.toString() )
											.addEntity( EmployeeEntity.class )
												.setParameter("status", Status);
			List<EmployeeEntity> listEmployees = query.list();
			return listEmployees;
			
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