package it.prova.gestioneposte.listandstreams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MockData {

	public static final List<PostaDiPaese> POSTE_LIST = new ArrayList<PostaDiPaese>();

	static {
		try {
			PostaDiPaese postaMilano = new PostaDiPaese(1L, "Ufficio Postale di Milano 3", "Via Largo Primo Maggio 69",
					new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2019"), 60);
			Destinatario destinatarioPerPostaMilano1 = new Destinatario(60L, "Gianluigi", "Forte", 53, "Via Mosca 50",
					true);
			postaMilano.getDestinatari().add(destinatarioPerPostaMilano1);
			Destinatario destinatarioPerPostaMilano2 = new Destinatario(78L, "Orazio", "Lorin", 19, "Via Mosca 2",
					true);
			postaMilano.getDestinatari().add(destinatarioPerPostaMilano2);

			PostaDiPaese postaRoma = new PostaDiPaese(1L, "Ufficio Postale di Roma 2", "Via Oberdan 10",
					new SimpleDateFormat("dd/MM/yyyy").parse("03/09/2017"), 10);
			Destinatario destinatarioPerPostaRoma1 = new Destinatario(43L, "Laura", "Orte", 35, "Via Lione 5", true);
			postaRoma.getDestinatari().add(destinatarioPerPostaRoma1);
			Destinatario destinatarioPerPostaRoma2 = new Destinatario(21L, "Lorella", "Ponte", 80, "Via Francia 3",
					false);
			postaRoma.getDestinatari().add(destinatarioPerPostaRoma2);

			PostaDiPaese postaTorino = new PostaDiPaese(1L, "Ufficio Postale di Torino", "Via Misano 9",
					new SimpleDateFormat("dd/MM/yyyy").parse("16/11/2021"), 200);
			Destinatario destinatarioPerPostaTorino1 = new Destinatario(134L, "Luca", "Faro", 23, "Via Delle Viole 15",
					false);
			postaTorino.getDestinatari().add(destinatarioPerPostaTorino1);
			Destinatario destinatarioPerPostaTorino2 = new Destinatario(546L, "Matteo", "Trenta", 64, "Via Orange 21",
					false);
			postaTorino.getDestinatari().add(destinatarioPerPostaTorino2);

			PostaDiPaese postaVenezia = new PostaDiPaese(1L, "Ufficio Postale Centrale di Venezia", "Via Beethoven 15",
					new SimpleDateFormat("dd/MM/yyyy").parse("30/04/2015"), 9);
			Destinatario destinatarioPerPostaVenezia1 = new Destinatario(79L, "Luigi", "Lontra", 39, "Via Londra 57",
					false);
			postaVenezia.getDestinatari().add(destinatarioPerPostaVenezia1);
			Destinatario destinatarioPerPostaVenezia2 = new Destinatario(250L, "Maria", "Lancia", 5, "Via Pisana 43",
					false);
			postaVenezia.getDestinatari().add(destinatarioPerPostaVenezia2);
			Destinatario destinatarioPerPostaVenezia3 = new Destinatario(301L, "Bruno", "Marte", 90,
					"Via Dei Gelsomini", true);
			postaVenezia.getDestinatari().add(destinatarioPerPostaVenezia3);
			Destinatario destinatarioPerPostaVenezia4 = new Destinatario(8L, "Marco", "Rossi", 27, "Via Lussemburgo 7",
					false);
			postaVenezia.getDestinatari().add(destinatarioPerPostaVenezia4);

			POSTE_LIST.add(postaMilano);
			POSTE_LIST.add(postaRoma);
			POSTE_LIST.add(postaTorino);
			POSTE_LIST.add(postaVenezia);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
