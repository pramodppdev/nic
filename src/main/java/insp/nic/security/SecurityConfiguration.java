package insp.nic.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration {

//    @Order(1)
//    @Configuration
//    public static class UserApiSecurity extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .antMatcher("/api/**")
//                    .cors()
//                    .and()
//                    .csrf()
//                    .disable() // we don't need CSRF because our token is invulnerable
//                    .authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and()
//                    .formLogin().disable()
//                    .addFilterBefore(new SecurityFilter(), BasicAuthenticationFilter.class)
//                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        }
//
//
//    }

//    @Order(3)
//    @Configuration
//    public static class UserWebSecurity extends WebSecurityConfigurerAdapter {
//
//
//        @Override
//        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//            auth.inMemoryAuthentication()
//                    .withUser("javainuse")
//                    .password(passwordEncoder().encode("javainuse"))
//                    .authorities("ADMIN");
//        }
//    }

    @Order(2)
    @Configuration
    public static class WebConfiguration extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.exceptionHandling().accessDeniedPage("/");
            http.csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/")
                    .permitAll()
                    .antMatchers("/auth/exec").permitAll()


                    .and()
                    .logout()
                    .permitAll()
                    .and()
                    .headers().frameOptions().sameOrigin()
                    .and()
                    .authorizeRequests().antMatchers("/**").authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/")
                    .successForwardUrl("/index")
                    .permitAll();

//            http.authorizeRequests().antMatchers("/admin/**").hasAnyRole("ADMIN");

        }

        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers(HttpMethod.GET,
                    "/css/**",
                    "/scripts/**",
                    "/imgs/**");
        }
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
