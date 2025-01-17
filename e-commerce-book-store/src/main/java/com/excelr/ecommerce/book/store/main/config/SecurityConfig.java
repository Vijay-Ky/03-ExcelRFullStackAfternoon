
package com.excelr.ecommerce.book.store.main.config;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Autowired
    private UserDetailsService userSecurityService; // Changed type to UserDetailsService

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Removed static final modifier
    }

    private static final String[] PUBLIC_MATCHERS = {
            "/css/**",
            "/js/**",
            "/image/**",
            "/",
            "/newUser",
            "/forgetPassword",
            "/login",
            "/fonts/**",
            "/bookshelf",
            "/bookDetail",
            "/faq",
            "/searchByCategory",
            "/searchBook"
    };

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers(PUBLIC_MATCHERS).permitAll();
//                .httpBasicWithDefaults().authenticationEntryPoint(authenticationEntryPoint())
//                .and()
//                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/?logout").deleteCookies("remember-me").permitAll()
//                .and()
//                .rememberMe()
//                .and().cors().disable();

    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
    }
}













//package com.excelr.ecommerce.book.store.main.config;
//import com.excelr.ecommerce.book.store.main.daoimpl.UserSecurityService;
//import com.excelr.ecommerce.book.store.main.utility.SecurityUtility;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled=true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private Environment env;
//
//    @Autowired
//    private UserSecurityService userSecurityService;
//
//    private BCryptPasswordEncoder passwordEncoder() {
//        return SecurityUtility.passwordEncoder();
//    }
//
//    private static final String[] PUBLIC_MATCHERS = {
//            "/css/**",
//            "/js/**",
//            "/image/**",
//            "/",
//            "/newUser",
//            "/forgetPassword",
//            "/login",
//            "/fonts/**",
//            "/bookshelf",
//            "/bookDetail",
//            "/faq",
//            "/searchByCategory",
//            "/searchBook"
//    };
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests().
//                /*	antMatchers("/**").*/
//                        antMatchers(PUBLIC_MATCHERS).
//                permitAll().anyRequest().authenticated();
//
//        http
//                .csrf().disable().cors().disable()
//                .formLogin().failureUrl("/login?error")
//                /*.defaultSuccessUrl("/")*/
//                .loginPage("/login").permitAll()
//                .and()
//                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/?logout").deleteCookies("remember-me").permitAll()
//                .and()
//                .rememberMe();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
//    }
//
//}
