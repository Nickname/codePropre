package ex3;

public enum TypeCompte {
	CC, LA;
	
	public String toString() {
		if (this.equals(CC)) {
			return "Compte courant";
		} else if (this.equals(LA)) {
			return "Livret A";
		}
		return null;
	}
}
