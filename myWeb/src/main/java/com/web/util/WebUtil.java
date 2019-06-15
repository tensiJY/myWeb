package com.web.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebUtil {

	private static final Logger logger = LoggerFactory.getLogger(WebUtil.class);
	
	/**
	 * 접속한 ip를 가져옮
	 * @param request
	 * @return
	 	Run -> Run Configurations
		Tomcat v버젼 server at local -> arguments 
		VM arguments 의 마지막 부분에 추가
		-Djava.net.preferIPv4Stack=true
		적용후 실행
	 */
	public static String getUserIP(HttpServletRequest request) {

		String ip = request.getHeader("X-FORWARDED-FOR");

		if (ip == null) {
			ip = request.getHeader("Proxy-Client-IP");
			//logger.info("TEST : Proxy-Client-IP : " + ip);
		}

		if (ip == null) {
			ip = request.getHeader("WL-Proxy-Client-IP");
			//logger.info("TEST : WL-Proxy-Client-IP : " + ip);
		}

		if (ip == null) {
			ip = request.getHeader("HTTP_CLIENT_IP");
			//logger.info("TEST : HTTP_CLIENT_IP : " + ip);
		}

		if (ip == null) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
			//logger.info("TEST : HTTP_X_FORWARDED_FOR : " + ip);
		}

		if (ip == null) {
			ip = request.getRemoteAddr();
		}
		
		return ip;

	}
	
	public static String getId(HttpSession session, String sessionId){
		return (String)session.getAttribute("sessionId");		
	}
	
	public static boolean idIsNull(HttpSession session, String sessionId){
		
		String id = (String)session.getAttribute(sessionId);
		
		if(id==null){
			return true;
		}else{
			return false;
		}
	}
	
	
//	public static String getCurrentEnvironmentNetworkIp(){
//
//        Enumeration netInterfaces = null;
//        try {
//            netInterfaces = NetworkInterface.getNetworkInterfaces();
//        } catch (SocketException e) {
//            return getLocalIp();
//        }
//
//        while (netInterfaces.hasMoreElements()) {
//            NetworkInterface ni = (NetworkInterface)netInterfaces.nextElement();
//            Enumeration address = ni.getInetAddresses();
//            if (address == null) {
//                return getLocalIp();
//            }
//            while (address.hasMoreElements()) {
//                InetAddress addr = (InetAddress)address.nextElement();
//                if (!addr.isLoopbackAddress() && !addr.isSiteLocalAddress() && !addr.isAnyLocalAddress() ) {
//                    String ip = addr.getHostAddress();
//                    if( ip.indexOf(".") != -1 && ip.indexOf(":") == -1 ){
//                        return ip;
//                    }
//                }
//            }
//        }
//        return getLocalIp();
//    }
//	
//
//    public static String getLocalIp(){
//        try {
//            return InetAddress.getLocalHost().getHostAddress();
//        } catch (UnknownHostException e) {
//            return null;
//        }
//    }




}//
