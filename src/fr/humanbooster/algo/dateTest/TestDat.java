package fr.humanbooster.algo.dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDat {

	String dateStr = (String)(request.getAttribute("date")); //ici je recupere le champs
	String sFormat = "dd/MM/yyyy";
	SimpleDateFormat sdf = new SimpleDateFormat(sFormat); 
	Date d = sdf.parse(dateStr);
	collSta=tr.getNbrPistfd(d); //là j'envoie la date sous forme java.util.date à ma classe d'acces aux données

}

//String dateStr = (String)(request.getAttribute("date")); //ici je recupere le champs
//String sFormat = "dd/MM/yyyy";
//SimpleDateFormat sdf = new SimpleDateFormat(sFormat); 
//Date d = sdf.parse(dateStr);
//collSta=tr.getNbrPistfd(d); //là j'envoie la date sous forme java.util.date à ma classe d'acces aux données
