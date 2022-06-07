package it.prova.gestioneposte.listandstreams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostaDiPaese {

	private Long id;
	private String denominazione;
	private String indirizzoSede;
	private Date dataApertura;
	private Integer numeroDipendenti;
	private List<Destinatario> destinatari = new ArrayList<Destinatario>();

	public PostaDiPaese() {
	}

	public PostaDiPaese(String denominazione, String indirizzoSede, Date dataApertura, Integer numeroDipendenti,
			List<Destinatario> destinatari) {
		this.denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
		this.destinatari = destinatari;
	}

	public PostaDiPaese(Long id, String denominazione, String indirizzoSede, Date dataApertura,
			Integer numeroDipendenti) {
		this.id = id;
		this.denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getIndirizzoSede() {
		return indirizzoSede;
	}

	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}

	public Date getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public Integer getNumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setNumeroDipendenti(Integer numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}

	public List<Destinatario> getDestinatari() {
		return destinatari;
	}

	public void setDestinatari(List<Destinatario> destinatari) {
		this.destinatari = destinatari;
	}

}
