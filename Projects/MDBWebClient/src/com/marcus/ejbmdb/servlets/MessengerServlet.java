package com.marcus.ejbmdb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marcus.ejbmdb.pojo.SimplePojo;

/**
 * Servlet implementation class MessangerServlet
 */
@WebServlet(name="MessengerServlet", urlPatterns={"/index.html", "/login", "/show_dbs", "/MessengerServlet"})
public class MessengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MessengerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		final String QUEUE_LOOKUP = "queue/MyQueue";
		final String CONNECTION_FACTORY = "ConnectionFactory";

		PrintWriter out = response.getWriter();
		try {
			Context context = new InitialContext();
			QueueConnectionFactory factory = (QueueConnectionFactory) context
					.lookup(CONNECTION_FACTORY);
			QueueConnection connection = factory.createQueueConnection();
			QueueSession session = connection.createQueueSession(false,
					QueueSession.AUTO_ACKNOWLEDGE);

			Queue queue = (Queue) context.lookup(QUEUE_LOOKUP);
			QueueSender sender = session.createSender(queue);

			// 1. Sending TextMessage to the Queue
			TextMessage message = session.createTextMessage();
			message.setText("Hello EJB3 MDB Queue!!!");
			sender.send(message);
			out.println("1. Sent TextMessage to the Queue");

			// 2. Sending ObjectMessage to the Queue
			ObjectMessage objMsg = session.createObjectMessage();

			SimplePojo sp = new SimplePojo(2163, "Kumar", "Simple POJO", 100000);

			objMsg.setObject(sp);
			sender.send(objMsg);
			out.println("2. Sent ObjectMessage to the Queue");

			session.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
