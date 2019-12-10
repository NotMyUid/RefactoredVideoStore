package videostore;
import java.util.*;

// 1.0
public class Cliente {
    
	private String _nome;
    private List<Noleggio> _noleggi = new ArrayList<Noleggio>();

    public Cliente (String nome) {
        _nome = nome;
    }

    public void addNoleggio(Noleggio arg) {
        _noleggi.add(arg);
    }
    
    public String getNome(){
        return _nome;
    }

    public String rendiconto() {
       
        Iterator<Noleggio> noleggi = _noleggi.iterator();
        String r = "Rendiconto noleggi per " + getNome() + " ";
        
        while (noleggi.hasNext()) {
            Noleggio ognuno = (Noleggio) noleggi.next();
            
            // aggiungi al risultato
            r += ognuno.getFilm().getTitolo() + " " +
                 String.valueOf(ammontarePer(ognuno))+ " ";
            
        } // while

        // aggiungi totale
        r += "L'ammontare dovuto e' " + String.valueOf(getAmmontareTotale());
        return r;
    }

	// ammontare per ogni noleggio
	private double ammontarePer(Noleggio ognuno) {
		return ognuno.getAmmontare();
	}
	
	private double getAmmontareTotale() {
    	double ammontareTotale = 0;
        Iterator<Noleggio> noleggi = _noleggi.iterator();
        while (noleggi.hasNext()) {
            Noleggio ognuno = (Noleggio) noleggi.next();
            ammontareTotale += ammontarePer(ognuno);
        } 
        return ammontareTotale;
	}
}
