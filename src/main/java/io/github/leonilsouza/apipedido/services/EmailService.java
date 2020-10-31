	package io.github.leonilsouza.apipedido.services;

import org.springframework.mail.SimpleMailMessage;

import io.github.leonilsouza.apipedido.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obl);
	
	void sendEmail(SimpleMailMessage msg);
}
