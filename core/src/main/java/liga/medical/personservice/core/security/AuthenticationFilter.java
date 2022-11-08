package liga.medical.personservice.core.security;

import liga.medical.personservice.core.dto.LogAuthDto;
import liga.medical.personservice.core.mapping.LogMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;

@Slf4j
public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private LogMapper logMapper;

    public AuthenticationFilter(LogMapper logMapper, AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
        this.logMapper = logMapper;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        logMapper.logAuth(request.getParameter("login"));
        return super.attemptAuthentication(request, response);
    }
}
