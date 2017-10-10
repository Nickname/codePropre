package ex5;

import java.util.Date;

/**
 * @author ETY15
 *
 */
public class Pret {

	/** strategy : Strategy */
	private Strategy strategy;
	/** capital : double */
	private double capital;
	/** capitalRestantDu : double */
	private double capitalRestantDu;
	/** taux : double */
	private double taux;
	/** dateDebut : Date */
	private Date dateDebut;
	/** dateFin : Date */
	private Date dateFin;
	
	/**
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 */
	public Pret(double capital, double taux, Date dateDebut) {
		this.strategy = new PretATerme();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}
	
	/**
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		this(capital, taux, dateDebut);
		this.dateFin = dateFin;
	}
	
	/**
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 * @param capitalRestantDu
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin, double capitalRestantDu) {
		this(capital, taux, dateDebut, dateFin);
		this.capitalRestantDu = capitalRestantDu;
	}

	/** Getter for strategy
	 * @return the strategy
	 */
	/**
	 * @return
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/** Setter
	 * @param strategy the strategy to set
	 */
	/**
	 * @param strategy
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/** Getter for capital
	 * @return the capital
	 */
	/**
	 * @return
	 */
	public double getCapital() {
		return capital;
	}

	/** Setter
	 * @param capital the capital to set
	 */
	/**
	 * @param capital
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/** Getter for capitalRestantDu
	 * @return the capitalRestantDu
	 */
	/**
	 * @return
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/** Setter
	 * @param capitalRestantDu the capitalRestantDu to set
	 */
	/**
	 * @param capitalRestantDu
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/** Getter for taux
	 * @return the taux
	 */
	/**
	 * @return
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	/**
	 * @param taux
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/** Getter for dateDebut
	 * @return the dateDebut
	 */
	/**
	 * @return
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	/**
	 * @param dateDebut
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter for dateFin
	 * @return the dateFin
	 */
	/**
	 * @return
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	/**
	 * @param dateFin
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
}
