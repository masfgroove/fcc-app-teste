package initialpage.beans;

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
@Table(name="APLICATIVO")
public class AplicationBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public AplicationBean() { }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_APLICATIVO")
	private int cdAplicativo;
	
	@Column(name="NM_APLICATIVO")
	private String nmAplicativo;
	
	@Column(name="DC_APLICATIVO")
	private String dcAplicativo;
	
	@Column(name="LINK_ACTION")
	private String linkAction;
	
	@Column(name="IMAGEM")
	private String imagem;
	
	@Column(name="NOME_FIM")
	private String nomeFim;
	
	@Column(name="FL_ATIVO")
	private int flAtivo;
	
	@Column(name="FL_FAVORITO")
	private int flFavorito;
		
	public int getCdAplicativo() {
		return cdAplicativo;
	}

	public void setCdAplicativo(int cdAplicativo) {
		this.cdAplicativo = cdAplicativo;
	}

	public String getNmAplicativo() {
		return nmAplicativo;
	}

	public void setNmAplicativo(String nmAplicativo) {
		this.nmAplicativo = nmAplicativo;
	}

	public String getDcAplicativo() {
		return dcAplicativo;
	}

	public void setDcAplicativo(String dcAplicativo) {
		this.dcAplicativo = dcAplicativo;
	}

	public String getLinkAction() {
		return linkAction;
	}

	public void setLinkAction(String linkAction) {
		this.linkAction = linkAction;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getNomeFim() {
		return nomeFim;
	}

	public void setNomeFim(String nomeFim) {
		this.nomeFim = nomeFim;
	}

	public int getFlAtivo() {
		return flAtivo;
	}

	public void setFlAtivo(int flAtivo) {
		this.flAtivo = flAtivo;
	}

	public int getFlFavorito() {
		return flFavorito;
	}

	public void setFlFavorito(int flFavorito) {
		this.flFavorito = flFavorito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cdAplicativo;
		result = prime * result + ((dcAplicativo == null) ? 0 : dcAplicativo.hashCode());
		result = prime * result + flAtivo;
		result = prime * result + flFavorito;
		result = prime * result + ((imagem == null) ? 0 : imagem.hashCode());
		result = prime * result + ((linkAction == null) ? 0 : linkAction.hashCode());
		result = prime * result + ((nmAplicativo == null) ? 0 : nmAplicativo.hashCode());
		result = prime * result + ((nomeFim == null) ? 0 : nomeFim.hashCode());
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
		AplicationBean other = (AplicationBean) obj;
		if (cdAplicativo != other.cdAplicativo)
			return false;
		if (dcAplicativo == null) {
			if (other.dcAplicativo != null)
				return false;
		} else if (!dcAplicativo.equals(other.dcAplicativo))
			return false;
		if (flAtivo != other.flAtivo)
			return false;
		if (flFavorito != other.flFavorito)
			return false;
		if (imagem == null) {
			if (other.imagem != null)
				return false;
		} else if (!imagem.equals(other.imagem))
			return false;
		if (linkAction == null) {
			if (other.linkAction != null)
				return false;
		} else if (!linkAction.equals(other.linkAction))
			return false;
		if (nmAplicativo == null) {
			if (other.nmAplicativo != null)
				return false;
		} else if (!nmAplicativo.equals(other.nmAplicativo))
			return false;
		if (nomeFim == null) {
			if (other.nomeFim != null)
				return false;
		} else if (!nomeFim.equals(other.nomeFim))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AplicationBean [cdAplicativo=" + cdAplicativo + ", nmAplicativo=" + nmAplicativo + ", dcAplicativo="
				+ dcAplicativo + ", linkAction=" + linkAction + ", imagem=" + imagem + ", nomeFim=" + nomeFim
				+ ", flAtivo=" + flAtivo + ", flFavorito=" + flFavorito + "]";
	}
}