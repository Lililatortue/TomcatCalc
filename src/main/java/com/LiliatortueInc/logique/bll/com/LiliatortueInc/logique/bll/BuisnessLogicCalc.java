package com.LiliatortueInc.logique.bll;
import com.LiliatortueInc.logique.calc.calculator;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class BuisnessLogicCalc extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			 String str = request.getParameter("formula");
		        if (str == null || str.trim().isEmpty()) {
		            response.getWriter().write("Error: No formula provided");
		            return;
		        }

		        try {
		            calculator calcul = new calculator(str);
		            int result = calcul.calculate();
		            response.getWriter().write(String.valueOf(result));
		        } catch (Exception e) {
		            response.getWriter().write("Error: Invalid formula");
		        }
		}
}
