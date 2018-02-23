/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webeder.aula7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author epquadros
 */
public class DiasSemana {

    private int letra;

    public int getLetra() {

        Date d = new Date();
        Calendar c = new GregorianCalendar();
        c.setTime(d);
        int nome = 0;
        int dia = c.get(Calendar.DAY_OF_WEEK);
        switch (dia) {
            case Calendar.SUNDAY:
                 nome = 1;
                break;
            case Calendar.MONDAY:
                 nome = 2;
                break;
            case Calendar.TUESDAY:
                nome = 3;
                break;
            case Calendar.WEDNESDAY:
                nome = 4;
                break;
            case Calendar.THURSDAY:
                nome = 5;
                break;
            case Calendar.FRIDAY:
               nome = 6;
                break;
            case Calendar.SATURDAY:
               nome = 7;
                break;
            default:
               // nome = "A";
                break;
        }
        return this.letra = nome;
    }

    //System.out.println(nome);
    /*               case Calendar.SUNDAY: nome = "Domingo";break;
		  case Calendar.MONDAY: nome = "Segunda";break;
		  case Calendar.TUESDAY: nome = "Terça";break;
		  case Calendar.WEDNESDAY: nome = "Quarta";break;
		  case Calendar.THURSDAY: nome = "Quinta";break;
		  case Calendar.FRIDAY: nome = "Sexta";break;
		  case Calendar.SATURDAY: nome = "sábado";break;*/
}
