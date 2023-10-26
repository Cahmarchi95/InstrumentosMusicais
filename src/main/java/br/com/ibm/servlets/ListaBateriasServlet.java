package br.com.ibm.servlets;

import br.com.ibm.instrumentos.Bateria;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "ListaBateriasServlet", urlPatterns = {"/listabaterias"})
public class ListaBateriasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        List<Bateria> bateria = new ArrayList<>();
        bateria.add(new Bateria("Percussão",3000));
        bateria.add(new Bateria("Percussão",1500));
        bateria.add(new Bateria("Percussão",800));

        double mediaValor = bateria.stream()
                .mapToDouble(Bateria::getPreco)
                .average()
                .orElse(0.0);



        request.setAttribute("bateria", bateria);
        request.setAttribute("mediaValor", mediaValor);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/listabaterias.jsp");
        dispatcher.forward(request, response);
    }
}