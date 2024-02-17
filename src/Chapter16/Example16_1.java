package Chapter16;

import java.net.*;
import java.util.*;

public class Example16_1 {
	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			// 도메인명을 이용하여 InetAddress 객체 생성
			ip = InetAddress.getByName("www.naver.com");
			
			// 도메인명으로부터 얻은 IP 주소의 정보 출력
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() : " + ip.toString());
			
			// IP 주소를 byte 배열로 얻어와 출력
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			
			// byte 배열을 이용하여 IP 주소를 정수로 출력
			String result = "";
			for(int i = 0; i < ipAddr.length; i++)
				result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i]) + ".";
			System.out.println("getAddress() + 256 : " + result);
			System.out.println();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			// 현재 호스트의 InetAddress 객체 생성
			ip = InetAddress.getLocalHost();
			
			// 현재 호스트의 IP 주소 정보 출력
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			// 도메인명으로부터 여러 개의 InetAddress 객체 생성
			ipArr = InetAddress.getAllByName("www.naver.com");
			
			// 여러 개의 IP 주소 정보 출력
			for(int i = 0; i < ipArr.length; i++)
				System.out.println("ipArr[" + i + "] :" + ipArr[i]);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}  // main
}