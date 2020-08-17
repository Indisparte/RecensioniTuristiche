package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import model.Utente;
import model.Visitabile;

/**
 * @author Di Nuzzo Antonio
 */
public class UtenteDAO extends AbstractDAO<Utente>{

    /**
     * Default constructor
     */
    public UtenteDAO() {
    }

    /**
     * 
     */

    /**
     * @param String nome 
     * @param String username 
     * @param String password 
     * @param String email 
     * @return
     */
    public void aggiungiUtente( String nome,  String username,  String password,  String email) {
        // TODO implement here
    }

    /**
     * @param String username 
     * @return
     */
    public void rimuoviUtente( String username) {
        // TODO implement here
    }

    /**
     * @param String username 
     * @param password 
     * @param email 
     * @return
     */
    public void modificaUtente( String username, String  password,  String email) {
        // TODO implement here
    }

    /**
     * @param String username 
     * @return
     */
    public void modificaTipologiaUtente( String username) {
        // TODO implement here
    }

    /**
     * @param String username 
     * @return
     */
    public Utente mostraUtenteByUsername( String username) {
    	Utente utente = null;
        // TODO implement here
        return utente;
    }

    /**
     * @param String username 
     * @return
     */
    public int mostraNumeroRecensioni( String username) {
        // TODO implement here
        return 0;
    }

    /**
     * @param String username 
     * @return
     */
    public int mostraNumeroLuoghiVisitati( String username) {
        // TODO implement here
        return 0;
    }

    /**
     * @param String username 
     * @return
     */
    public ArrayList<Visitabile> mostraVisitato( String username) {

        // TODO implement here
        return null;
    }

	@Override
	protected Utente makeBean(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}