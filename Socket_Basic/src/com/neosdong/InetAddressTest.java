package com.neosdong;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


/**
 * Get host info by java InetAddress
 * 20150302
 * @author leon
 *
 */
public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("HostName:"+inetAddress.getHostName());
		System.out.println("HostAddress:"+inetAddress.getHostAddress());
		byte[] bytes = inetAddress.getAddress();
		System.out.println("bytes type address:"+Arrays.toString(bytes));
		System.out.println(inetAddress);
	}
}
