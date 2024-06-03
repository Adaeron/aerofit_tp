package ar.ciu.concurrencia.aerofit.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.ciu.concurrencia.aerofit.monitor.ConectionPoolMonitor;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
public class ConectionFilter implements Filter{
	
	@Autowired
	private ConectionPoolMonitor conectionPoolMonitor;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		conectionPoolMonitor.filterAccess();
		chain.doFilter(request, response);
		conectionPoolMonitor.closeConnection();
		
	}

}
