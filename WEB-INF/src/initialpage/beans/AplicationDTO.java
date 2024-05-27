package initialpage.beans;

import java.io.Serializable;

public class AplicationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int cdAplicativo;
	private String nmAplicativo;
	private String dcAplicativo;
	private String linkAction;
	private String imagem;
	private String nomeFim;
	private int nrPrioridade;
	private int flAtivo;
	private int flFavorito;
	
	public int getFlFavorito() {
		return flFavorito;
	}
	public void setFlFavorito(int flFavorito) {
		this.flFavorito = flFavorito;
	}
	public int getFlAtivo() {
		return flAtivo;
	}
	public void setFlAtivo(int flAtivo) {
		this.flAtivo = flAtivo;
	}
	public int getNrPrioridade(){
		return nrPrioridade;
	}
	public void setNrPrioridade(int nrPrioridade){
		this.nrPrioridade = nrPrioridade;
	}
	public int getCdAplicativo() {
		return cdAplicativo;
	}
	public String getDcAplicativo() {
		return dcAplicativo;
	}
	public String getImagem() {
		return imagem;
	}
	public String getLinkAction() {
		return linkAction;
	}
	public String getNmAplicativo() {
		return nmAplicativo;
	}
	public String getNomeFim() {
		return nomeFim;
	}
	public void setCdAplicativo(int i) {
		cdAplicativo = i;
	}
	public void setDcAplicativo(String string) {
		dcAplicativo = string;
	}
	public void setImagem(String string) {
		imagem = string;
	}
	public void setLinkAction(String string) {
		linkAction = string;
	}
	public void setNmAplicativo(String string) {
		nmAplicativo = string;
	}
	public void setNomeFim(String string) {
		nomeFim = string;
	}

}
