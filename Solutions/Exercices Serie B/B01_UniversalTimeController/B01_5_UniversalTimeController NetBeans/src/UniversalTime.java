
/**
 * Mémorisation du temps en heures et minutes
 *
 * @author Michel Mercatoris, Fred Faber, Jens Getreu
 * @version 17/11/2011 08:33
 */
public class UniversalTime {

    /**
     * les heures
     */
    private int hours;
    /**
     * les minutes
     */
    private int minutes;

    /**
     * constructeur
     *
     * @param pHours	l'heure
     * @param pMinutes	les minutes
     */
    public UniversalTime(int pHours, int pMinutes) {
        minutes = pMinutes;
        hours = pHours;
    }

    /**
     * retourne le temps actuel en minutes
     *
     * @return le temps actuel en minutes
     */
    public int getTimeInMinutes() {
        return minutes + hours * 60;
    }

    /**
     * Retourner comme texte le temps actuel ainsi que le temps en minutes
     *
     * @return	texte contenant le temps actuel ainsi que le temps en minutes
     */
    public String toString() {
        return hours + ":" + minutes + "h (" + getTimeInMinutes() + " minutes)";
    }
}
