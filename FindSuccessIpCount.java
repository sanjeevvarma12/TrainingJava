package com.SampleJavaProject;

//Java program to count the no. of IP address  
//count for successful http response 200 code. 
import java.io.*; 
import java.util.*; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

class FindSuccessIpCount { 

 public static void findSuccessIpCount(String record) 
 { 
     // Creating a regular expression for the records 
     final String regex = "^(\\S+) (\\S+) (\\S+) " +  
            "\\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(\\S+)" +  
            " (\\S+)\\s*(\\S+)?\\s*\" (\\d{3}) (\\S+)"; 

     final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE); 
     final Matcher matcher = pattern.matcher(record); 

     // Creating a Hashmap containing string as 
     // the key and integer as the value. 
     HashMap<String, Integer> countIP = new HashMap<String, Integer>(); 
     while (matcher.find()) { 

         String IP = matcher.group(1); 
         String Response = matcher.group(8); 
         int response = Integer.parseInt(Response); 

         // Inserting the IP addresses in the  
         // HashMap and maintaining the frequency  
         // for each HTTP 200 code. 
         if (response == 200) { 
             if (countIP.containsKey(IP)) { 
                 countIP.put(IP, countIP.get(IP) + 1); 
             } 
             else { 
                 countIP.put(IP, 1); 
             } 
         } 
     } 

     // Printing the hashmap 
     int a = 0;
     String b = null;
     for (Map.Entry entry : countIP.entrySet()) {
    	 a=(int) entry.getValue();
    	 b=(String) entry.getKey();
         System.out.println(entry.getKey() + " " + entry.getValue()); 
         if(a>(int)entry.getValue()) {
        	 a=(int) entry.getValue();
         }
         
     }
     System.out.println("the most occurred IP value is:"+b+" Occurred "+a+" times");
     
 } 
 public static void main(String[] args) 
 { 
     final String log = "123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/wpaper.gif HTTP/1.0\" 200 6248 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                        + "123.123.123.123 - - [26/Apr/2000:00:23:47 -0400] \"GET /asctortf/ HTTP/1.0\" 200 8130 \"http:// search.netscape.com/Computers/Data_Formats/Document/Text/RTF\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                        + "123.123.123.124 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/5star2000.gif HTTP/1.0\" 200 4005 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                        + "123.123.123.123 - - [26/Apr/2000:00:23:50 -0400] \"GET /pics/5star.gif HTTP/1.0\" 404 1031 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                        + "123.123.123.126 - - [26/Apr/2000:00:23:51 -0400] \"GET /pics/a2hlogo.jpg HTTP/1.0\" 200 4282 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                        + "123.123.123.123 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"; 

     findSuccessIpCount(log); 
 } 
}