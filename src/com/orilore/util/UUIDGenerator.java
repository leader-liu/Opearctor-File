package com.orilore.util;

import java.util.UUID;

public class UUIDGenerator {
		public static String getUUID(){
			return UUID.randomUUID().toString().replace("-","");
		}
		public static void main(String[] args) {
			String uuid=UUIDGenerator.getUUID();
			System.out.println(uuid);
		}
}
