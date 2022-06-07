package it.prova.gestioneposte.listandstreams;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TestGestionePoste {

	public static void main(String[] args) throws Exception {

		List<PostaDiPaese> elencoPosteDiPaese = MockData.POSTE_LIST;

		// poste che contengono nell'indirizzo 'MI'
		System.out.println("Poste che nell'indirizzo hanno 'MI' :");
		List<PostaDiPaese> elencoPosteIndirizzoConMi = elencoPosteDiPaese.stream()
				.filter(posteItem -> posteItem.getIndirizzoSede().contains("Mi")).collect(Collectors.toList());

		// stampo i risultati
		elencoPosteIndirizzoConMi.forEach(
				posteItem -> System.out.println(posteItem.getDenominazione() + " in " + posteItem.getIndirizzoSede()));

		// poste aperte dopo il 01/03/2019
		System.out.println("Poste aperte dopo la data 01/03/2019 :");
		Date dataPerTest = new SimpleDateFormat("dd/MM/yyyy").parse("01/03/2019");
		List<PostaDiPaese> elencoPosteAperteDopoIl = elencoPosteDiPaese.stream()
				.filter(posteItem -> posteItem.getDataApertura().after(dataPerTest)).collect(Collectors.toList());

		// stampo i risultati
		elencoPosteAperteDopoIl.forEach(posteItem -> System.out
				.println(posteItem.getDenominazione() + " aperta in data: " + posteItem.getDataApertura()));

		// lista indirizzi delle poste con piu' di 20 dipendenti
		System.out.println("Lista indirizzi delle poste con piu' di 20 dipendenti :");
		List<String> elencoIndirizziPosteConPiuDiVentiDipendenti = elencoPosteDiPaese.stream()
				.filter(posteItem -> posteItem.getNumeroDipendenti() > 20)
				.map(posteItem -> posteItem.getIndirizzoSede()).collect(Collectors.toList());

		// stampo i risultati
		elencoIndirizziPosteConPiuDiVentiDipendenti.forEach(indirizziItem -> System.out.println(indirizziItem));

		// lista indirizzi di destinatari di poste con almeno 10 dipendenti
		System.out.println("Lista indirizzi di destinatari di poste con almeno 10 dipendenti :");
		List<String> elencoIndirizziDestinatariPosteConAlmenoDieciDipendenti = elencoPosteDiPaese.stream()
				.filter(posteItem -> posteItem.getNumeroDipendenti() >= 10)
				.flatMap(x -> x.getDestinatari().stream().map(destinatariItem -> destinatariItem.getIndirizzo()))
				.collect(Collectors.toList());

		// stampo i risultati
		elencoIndirizziDestinatariPosteConAlmenoDieciDipendenti
				.forEach(indirizziItem -> System.out.println(indirizziItem));

		// lista di destinatari con conto corrente appartenenti a poste con numero
		// dipendenti compreso tra 50 e 100
		System.out.println(
				"Lista destinatari con un conto corrente appartenenti a poste con un numero dipendenti tra 50 e 100 :");
		List<Destinatario> elencoDestinatariConContoCorrenteInPosteConUnTotDiDipendenti = elencoPosteDiPaese.stream()
				.filter(posteItem -> posteItem.getNumeroDipendenti() >= 50 && posteItem.getNumeroDipendenti() <= 100)
				.flatMap(x -> x.getDestinatari().stream()
						.filter(destinatariItem -> destinatariItem.isPossessoreDiContoCorrente()))
				.collect(Collectors.toList());

		// stampo i risultati
		elencoDestinatariConContoCorrenteInPosteConUnTotDiDipendenti.forEach(
				indirizziItem -> System.out.println(indirizziItem.getNome() + " " + indirizziItem.getCognome()));

		// lista delle età dei destinatari delle poste che contengono 'Centrale' nella
		// denominazione e che siano aperte dopo la data 01/01/2000
		System.out.println(
				"Lista delle età dei destinatari delle poste che contengono 'Centrale' nella denominazione e che siano aperte almeno dopo la data 01/01/2000");
		Date dataPerTest2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");
		List<Integer> elencoEtaDestinatariPosteCheContengonoCentraleInDenominazioneEAperteAlmenoDa = elencoPosteDiPaese
				.stream()
				.filter(posteItem -> posteItem.getDenominazione().contains("Centrale")
						&& posteItem.getDataApertura().after(dataPerTest2))
				.flatMap(x -> x.getDestinatari().stream().map(y -> y.getEta())).collect(Collectors.toList());

		// stampo i risultati
		elencoEtaDestinatariPosteCheContengonoCentraleInDenominazioneEAperteAlmenoDa
				.forEach(etaItem -> System.out.println(etaItem));

	}

}
