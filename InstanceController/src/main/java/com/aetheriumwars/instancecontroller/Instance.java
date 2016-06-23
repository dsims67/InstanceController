package com.aetheriumwars.instancecontroller;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.ec2.AmazonEC2Client;

public class Instance {
//will represent a single mc server instance of a particular type
//instance types will be defined in a configuration file
	private AmazonEC2Client ec2Client;
	
	public Instance() {
		//retrieve the credentials
		AWSCredentials credentials = new PropertiesCredentials(
		         AwsConsoleApp.class.getResourceAsStream("AwsCredentials.properties"));
		
		ec2Client = new AmazonEC2Client(credentials);
		ec2Client.
	}
}
