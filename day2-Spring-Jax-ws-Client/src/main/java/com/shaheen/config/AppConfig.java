package com.shaheen.config;

import com.shaheen.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@ComponentScan(basePackages = "com.shaheen")
public class AppConfig {
   
    @Bean
    public JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean() {
         // if the conction over https (ssl) call this method 
        //enableSssl();
        JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean = new JaxWsPortProxyFactoryBean();
        jaxWsPortProxyFactoryBean.setServiceInterface(UserService.class);
        try {
            jaxWsPortProxyFactoryBean.setWsdlDocumentUrl(new URL("http://localhost:8088/Spring-jax-ws/remote/UserService?wsdl"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        jaxWsPortProxyFactoryBean.setServiceName("UserControllerService");
        jaxWsPortProxyFactoryBean.setPortName("UserServicePort");
        return jaxWsPortProxyFactoryBean;
    }

    //https://stackoverflow.com/questions/6047996/ignore-self-signed-ssl-cert-using-jersey-client
    /*
    private void enableSssl(){
    // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
            public X509Certificate[] getAcceptedIssuers(){return null;}
            public void checkClientTrusted(X509Certificate[] certs, String authType){}
            public void checkServerTrusted(X509Certificate[] certs, String authType){}
        }};

        // Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            ;
        }
    
    }
    */
}
