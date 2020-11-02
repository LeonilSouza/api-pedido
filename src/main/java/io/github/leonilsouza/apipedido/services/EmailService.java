	package io.github.leonilsouza.apipedido.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import io.github.leonilsouza.apipedido.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obl);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);
}
