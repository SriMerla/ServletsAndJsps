package com.practiselab.java;

public class JobSeeksDetails {
	
	public boolean validateUserName(String userName){
		int len = userName.length();
		String subStr = userName.substring(len-4, len);
		int count = 0;
		boolean flag = false;
		
		if(subStr.equals("_job")){
			
			int strlen = len-4;
			if(strlen >= 8 ){
				flag = true;
			}
			/*for(int i =0; i<len-4; i++){
			 count++;
			}
			if(count >= 8){
				
				flag = true;
			}*/
		}
		else{
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		JobSeeksDetails job = new JobSeeksDetails();
		System.out.println(job.validateUserName("SriMerla_job"));

	}

}
