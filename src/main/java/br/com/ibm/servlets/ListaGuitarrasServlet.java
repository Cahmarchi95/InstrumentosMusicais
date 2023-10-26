package br.com.ibm.servlets;

import br.com.ibm.instrumentos.Guitarra;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ListaGuitarrasServlet", urlPatterns = {"/listaguitarras"})
public class ListaGuitarrasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        List<Guitarra> guitarras = new ArrayList<>();
        guitarras.add(new Guitarra("Cordas", 1505, "Stratocaster"));
        guitarras.add(new Guitarra("Cordas", 1000, "Les Paul"));
        guitarras.add(new Guitarra("Cordas", 800, "Les Paul"));
        guitarras.add(new Guitarra("Cordas", 6000, "SG"));
        guitarras.add(new Guitarra("Cordas", 5000, "Flying V"));

        List<Guitarra> lesPaulGuitarras = guitarras.stream()
                .filter(guitarra -> "Les Paul".equals(guitarra.getModelo()))
                .collect(Collectors.toList());

        request.setAttribute("todasGuitarras", guitarras);
        request.setAttribute("lesPaulGuitarras", lesPaulGuitarras);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/listaguitarras.jsp");
        dispatcher.forward(request, response);
    }
}
