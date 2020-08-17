package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Visitabile;

/**
 * @author Di Nuzzo Antonio
 */
public class VisitabileDAO extends AbstractDAO<Visitabile>{

    /**
     * Default constructor
     */
    public VisitabileDAO() {
    }

    /**
     * @param String nome 
     * @param String luogo 
     * @param String sito 
     * @param String telefono 
     * @param int fascia_prezzo 
     * @param int categoria 
     * @return
     */
    public void aggiungiVisitabile( String nome,  String luogo,  String sito,  String telefono,  int fascia_prezzo,  int categoria) {
        // TODO implement here
    }

    /**
     * @param String luogo 
     * @return
     */
    public Visitabile mostraVisitabiliPerLuogo( String luogo) {
    	Visitabile visitabile = null;
        // TODO implement here
        return visitabile;
    }
    public int numeroVisitabiliXLuogo(String luogo) {
    	String query = "SELECT COUNT (*) FROM public.visitabile WHERE luogo ="+luogo+";";
    	int numeri= 0;
    	ResultSet result;
		try {
			PreparedStatement pst = prepareStatement(getConnection(), query);
			result = pst.executeQuery();
			
			if(result.next()) {
				numeri =  result.getInt(1);
			}
			return numeri;
			
		} catch (SQLException e) {e.printStackTrace();}
		return numeri;
    }
    
    /**
     * Mostra tutti i luoghi memorizzati nel database
     * @return ArayList con i luoghi
     */
    public ArrayList<String> mostraLuoghi(){
    	ArrayList<String> luoghi = new ArrayList<String>();
		String query = "SELECT DISTINCT luogo FROM public.visitabile";
		ResultSet result;
		try {
			PreparedStatement pst = prepareStatement(getConnection(), query);
			result = pst.executeQuery();
			
			while(result.next()) {
				luoghi.add( result.getString("luogo"));
			}
			return luoghi;
			
		} catch (SQLException e) {e.printStackTrace();}
	   return luoghi;
	}
    	
    

    /**
     * @param int fascia_prezzo 
     * @return
     */
    public Visitabile mostraVisitabiliPerPrezzo( int fascia_prezzo) {
    	Visitabile visitabile = null;

        // TODO implement here
        return visitabile;
    }

    /**
     * @param String luogo 
     * @param String categoria 
     * @return
     */
    public Visitabile mostraVisitabiliPerLuogoECategoria( String luogo,  String categoria) {
    	Visitabile visitabile = null;

        // TODO implement here
        return visitabile;
    }

    /**
     * @param int idVisitabile 
     * @param String nome 
     * @param String sito 
     * @param String telefono 
     * @param int fascia_prezzo 
     * @return
     */
    public void modificaVisitabile( int idVisitabile,  String nome,  String sito,  String telefono,  int fascia_prezzo) {
        // TODO implement here
    }

    /**
     * @param int idVisitabile 
     * @return
     */
    public void eliminaVisitabile( int idVisitabile) {
        // TODO implement here
    }

    /**
     * @param int idVisitabile 
     * @return
     */
    public Visitabile mostraVisitabile( int idVisitabile) {
    	Visitabile visitabile = null;

        // TODO implement here
        return visitabile;
    }

	@Override
	protected Visitabile makeBean(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}