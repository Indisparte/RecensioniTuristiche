package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Recensione;
import model.Utente;

/**
 * @author Di Nuzzo Antonio
 */
public class RecensioneDAO  extends AbstractDAO<Recensione>{

    /**
     * Default constructor
     */
    public RecensioneDAO() {
    }

    /**
     * @param int idVisitabile 
     * @param String titolo 
     * @param String testo 
     * @param int stelle 
     * @param String autore 
     * @return
     */
    public void aggiungiRecensione( int idVisitabile,  String titolo,  String testo,  int stelle,  String autore) {
        // TODO implement here
    }

    /**
     * @param int idRec 
     * @return
     */
    public void rimuoviRecensione( int idRec) {
        // TODO implement here
    }

    /**
     * @param int idRec 
     * @return
     */
    public void segnalaRecensione( int idRec) {
        // TODO implement here
    }

    /**
     * @param int idRec 
     * @return
     */
    public Utente autoreRecensione( int idRec) {
    	Utente utente = null;
        // TODO implement here
        return utente;
    }

	@Override
	protected Recensione makeBean(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}