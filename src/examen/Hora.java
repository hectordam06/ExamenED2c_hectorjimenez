package examen;
/**
 * Se trata de un programa que valida la hora dependiendo de si los parametros introducidos por consola son correctos o no
 * 
 * 
 * @author Héctor Jiménez
 *@version 1.0
 */
public class Hora {
	public static boolean horaValida;
/**
 * 
 * metodo que valida la hora.
 * 
 * @param segundos numero de segundos introduciodos
 * @param minutos numero de minutos introduciodos
 * @param horas numero de horas introducidas
 * @return devuelve un booleano que dice si la hora es valida o no 
 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}

}
