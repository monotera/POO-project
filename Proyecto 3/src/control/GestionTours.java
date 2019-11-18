package control;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ecologico;
import model.Empresarial;
import enumeradores.TipoEmpresa;

import model.Tour;
        
public class GestionTours {

	//METODO PARA CREACION DE TOURS Y LENNARLOS AUTOMATICAMENTE
	public HashMap <Integer,Tour> crearTour(){
            
            try {        boolean pagado = false;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                Date fechaSalida1 = sdf.parse("2019-01-01");
                Date fechaLlegada1 = sdf.parse("2019-01-05");
                Date fechaSalida2 = sdf.parse("2019-01-06");
                Date fechaLlegada2 = sdf.parse("2019-01-15");
                Date fechaSalida3 = sdf.parse("2019-02-01");       
                Date fechaLlegada3 = sdf.parse("2019-02-05");
                Date fechaSalida4 = sdf.parse("2019-03-01");
                Date fechaLlegada4 = sdf.parse("2019-03-05");
                Date fechaSalida5 = sdf.parse("2019-04-01");
                Date fechaLlegada5 = sdf.parse("2019-04-05");
                Date fechaSalida6 = sdf.parse("2019-05-01");
                Date fechaLlegada6 = sdf.parse("2019-05-11");
                
                HashMap <Integer,Tour> listaTours = new HashMap<Integer, Tour>();
                
                
                Tour tour1 = new Tour(1000001, "Paraiso Travel", "Medellin", "5:00", 100.0, fechaSalida1, fechaLlegada1);
                Tour tour2 = new Tour(1000002, "Adventure Time", "Bogota", "22:00", 300.0, fechaSalida2, fechaLlegada2);
                Tour tour3 = new Tour(1000003, "Paisaje Colombiano", "Villavicencio", "20:00", 100.0, fechaSalida3, fechaLlegada3);
                Tour tour4 = new Tour(1000004, "Paisaje Cafetero", "Manizales", "19:00", 500.0, fechaSalida4, fechaLlegada4);
                Tour tour5 = new Tour(1000005, "Conoce Cartagena", "Cartagena", "20:00", 400.0, fechaSalida5, fechaLlegada5);
                Ecologico tourEco1 = new Ecologico(true ,20.0 ,true ,2000002, "Conoce Colombia", "Ibague", "5:00", 400.0, fechaSalida3, fechaLlegada3);
                Ecologico tourEco2 = new Ecologico(true, 20.0, false,2000003, "Viaje por Honda", "Honda", "0:00", 100.0, fechaSalida4, fechaLlegada4);
                Ecologico tourEco3 = new Ecologico(true, 20.0, false,2000004, "Paisaje cafetero", "Pereira", "12:00", 400.0, fechaSalida1, fechaLlegada1);
                Ecologico tourEco4 = new Ecologico(true, 20.0, false,2000005, "Bienvenido a los paramos", "Manizales", "10:00", 400.0, fechaSalida2, fechaLlegada2);
                Ecologico tourEco5 = new Ecologico(true, 20.0, false,2000006, "Viaje a las amazonas", "Leticia", "0:00", 300.0, fechaSalida1, fechaLlegada1);
                Empresarial tourEmp1 = new Empresarial("Tiobe", true, TipoEmpresa.TECNOLOGIA, 3000001, "Wall Street Paisa", "Cartagena", "23:00", 500.0, fechaSalida5, fechaLlegada5);
                Empresarial tourEmp2 = new Empresarial("Aviatur", true, TipoEmpresa.TURISMO, 3000002, "Cancun Full", "Bogota", "23:00", 1000.0, fechaSalida6, fechaLlegada6);
                Empresarial tourEmp3 = new Empresarial("Agentur", true, TipoEmpresa.TECNOLOGIA, 3000003, "Ferias Taurinas", "Bogota", "21:00", 1300.0, fechaSalida2, fechaLlegada2);
                Empresarial tourEmp4 = new Empresarial("Exito", true, TipoEmpresa.MEDIO_COMUNICACION, 3000004, "Cali es Cali", "Cali", "20:00", 800.0, fechaSalida3, fechaLlegada3);
                Empresarial tourEmp5 = new Empresarial("Aviatur", true, TipoEmpresa.TURISMO, 3000005, "Bienvenidos a medellin", "Medellin", "22:00", 1200.0, fechaSalida5, fechaLlegada5);
                /*
                Tour tourSanAndres = new Tour(1000001,"San Andres","Bogota","21:00",4000000, fechaSalida1, fechaLlegada1);
                Tour tourVilla = new Tour(1000002,"Villa de Leyva","Bogota","17:00",800000, fechaSalida2, fechaLlegada2);
                Tour tourCartagena = new Tour(1000003,"Cartagena","Medellin","80:00",5000000, fechaSalida3, fechaLlegada3);
                Tour tourCali = new Tour(1000004,"Cali","Bogota","04:00",2000000, fechaSalida4, fechaLlegada4);
                Tour tourAmazonas = new Tour(1000005,"Amazonas","Bogota","12:00",2500000, fechaSalida5, fechaLlegada5);
                
                listaTours.put((int) tourSanAndres.getCodigoIdentificacion(), tourSanAndres);
                listaTours.put((int) tourVilla.getCodigoIdentificacion(), tourVilla);
                listaTours.put((int) tourCartagena.getCodigoIdentificacion(), tourCartagena) ;
                listaTours.put((int) tourCali.getCodigoIdentificacion(), tourCali);
                listaTours.put((int) tourAmazonas.getCodigoIdentificacion(), tourAmazonas);
                */
                listaTours.put((int) tour1.getCodigoIdentificacion(), tour1);
                listaTours.put((int) tour2.getCodigoIdentificacion(), tour2);
                listaTours.put((int) tour3.getCodigoIdentificacion(), tour3);
                listaTours.put((int) tour4.getCodigoIdentificacion(), tour4);
                listaTours.put((int) tour5.getCodigoIdentificacion(), tour5);
                listaTours.put((int) tourEco1.getCodigoIdentificacion(), tourEco1);
                listaTours.put((int) tourEco2.getCodigoIdentificacion(), tourEco2);
                listaTours.put((int) tourEco3.getCodigoIdentificacion(), tourEco3);
                listaTours.put((int) tourEco4.getCodigoIdentificacion(), tourEco4);
                listaTours.put((int) tourEco5.getCodigoIdentificacion(), tourEco5);
                listaTours.put((int) tourEmp1.getCodigoIdentificacion(), tourEmp1);
                listaTours.put((int) tourEmp2.getCodigoIdentificacion(), tourEmp2);
                listaTours.put((int) tourEmp3.getCodigoIdentificacion(), tourEmp3);
                listaTours.put((int) tourEmp4.getCodigoIdentificacion(), tourEmp4);
                listaTours.put((int) tourEmp5.getCodigoIdentificacion(), tourEmp5);
                
                return listaTours;
                
            } catch (ParseException ex) {
                Logger.getLogger(GestionTours.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return null;
	}

	public void listarTours(HashMap<Integer, Tour> listaTours)
	{
		for(Tour tour : listaTours.values()) {
			System.out.println("==========================================");
			System.out.println("Codigo: " + tour.getCodigoIdentificacion());
			System.out.println("Nombre: " + tour.getNombreComercial());
			System.out.println("Lugar de partida: " + tour.getLugarPartita());
			System.out.println("Hora de partida: " + tour.getHoraPartida());
			System.out.println("precio: " + tour.getPrecio());
                        System.out.println("fecha de salida: " + tour.getFechaSalida().toString());
                        System.out.println("fecha de regreso: " + tour.getFechaRegreso().toString());
                        if(tour instanceof Ecologico)
                        {
                            System.out.println("***MOSTRANDO INFO ADICIONAL***:");
                            System.out.println("La vacunacion es requerida?: " + ((Ecologico)tour).isVacunacionRequerida());
                            System.out.println("Impuesto local: " + ((Ecologico)tour).getImpuestoLocal());
                            System.out.println("El lugar es de dificil acceso?: " + ((Ecologico)tour).isDificilAcceso());
                        }
                        else if(tour instanceof Empresarial)
                        {
                            System.out.println("***MOSTRANDO INFO ADICIONAL***:");
                            System.out.println("Nombre de la empresa: " + ((Empresarial)tour).getNombreEmpresa());
                            System.out.println("Es viajero frecuente?: : " + ((Empresarial)tour).isViajeroFrecuente());
                            System.out.println("Tipo de la empresa: " + ((Empresarial)tour).getTipo().toString());
                        }
		}	
	}

	public void insertarTour(HashMap<Integer, Tour> listaTours, Tour tour) {

		listaTours.put((int)tour.getCodigoIdentificacion(), tour);

	}
	public void eliminarTour(HashMap<Integer, Tour> listaTours, Tour tour) {
		listaTours.remove((int) tour.getCodigoIdentificacion(), tour);
	}
	
	public void modificarTour(HashMap <Integer,Tour> listaTours, Tour tour,long key) {

		listaTours.remove((int) key);
		listaTours.put((int) tour.getCodigoIdentificacion(), tour);

	}

	//GETTER
	public Tour getTour (HashMap <Integer, Tour> listaTours, long codigoIdentificacion)
	{
		return listaTours.get((int)codigoIdentificacion);
	}


}
