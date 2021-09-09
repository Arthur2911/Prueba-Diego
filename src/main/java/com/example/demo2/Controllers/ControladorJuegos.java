package com.example.demo2.Controllers;
import com.example.demo2.entidades.Juego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import com.example.demo2.repository.ShipperRepository;


@Controller
@RequestMapping("/Juegos")
public class ControladorJuegos {
    // Página Principal
    @RequestMapping("")
    public String Home(){
        return "Juegos/Principal";
    }

    // Último Juegos en venta
    @RequestMapping("/UltimosJuegos")
    public String UltimosJuegos(){
        return "Juegos/UltimosJuegos";
    }

    // Juegos más vendidos
    @RequestMapping("/Masvendidos")
    public String Masvendidos(){
        return "Juegos/Masvendidos";
    }

    @RequestMapping("/Comprar")
    public String Comprar(){
        return "Juegos/Comprar";
    }

    @RequestMapping("/InicioSesion")
    public String InicioSesion(){
        return "Juegos/IniciarSesion";
    }



    @PostMapping("/ContInicioSesion")
    public String ContInicioSesion(Model model,
                                  @RequestParam("NombreUsuario") String Nombre,
                                  @RequestParam("Contraseña") String Cont,
                                  @RequestParam("IDJugador") String ID){
        //Se enviara los 3 juegos a la pagina principal
        //Probaremos el envío de un objeto, primero creamos el objeto juego
        Juego juego1 = new Juego("Juego", "2020", "mayores 18");

        model.addAttribute("Nombre", Nombre);
        model.addAttribute("Cont", Cont);
        model.addAttribute("ID", ID);
        model.addAttribute("listaJuegos", listaJuegos());
        model.addAttribute("JuegoPrueba", juego1);


        return "Juegos/SesionIniciada";
    }

    @RequestMapping("/DataB")
    public String IrPruebaDataBinding(){

    return "Juegos/PruebaDatabiding";

    }



    @PostMapping("/Databinding")
    public String DataBinding(Juego juego){
        System.out.println("nombre " + juego.getNombrejuego());
        System.out.println("año salida " + juego.getAniosalida());
        System.out.println("edad " + juego.getEdad());
        return "Juegos/Principal";
    }

    // creamos 4 juegos distintos y lo añadimos a una lista
    public ArrayList<Juego> listaJuegos(){

        ArrayList<Juego> lista = new ArrayList<>();
        lista.add(new Juego("ABC", "2020", "Mayores de 18"));
        lista.add(new Juego("jose", "2020", "Mayores de 18"));
        lista.add(new Juego("Alvaro", "2020", "Mayores de 18"));
        lista.add(new Juego("Ivanna", "2020", "Mayores de 18"));

        return lista;

    }




}



