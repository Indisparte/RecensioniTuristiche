package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import model.Categoria;


/**
 * @author Di Nuzzo Antonio
 */
public class CategoriaDAO extends AbstractDAO<Categoria>  {



    /**
     * @param int idCategoria 
     * @return
     */
    public ArrayList<String> mostraTemiCategoria( int idCategoria) {
        // TODO implement here
        return null;
    }

    /**
     * @param String nome 
     * @param String tema 
     * @return
     */
    public void aggiungiCategoria( String nome,  String tema) {
        // TODO implement here
    }

    /**
     * @param int idCategoria 
     * @return
     */
    public void rimuoviCategoria( int idCategoria) {
        // TODO implement here
    }

    /**
     * @param String tema 
     * @return
     */
    public ArrayList<String> mostraKeyTemi( String tema) {
        // TODO implement here
    	return null;
    }

	@Override
	protected Categoria makeBean(ResultSet rs) throws SQLException {
		Categoria categoria = new Categoria(rs.getString("nome"), rs.getString("tema"), rs.getInt("idCategoria"));
		return categoria;
	}

}